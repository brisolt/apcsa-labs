/*
Honor Statement
Brian Soltani, I have not given  nor recieved any unauthorized aid on this assignment.

*/

import java.util.*;
import java.io.*;

public class FRQuestion extends Question
{
   private static String correctAnswer;
   private static String ans;
   private static String line;
   private static Scanner input = new Scanner(System.in);
   
   public FRQuestion(String type, String correctAnswer)
   {
      super(type);
      this.correctAnswer = correctAnswer;
   }
   
   public static void showQuest(int num)
   {
      System.out.println("FRQ");
      
      correctAnswer = CSVHandler.getAnswer(num);
      System.out.println(CSVHandler.getQuestion(num));
      System.out.println("\nPlease type you response");
      // ans = input.nextLine();
      
      FRQuestion quest = new FRQuestion("FRQ", correctAnswer);
      
   }
   
   public static void flash(int num)
   {
      System.out.println("Flashcards");
      System.out.println(CSVHandler.getQuestion(num));
   }
   
   public static boolean checkAnswer(String answer)
   {
      if (answer.equals("" + correctAnswer))
      {
         return true;
      }
      return false; 
   }

   // public static void main(String[] args)
//    {
//       CSVHandler.load();
//    
//       FRQuestion quest = new FRQuestion("FRQ", correctAnswer);
//       CSVHandler.load();
//       showQuest(2);
//       if (checkAnswer(ans))
//          System.out.println("Correct");
//       else
//          System.out.println("Incorrect");
//    }

}