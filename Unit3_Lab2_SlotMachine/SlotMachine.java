public class SlotMachine
{

   private int cost, multiplier;
   private boolean hit3, hit2;
   SlotReel slotOne = new SlotReel();
   SlotReel slotTwo = new SlotReel();
   SlotReel slotThree = new SlotReel();
   
   public SlotMachine(int money)
   {
   
      cost = money;
      multiplier = money / 5;
   
   }


   public void pull()
   {
   
      slotOne.getSpin();
      slotTwo.getSpin();
      slotThree.getSpin();
   
   }
   
   public boolean checkHitThree()
   {
   
      if (slotOne.getItem() != "horseshoe" && slotOne.getItem() != "star" && slotOne.getItem() == slotTwo.getItem() && slotOne.getItem() == slotThree.getItem())
      {
      
         return true;
      
      }
      return false;
   
   }
   
   public boolean checkHitTwo()
   {
   
      if (slotOne.getItem() == "horseshoe" && slotOne.getItem() == slotTwo.getItem())
      {
      
         return true;
      
      }
      return false;
   
   }

   public int getCost()
   {
   
      return cost;
   
   }
   
   public int getMultiplier()
   {
   
      if (checkHitThree())
      {
         if (slotOne.getItem() == "spade")
         {
         
            multiplier *= 20;
         
         }
         else if (slotOne.getItem() == "diamond")
         {
         
            multiplier *= 30;
         
         }
         else if (slotOne.getItem() == "heart")
         {
         
            multiplier *= 40;
         
         }
         else if (slotOne.getItem() == "liberty bell")
         {
         
            multiplier *= 50;
         
         }
         else
         {
         
            checkHitTwo();
            if (checkHitTwo() && slotThree.getItem() == "star")
            {
            
               multiplier *= 10;
            
            }
            else if (checkHitTwo())
            {
            
               multiplier *= 5;
            
            }
            else
            {
            
               multiplier *= 0;
            
            }
         
         }
      }
      return multiplier;
   
   }
   
   
   
   @Override
   public String toString()
   {
   
      return SlotReel.getSpin() + ": " + SlotReel.getItem();
   
   }

}