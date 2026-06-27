/*

on my honor as a student i havent given nor recieved unauthorized aid on this assignment
brian soltaninini

*/

public class Client
{
   public static void main(String [] args){
      Player p1 = new Player("Joseph");
      Player p2 = new Player("Bobby");
      int gain = SpinnerClass.getSpin();
      int p1Tree = p1.getTreeCherries();
      int p1Bucket = p1.getBucketCherries();
      int p2Tree = p2.getTreeCherries();
      int p2Bucket = p2.getBucketCherries();
            
      while (!(p1.hasWon() || p2.hasWon()))
      {
         
         p1.result();
         System.out.println(p1.toString());
         if (p1.hasWon())
      {
         System.out.println(p1.getName() + " wins!");
      }
      else if (p2.hasWon())
      {
         System.out.println(p2.getName() + " wins!");
      }
      else
      {
         p2.result();
         System.out.println(p2.toString());
      }
      }
     
     if (p2.hasWon())
      {
         System.out.println(p2.getName() + " wins!");
      }
      
   }
   
}