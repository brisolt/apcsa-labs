/*
Honor Statement
Brian Soltani, I have not given  nor recieved any unauthorized aid on this assignment.

*/

import java.util.*;
import java.io.*;

public class MCQuestion extends Question
{
   private static int correctChoice;
   private static String ans;
   private static String[] choices = new String[3];
   private static String line;
   private static Scanner input = new Scanner(System.in);
   
   public MCQuestion(String type, String[] choices, int correctChoice)
   {
      super(type);
      this.choices = choices;
      this.correctChoice = correctChoice;
   }
   
   public static void showQuest(int num)
   {
         
      if (!(CSVHandler.getCategory(num).equals("Category"))) // prevents headers from showing up as questions
      {
      
         System.out.println("MCQ");
         line = CSVHandler.getChoices(num);
         choices = line.split("~", 5);
         
         System.out.println(CSVHandler.getQuestion(num) + "\n");
         for (int k = 1 ; k < choices.length + 1 ; k++)
         {
            System.out.print(k + " : " + choices[k - 1] + "\n");
         }
         System.out.println("\nPlease select the choice of answer listed on the left of the colon");
         // ans = input.nextLine();
         for (int i = 0 ; i < choices.length ; i++)
         {
            if (choices[i].equals(CSVHandler.getAnswer(num)))
            {
               correctChoice = i + 1;
            }
         }
         
         MCQuestion quest = new MCQuestion("MCQ", choices, correctChoice);
      
      }
      
   }
   
   public static boolean checkAnswer(String answer)
   {
      if (answer.equals("" + correctChoice))
      {
         return true;
      }
      return false; 
   }

   // public static void main(String[] args)
//    {
//    
//       CSVHandler.load();
//       
//       MCQuestion quest = new MCQuestion("MCQ", choices, correctChoice);
//       CSVHandler.load();
//       showQuest(2);
//       if (checkAnswer(ans))
//          System.out.println("Correct");
//       else
//          System.out.println("Incorrect");
//    
//    }

}