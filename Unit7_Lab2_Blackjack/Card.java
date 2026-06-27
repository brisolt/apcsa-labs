s// Brian Soltani - I haven't given nor recieved unauthorized aid on this assignment

public class Card
{

   private String name = "";
   private int value;
   private String suit = "";
   
   public Card(String name, int value, String suit)
   {
      this.name = name;
      this.value = value;
      this.suit = suit;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getValue()
   {
      return value;
   }
   
   public String getSuit()
   {
      return suit;
   }
   
   public void presentBust()
   {
      if (name.equals("Ace"))
      {
         value = 1;
      }   
   }
   
   

}