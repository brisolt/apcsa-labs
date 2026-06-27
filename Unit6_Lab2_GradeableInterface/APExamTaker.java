/* I have neither given nor recieved aid on this assignment: Brian Soltani
I used this for the "parse" method https://www.geeksforgeeks.org/double-parsedouble-method-in-java-with-examples/ */

import java.util.*;
public abstract class APExamTaker implements Gradeable
{
   
   private static int rawScore = (int) (Math.random() * 5) + 1;
   public void updateGrade()
   {
      rawScore = (int) (Math.random() * 5) + 1;
   }
      
   public static String getScore()
   {
      return "" + rawScore;
   }
      
   public static boolean isPassing()
   {
      if (rawScore > 2)
      {
         return true;
      }
      return false;
   }
   
   public static void main(String arg[])
   {
      System.out.println(rawScore);
   }  
   
}
