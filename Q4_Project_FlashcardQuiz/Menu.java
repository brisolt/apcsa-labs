/*
Honor Statement
Brian Soltani, I have not given  nor recieved any unauthorized aid on this assignment.

*/

import java.util.*;
import java.io.*;

public class Menu
{

   static Scanner input = new Scanner(System.in);
   static int c = 0;
   static String[] cats;
   static String[] diffs;
   static String selCat = "A";
   static String selDiff = "A";
   static boolean isTesting = false;

   public static void typeSel()
   {
      selCat = menuArraySel(cats);
      
      selDiff = menuArraySel(diffs);
      
      if (selCat.equals("1"))
         selCat = cats[0];
      if (selCat.equals("2"))
         selCat = cats[1];
      if (selCat.equals("3"))
         selCat = cats[2];
      if (selCat.equals("4"))
         selCat = cats[3];

         
      if (selDiff.equals("1"))
         selDiff = diffs[0];
      if (selDiff.equals("2"))
         selDiff = diffs[1];

      
      CSVHandler.selectQs(selCat, selDiff);
      
      if (selCat.equals("A"))
         selCat = "All Categories";
      
      if (selDiff.equals("A"))
         selDiff = "All Difficulties";
      
      System.out.println("\nCategory Selected: " + selCat + "\nDifficulty Selected: " + selDiff);
      
   }
 
 
   public static String[] catsArr()
   {
   
      return cats;
   }
   
   public static String[] diffsArr()
   {
      return diffs;
   }
 
   public static String menuArraySel(String[] arr)
   {
      String imp = "";
      int num = arr.length + 1;
      do
      {
      
         try
         {
         
            for (int i = 0 ; i < arr.length ; i++)
            {
               System.out.println((i+1) + ". " + arr[i]);
            }
            System.out.println("A. For all");
         
            System.out.print("\nPlease select your desired option: ");
            
            imp = input.nextLine();
         
         
         }
         catch (Exception e)
         {
            System.out.println("Try again.");
         } // end catch
      
      } while (!(imp.equals("E") || imp.equals("A") || (Integer.valueOf(imp) > 0 && Integer.valueOf(imp) < num)));
      
      return imp;
      
   } // end of method

   public static void main(String[] args)
   {
   
      String line;
   
      do
      {
      
         System.out.println("\nWelcome to MyLearningBuddy");
         System.out.println("===========================");
         System.out.println("1. Learning");
         System.out.println("2. Testing");
         System.out.println("3. Flashcards");
         System.out.println("4. Review Results");
         System.out.println("5. Analysis");
         System.out.println("8. Select Question Type");
         System.out.println("9. Import Training Database");
         System.out.println("E. Exit");
         System.out.print("\nPlease select your desired option: ");
         
         line = input.nextLine();
         CSVHandler.shuffleSel();
         switch (line)
         {
            case "1":
               if (c > 0)
               {
                  isTesting = false;
                  driver.lol();
               }
               else
                  System.out.println("\n      data set has not been loaded");
                  
               break;
            case "2":
               if (c > 0)
               {
                  isTesting = true;
                  driver.lol();
               }
               else
                  System.out.println("\n      data set has not been loaded");
               break;
            case "3":
               Flashcards.flashcardPrint();
               break;
            case "4":
               Score.printTests();
               break;
            case "5":
               Score.analysis();
               break;
            case "8":
               if (c > 0)
               {
                  //   System.out.println("\nCategory Selected: " + selCat + "\nDifficulty Selected: " + selDiff);
                  typeSel();
               }
               else
                  System.out.println("\n      data set has not been loaded");
               break;
            case "9":
               CSVHandler.load();
               CSVHandler.selectQs(selCat, selDiff);
               c++;
               cats = CSVHandler.getDistinctCats();
               diffs = CSVHandler.getDistinctDiffs();
               System.out.println("\n      Data Set has successfully been loaded.");
               break;
            default:
               System.out.println("     YOU STUPID IDIOT. LISTEN TO WHAT I AM TELLING YOU.");
         }
      
      } 
      while (!(line.equals("E")));
   }
   
   public static boolean getTesting()
   {
      return isTesting;
   }
   

}