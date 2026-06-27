/* I have neither given nor recieved aid on this assignment: Brian Soltani
I used this for the "parse" method https://www.geeksforgeeks.org/double-parsedouble-method-in-java-with-examples/ */

import java.util.*;
public abstract class DriversPermitStudent implements Gradeable
{
   private int score = 30;
   public void updateGrade()
   {
      score = (int) (Math.random() * 30) + 1;
   }
      
   public String getScore()
   {     
      return "" + score/100.00 + "%";
   }
      
   public boolean isPassing()
   {
      if (score >= 24)
      {
         return true;
      }
      return false;
   }
}
