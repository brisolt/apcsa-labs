/* I have neither given nor recieved aid on this assignment: Brian Soltani
I used this for the "parse" method https://www.geeksforgeeks.org/double-parsedouble-method-in-java-with-examples/ */

import java.util.*;
public abstract class HighSchool implements Gradeable
{
   static ArrayList<Double> records = new ArrayList<Double>();
   private int number = 0;
   private static double newGrade = 0;  
   
   public static void updateGrade()
   {
 
      newGrade = (Math.random() * 100) + 31;
      records.add(newGrade);            
   }
   
   public static String getNewGrade()
   {
      return ""+ newGrade;
   }
   
   public String getScore()
   {
         
      String averagee = "";
      double avg = 0.0;
      for (int i = 0; i < records.size() ; i++)
      {
         avg += records.get(i);
      }
      avg = avg/records.size();
      averagee = "" + avg;
      return averagee;
            
   }
   
   public boolean isPassing(String student)
   {
         
      double score = Double.parseDouble(getScore());
      boolean truefalse = false;
      if (score >= 63.5)
      {
         truefalse = true;
      }
      return truefalse;
            
   }
         
}