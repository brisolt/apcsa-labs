/*

on my honor as a student i havent given nor recieved unauthorized aid on this assignment
brian soltani

*/

public class SpinnerClass
{

   private static String message = "";
   private static int spin;
   
   
   public static int getSpin()
   {
      int roll = (int) (Math.random() * 7) + 1;
      if (roll == 1)
      {
         message = "Take 1 cherry from the tree.";
         spin = 1;
      }
      else if (roll == 2)
      {
         message = "Take 2 cherries from the tree.";
         spin = 2;
      }
      else if (roll == 3)
      {
         message = "Take 3 cherries from the tree.";
         spin = 3;
      }
      else if (roll == 4)
      {  
         message = "Take 4 cherries from the tree.";
         spin = 4;
      }
      else if (roll == 5)
      {
         message = "Oh no, a dog has come and eaten some of your cherries. Put 3 cherries back on your tree";
         spin = -3;
      }
      else if (roll == 6)
      {
         message = "Oh no, a bird has come and eaten some of your cherries. Put 2 cherries back on your tree";
         spin = -2;
      }
      else if (roll == 7)
      {
         message = "Oh no, your basket spilled! Put all of your cherries back on your tree";
         spin = -10;
      }
      return spin;
   }
   
   public static String getMessage()
   {
      return message;
   }

   
} // EO spinner class