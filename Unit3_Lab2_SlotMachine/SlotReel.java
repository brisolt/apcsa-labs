public class SlotReel
{

   private static int spin;
   private static String item = "";
   
   public static int getSpin()
   {
   
      int roll = (int) (Math.random() * 6) + 1;
      if (roll == 1)
      {
      
         item = "diamond";
         spin = 1;
         
      }
      else if (roll == 2)
      {
      
         item = "heart";
         spin = 2;
      
      }
      else if (roll == 3)
      {
      
         item = "spade";
         spin = 3;
      
      }
      else if (roll == 4)
      {
      
         item = "horseshoe";
         spin = 4;
      
      }
      else if (roll == 5)
      {
      
         item = "star";
         spin = 5;
      
      }
      else if (roll == 6)
      {
      
         item = "liberty bell";
         spin = 6;
      
      }

   return spin;
   
   }
   
   public static String getItem()
   {
   
      return item;
   
   }
   
    public boolean equals()
   {    
   
      getSpin();
      String check = item;
      getSpin();
      if (check.equals(item))
      {
      
         return true;
      
      }
      return false;
     
   }
   
   @Override
   public String toString()
   {
   
      return spin + ": " + item;
   
   }

}