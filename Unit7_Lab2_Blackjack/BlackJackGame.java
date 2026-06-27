// Brian Soltani - I haven't given nor recieved unauthorized aid on this assignment

import java.util.*;
/**
 * The BlackJackGame class simulates a dealer vs. player game of 21 Blackjack. The dealer stands at 18 or higher.
 * Betting is not included in this game.
 * @author Kimberly A. Baram
 * @version 1.0
 */

public class BlackJackGame{

   private Deck deck = new Deck();
   private BlackJackPlayer player = new BlackJackPlayer("Joe");
   private BlackJackPlayer dealer = new BlackJackPlayer("Dealer");
   private static Scanner in = new Scanner(System.in);
   
   /**
    * Simulates end of round; both player and dealer return all cards to the deck.
    */
   public void returnCards(){
      player.returnToDeck(deck);
      dealer.returnToDeck(deck);
   }
   
   /**
    * Opens a new round. Gives the player and dealer each two cards, alternating deal order.
    */
   public void dealFirstCards(){
      player.hit(deck);
      dealer.hit(deck);
      player.hit(deck);
      dealer.hit(deck);
   }
   
   /**
    * Simulates one round of 21 Blackjack
    */
   public void play(){
      deck.shuffle();
      dealFirstCards();
      if (dealer.getValue() > 21){
         dealer.reduceAce();
      }
      boolean hitting = true;
      
      //Keep dealing cards to player until the player chooses to stand.
      while (hitting){
      
         //Hide dealer's second card; show all of player's active cards.      
         System.out.println("Dealer's cards:\n" + dealer.getFirstCard() + "\n(Hidden)\n");
         System.out.println(player + "\n");
         
         char choice = ' ';
         //Error check for hit or stand
         while (choice != 'H' && choice != 'S' && choice != 'h' && choice != 's'){
            System.out.println("Enter H to hit, or S to stand");
            choice = in.nextLine().trim().charAt(0);
            if (choice == 's' || choice == 'S'){
               hitting = false;
            }
         }
         if (hitting){
            player.hit(deck);
         }
         
         //Player drew over 21; attempt to reduce an ace. If an ace is reduced game continues; otherwise player loses.
         if (player.busted()){
            if (player.reduceAce() == false){
               System.out.println(dealer);
               System.out.println(player);
               System.out.println(player.getName() + " busts. Game Over!");
               returnCards();
               return;
            }
         }
      }
      
      //Player chooses to stand
      System.out.println(player.getName() + " stands at " + player.getValue() + "\n");
      System.out.println(dealer);
      System.out.println(player);
      
      //Dealer hits until 18 or higher is reached.
      while (dealer.getValue() < 18){
         System.out.println("Dealer hits.\n");
         dealer.hit(deck);
      
         //If dealer draws over 21, attempt to reduce an ace.
         if (dealer.busted()){
            if (dealer.reduceAce() == false){
               System.out.println(dealer);
               System.out.println(player);
               System.out.println("Dealer busts. You win!");
               returnCards();
               return;
            }
         }
         System.out.println(dealer);
         System.out.println(player);
      }
      
      //Check for winner or tie
      if (player.compareTo(dealer) > 0){
         System.out.println("You win!");
      }
      else if (player.compareTo(dealer) < 0){
         System.out.println("Dealer wins.");
      }
      else{
         System.out.println("Push.");
      }
      returnCards();
   }
   
   public static void main(String[] args){
      BlackJackGame game = new BlackJackGame();
   
      System.out.println("Welcome to Blackjack!");
      System.out.println("*********************\n");
      boolean playing = true;
      
      //Continue playing rounds until player decides not to play again
      while (playing){
         game.play();
         
         char choice = ' ';
         
         //Error check for yes or no response
         while (choice != 'Y' && choice != 'N' && choice != 'y' && choice != 'n'){
            System.out.println("Would you like to play again? Y/N");
            choice = in.nextLine().trim().charAt(0);
            if (choice == 'n' || choice == 'N'){
               playing = false;
            }
         }
         System.out.println();
      }
      System.out.println("Good-bye!");
   }
}