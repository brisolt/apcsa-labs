public class Player
{

   private static int money;
   private String name;
   
   public Player(String name)
   {
   
      this.name = name;
      money = 100;
   
   }
   
   public static int getMoney()
   {
   
      return money;
   
   }
   
   public String getName()
   {
   
      return name;
   
   }
   
   public void setMoney(int dollars)
   {
   
      money = dollars;
   
   }
   
   @Override
   public String toString()
   {
   
      return name + ", you have " + money + " tokens remaining.";
   
   }

}