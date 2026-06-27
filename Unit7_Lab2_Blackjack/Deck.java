s// Brian Soltani - I haven't given nor recieved unauthorized aid on this assignment

public class Deck
{

   ArrayList<Card> deck = new ArrayList<>();
   
   public void instanCards()
   {
   
      for (int i = 0 ; i < 52 ; i++)
      {
         for (int h = 2 ; h <= 10 ; j++) // Inst. Hearts Start
         {
            deck.add(Integer.toString(h), h, "Hearts");
         }
         deck.add("Jack", 10, "Hearts");
         deck.add("Queen", 10, "Hearts");
         deck.add("King", 10, "Hearts");
         deck.add("Ace", 11, "Hearts"); // Inst. Hearts End
   
   
         
         for (int d = 2 ; d <= 10 ; d++) // Inst. Dia Start
         {
            deck.add(Integer.toString(d), d, "Diamonds");
         }
         deck.add("Jack", 10, "Diamonds");
         deck.add("Queen", 10, "Diamonds");
         deck.add("King", 10, "Diamonds");
         deck.add("Ace", 11, "Diamonds"); // Inst. Dia End
         
         for (int c = 2 ; c <= 10 ; c++) // Inst. Club Start
         {
            deck.add(Integer.toString(c), c, "Clubs");
         }
         deck.add("Jack", 10, "Clubs");
         deck.add("Queen", 10, "Clubs");
         deck.add("King", 10, "Clubs");
         deck.add("Ace", 11, "Clubs"); // Inst. Club End
         
         for (int s = 2 ; s <= 10 ; c++) // Inst. Spade Start
         {
            deck.add(Integer.toString(s), s, "Clubs");
         }
         deck.add("Jack", 10, "Spades");
         deck.add("Queen", 10, "Spades");
         deck.add("King", 10, "Spades");
         deck.add("Ace", 11, "Spades"); // Inst. Spade End
      }
      
      public void shuffle()
      {
         int cutsNum = (int) (Math.random() * 3) + 2;;
         int twoCuts = (int) (Math.random() * 10) + 21;
         int threeCuts = (int) (Math.random() * 4) + 6;
         int fourCuts = (int) (Math.random() * 4) + 4;
         int check = 0;
         
         if (cutsNum == 2)
         {
            ArrayList<Card> cutOne = new ArrayList<>();
            ArrayList<Card> cutTwo = new ArrayList<>();
            
            for (int i = 0 ; i <= twoCuts ; i++)
            {
               cutOne.add(deck.get(i));
            }
            for (int i = twoCuts + 1 ; i <= 52 - twoCuts ; i++)
            {
               cutTwo.add(deck.get(i));
            }
            
         }
         else if (cutNums == 3)
         {
            ArrayList<Card> cutOne = new ArrayList<>();
            ArrayList<Card> cutTwo = new ArrayList<>();
            ArrayList<Card> cutThree = new ArrayList<>();
            ArrayList<Card> cutFour = new ArrayList<>();
            ArrayList<Card> cutFive = new ArrayList<>();
            ArrayList<Card> cutSix = new ArrayList<>();
            
            for (int i = 0 ; i < threeCuts ; i++)
            {
               cutOne.add(deck.get(i));
            }
            check += threeCuts;
            threeCuts = (int) (Math.random() * 4) + 6;
            
            for (int i = 0 ; i < threeCuts ; i++)
            {
               cutTwo.add(deck.get(i));
            }
            check += threeCuts;
            threeCuts = (int) (Math.random() * 4) + 6;
            
            for (int i = 0 ; i < threeCuts ; i++)
            {
               cutThree.add(deck.get(i));            
            }
            
         }
         else
         {
            ArrayList<Card> cutOne = new ArrayList<>();
            ArrayList<Card> cutTwo = new ArrayList<>();
            ArrayList<Card> cutThree = new ArrayList<>();
            ArrayList<Card> cutFour = new ArrayList<>();
            ArrayList<Card> cutFive = new ArrayList<>();
            ArrayList<Card> cutSix = new ArrayList<>();
            ArrayList<Card> cutSeven = new ArrayList<>();
            ArrayList<Card> cutEight = new ArrayList<>();
         }
         
         
         
      }
      
   }
   

}