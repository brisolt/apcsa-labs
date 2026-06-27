/*
*
On my honor as a studenet, I have neither given nor recieved unauthorized aid on this assessment.
Sources for String format: https://www.youtube.com/watch?v=hjsTu8300vg&ab_channel=Appficial (provided video), https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
*
*/
import java.util.*;
public class MadLibs
{
   
   public static void main(String[] args)
   {
   
      System.out.println("Welcome to Mad Libs! \nMad Libs is a template word game in which the player prompts others for a list of words that are substituted for blanks to fill in a story.\nThe intent is to create a product that may be comical or nonsensical in tone.");
      System.out.println("\nThe prompt of this MADLIB is... \nChinggis Khan's rule in the Mongolian empire.");
      System.out.println("\nGive a one-word ADJECTIVE");
      Scanner input = new Scanner(System.in);
      String put1 = input.nextLine();
      System.out.println("Give a NOUN or PROPER NOUN");
      String put2 = input.nextLine();
      System.out.println("Give a name, FIRST and LAST");
      String put3 = input.nextLine();
      int spaceIndex = put3.indexOf(" ");
      String put3Changed = put3.substring(0, 1) + put3.substring(spaceIndex + 1, spaceIndex + 2);
      System.out.println("Give a NOUN or PROPER NOUN");
      String put4 = input.nextLine();
      System.out.println("Give an INTEGER NUMBER");
      int put5 = (int) input.nextInt();
      System.out.println("Give a DECIMAL NUMBER");
      double put6 = (double) input.nextDouble();
      String nothing = input.nextLine();
      System.out.println("Give an emotion");
      String put7 = input.nextLine();
      System.out.println("Give a GROUP OF PEOPLE");
      String put8 = input.nextLine();
      System.out.println("Give an INTEGER NUMBER");
      int put9 = (int) input.nextInt();
      System.out.println("Give an INTEGER NUMBER");
      int put10 = (int) input.nextInt();
      System.out.println("Give an INTEGER NUMBER");
      int put11 = (int) input.nextInt();
      double put12 = (((double) put9/put10) / (put11));
      System.out.println("Let's see what you cooked up! \n\n");
      double killed = (double) put10/put9;
      
      
      System.out.printf("Chinggis Khan was the %s Khan of the %s empire. His birth name was %s, also known as Little %s to his close friends. He was the ruler of the %s empire for %d years! \nHe conqerored about %.2f percent of the continent of Asia. Chinggis Khan invoked %s in the hearts of his %s. \nHis armies consisted of over %d soliders and as many as %d of people were killed by his armies. That means each of his men killed approximately %.1f people! \nThe reaches of his empire boasted around %d people. This means that over %.2f percent of people were killed.", put1.toUpperCase(), put2.toUpperCase(), put3.toUpperCase(), put3Changed.toUpperCase(), put4.toUpperCase(), put5, put6, put7.toUpperCase(), put8.toUpperCase(), put9, put10, killed, put11, put12);

   }

}