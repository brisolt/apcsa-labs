/*

on my honor as a student i havent given nor recieved unauthorized aid on this assignment
brian soltani

*/

public class Player
{
   
   private String name = "";
   private int treeCherries = 10;
   private int bucketCherries = 0;
   
   public Player(String name)
   {
      this.name = name;
      treeCherries = 10;
      bucketCherries = 0;
   }
   
   public String getName()
   {
      return name;
   }
   
   public int getTreeCherries()
   {
      return treeCherries;
   }
   
   public int getBucketCherries()
   {
      return bucketCherries;
   }
   
   public boolean hasWon()
   {
      if (bucketCherries == 10)
      {
         return true;
      }
      return false;
   }
   
   public void result()
   {
      int cherriesWon = SpinnerClass.getSpin();
      
      bucketCherries += cherriesWon;
      treeCherries -= cherriesWon;
   
      if (bucketCherries < 0)
      {
         bucketCherries = 0;
      }
      
      if (bucketCherries > 10)
      {
         bucketCherries = 10;
      }
      
      if (treeCherries < 0)
      {
         treeCherries = 0;
      }
      
      if (treeCherries > 10)
      {
         treeCherries = 10;
      }
   }
    
   
   @Override
   public String toString()
   {
      return "\n" + name + " spins: " + SpinnerClass.getMessage() + "\nTree cherries: " + treeCherries + "\nBucket cherries " + bucketCherries; 
   }
   
}