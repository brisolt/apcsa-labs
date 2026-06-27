/*
Honor Statement
Brian Soltani, I have not given  nor recieved any unauthorized aid on this assignment.

*/


import java.util.*;
import java.io.*;

public class driver
{

   static ArrayList<String[]> record = new ArrayList<String[]>();
   static ArrayList<Score> current;
   
   //ArrayList<String[]>
   //-> String[question num, was correct, answer]
   
   public static void lol()
   {
      current =  new ArrayList<Score>();
      Scanner input = new Scanner(System.in);   
      String temp = "";
      System.out.println("How many math question do you want to do? Plug in a number or \"+\" for infinite.");
      int count = 0;
      int cond = 0;
      temp = input.nextLine();
   
      if (temp.equals("+"))
      {
         System.out.println("FRQ or MCQ");
         temp = input.nextLine();
         while (!(temp).equalsIgnoreCase("EXIT"))
         {
            if (temp.equalsIgnoreCase("FRQ") || cond == 2)
            {
               cond = 2;
               FRQuestion.showQuest(count);
               temp = input.nextLine();
               if (FRQuestion.checkAnswer(temp))
               {
                  System.out.println("Correct. Here's your next question. Type EXIT if you are finished.\n");
               }
               else
               {
                  System.out.println("Incorrect. Here's your next question. Type EXIT if you are finished.\n");  
               }
               if (Menu.getTesting()) // returns true or false
               {
                  //System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                  Score.addToArr(current, CSVHandler.getID(Integer.valueOf(temp)), count, FRQuestion.checkAnswer(temp), temp);
               }
               
               
            }
            else if (temp.equalsIgnoreCase("MCQ") || cond == 1)
            {
               cond = 1;
               MCQuestion.showQuest(count);
               temp = input.nextLine();
               if (MCQuestion.checkAnswer(temp) && !(temp.equalsIgnoreCase("EXIT")))
               {
                  System.out.println("Correct. Type EXIT if you are finished.\n");
               }
               else if (!(MCQuestion.checkAnswer(temp)) && !(temp.equalsIgnoreCase("EXIT")))
               {
                  System.out.println("Incorrect. Type EXIT if you are finished.\n");  
               }
               else if (temp.equalsIgnoreCase("EXIT"))
               {
                  System.out.println("You have ended your session. Goodbye!");
               }
               if (Menu.getTesting()) // returns true or false
               {
                  //System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
               
                  Score.addToArr(current, CSVHandler.getID(Integer.valueOf(temp)), count, FRQuestion.checkAnswer(temp), temp);
               }
            }
            count++;
            if (count >= CSVHandler.returnSelLength())
            {
               count = 0;
            }
         } // while end
      } // if end
      else
      {

         int cap = Integer.valueOf(temp);
         System.out.println("FRQ or MCQ");
         temp = input.nextLine();
         for (int k = 0 ; k < cap ; k++)
         {
            if (temp.equalsIgnoreCase("FRQ") || cond == 2)
            {
               cond = 2;
               FRQuestion.showQuest(count);
               temp = input.nextLine();
               if (FRQuestion.checkAnswer(temp))
               {
                  System.out.println("Correct.\n");
               }
               else
               {
                  System.out.println("Incorrect.\n");  
               }
            }
            else if (temp.equalsIgnoreCase("MCQ") || cond == 1)
            {
               cond = 1;
               MCQuestion.showQuest(count);
               temp = input.nextLine();
               if (MCQuestion.checkAnswer(temp))
               {
                  System.out.println("Correct.\n");
               }
               else
               {
                  System.out.println("Incorrect.\n");  
               }
            
            }
            System.out.println("\n" + (k + 1) + " out of " + cap + " questions completed.");
         
            count++;
            if (Menu.getTesting()) // returns true or false
            {
               //System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
            
               Score.addToArr(current, CSVHandler.getID(Integer.valueOf(count)), count, FRQuestion.checkAnswer(temp), temp);
            }
            if (k + 1 == cap)
            {
               System.out.println("Session completed, goodbye!");
               break;
            }
            if (count >= CSVHandler.returnSelLength())
            {
               count = 0;
            }
         } // for end  
      } // else end
         
      Score.addToRes(current);
         
   } // end of main

} // end of class