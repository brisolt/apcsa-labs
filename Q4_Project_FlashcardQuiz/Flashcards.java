/*
Honor Statement
Brian Soltani, I have not given  nor recieved any unauthorized aid on this assignment.

*/

import java.util.*;
import java.io.*;

public class Flashcards
{

   static String temp = "";
   static Scanner input = new Scanner(System.in);
   static int count = 0;
   static int j = 0;

   public static void flashcardPrint()
   {
      System.out.println("Flashcards\n");
      while (!(temp).equalsIgnoreCase("EXIT"))
      {
         System.out.println("*".repeat(CSVHandler.getQuestion(count).length() + 10) + "\n");
         System.out.print("*    "+" ".repeat(CSVHandler.getQuestion(count).length())+"    *\n");
         System.out.print("*    "+" ".repeat(CSVHandler.getQuestion(count).length())+"    *\n");
         System.out.print("*    "+CSVHandler.getQuestion(count)+"    *\n");
         System.out.print("*    "+" ".repeat(CSVHandler.getQuestion(count).length())+"    *\n");
         System.out.print("*    "+" ".repeat(CSVHandler.getQuestion(count).length())+"    *\n");
         System.out.println("*".repeat(CSVHandler.getQuestion(count).length() + 10) + "\n");
         System.out.println("Press \"F\" to flip the card or \"EXIT\" if you are done.");
         temp = input.nextLine();
         if ((temp).equalsIgnoreCase("EXIT"))
            return;
         if (temp.equals("F") && j == 0)
         {
            
            System.out.println("*".repeat(CSVHandler.getAnswer(count).length() + 10) + "\n");
            System.out.print("*    "+" ".repeat(CSVHandler.getAnswer(count).length())+"    *\n");
            System.out.print("*    "+" ".repeat(CSVHandler.getAnswer(count).length())+"    *\n");
            System.out.print("*    "+ (CSVHandler.getAnswer(count))+"    *\n");
            System.out.print("*    "+" ".repeat(CSVHandler.getAnswer(count).length())+"    *\n");
            System.out.print("*    "+" ".repeat(CSVHandler.getAnswer(count).length())+"    *\n");
            System.out.println("*".repeat(CSVHandler.getAnswer(count).length() + 10) + "\n");
            
            System.out.println("====================================\n");
         
               //System.out.println(CSVHandler.getAnswer(count) + "\n");
            j = 1;
         }
         else if (temp.equals("F") && j == 1)
         {
            j = 0;
            System.out.println("");
         }
         else if (!(temp.equals("F")))
            do 
            {
               System.out.println("Please type \"F\" for the next card or \"EXIT\" if you are done");
               temp = input.nextLine();
               if ((temp).equalsIgnoreCase("EXIT"))
                  return;
            
            } while ((!(temp.equals("F"))));
      
         count++;
            
         if (count >= CSVHandler.returnSelLength())
         {
            count = 0;
         }
      }
   
   }

}