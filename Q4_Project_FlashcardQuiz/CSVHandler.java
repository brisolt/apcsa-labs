/*
Honor Statement
Brian Soltani, I have not given  nor recieved any unauthorized aid on this assignment.

*/

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class CSVHandler
{

   // static int numCards = 26; // add +1 when inst cuz header
   // static String[][] main = new String[numCards+1][6];
   static ArrayList<String[]> main = new ArrayList<String[]>();
   static ArrayList<String[]> seld = new ArrayList<String[]>();
   static String picked = "";
   

   public static void load()
   {
      try { 
         FileInputStream Data = new FileInputStream("MathQuiz.csv");
         Scanner check = new Scanner(Data);
      
         while (check.hasNext()) // checks if next row isnt null
         { 
            String line = check.nextLine();
            String[] columns = line.split(",", 7); // splits rows into each element of array
            main.add(columns);
         }
      } catch (Exception e) // catches errors
      { 
         e.printStackTrace();
      }
      
      shuffle(main);
         
   } // end of load method

   public static void shuffle(ArrayList<String[]> data) // shuffles data
   {
      Random rand = new Random();
      for (int i = data.size() - 1; i > 0; i--) 
      {
         int next = rand.nextInt(i + 1); // random index
         String[] temp = data.get(i);
         data.set(i, data.get(next));
         data.set(next, temp); // sets to the next random index
      }
    
   } // end of shuffle
   
   public static void shuffleSel()
   {
   Random rand = new Random();
      for (int i = seld.size() - 1; i > 0; i--) 
      {
         int next = rand.nextInt(i + 1); // random index
         String[] temp = seld.get(i);
         seld.set(i, seld.get(next));
         seld.set(next, temp); // sets to the next random index
      }

   
   }



   // incase i need the arary elsewhere
   public static ArrayList<String[]> returnArray()
   {
      ArrayList<String[]> temp = new ArrayList<String[]>();
      for (int h = 0 ; h < main.size() ; h++)
      {
         for (int k = 0 ; k < main.get(h).length ; k++)
         {
            temp.get(h)[k] = main.get(h)[k];
         }
      }
      return temp;
   }
   
   public static int mainSize()
   {
      return main.size();
   }
   
   public static ArrayList<String[]> returnArrayNew()
   {
      ArrayList<String[]> temp = new ArrayList<String[]>();
      for (int h = 0 ; h < seld.size() ; h++)
      {
         for (int k = 0 ; k < seld.get(h).length ; k++)
         {
            temp.get(h)[k] = seld.get(h)[k];
         }
      }
      return temp;
   }


   // All accept a row value depending on the question, row ID 0 does not count since that is the catagories.
   // Adds one so calling the index 0 is the first question listed of the row
   
   public static String getCategory(int r)
   {
      return "" + seld.get(r)[0];
   }
   
   public static String getDifficulty(int r)
   {
      return "" + seld.get(r)[1];
   }
   
   public static String getQuestion(int r)
   {
      return "" + seld.get(r)[2];
   }
   
   public static String getChoices(int r)
   {
      return "" + seld.get(r)[3];
   }
   
   public static String getType(int r)
   {
      return "" + seld.get(r)[4];
   }
   
   public static String getAnswer(int r)
   {
      return "" + seld.get(r)[5];   
   }
   
   public static int getID(int r)
   {
      return Integer.valueOf(seld.get(r)[6]);
   }
   
   public static String getCategoryMain(int r)
   {
      return "" + main.get(r)[0];
   }
   
   public static String getDifficultyMain(int r)
   {
      return "" + main.get(r)[1];
   }
   
   public static String getQuestionNain(int r)
   {
      return "" + main.get(r)[2];
   }
   
   public static String getChoicesMain(int r)
   {
      return "" + main.get(r)[3];
   }
   
   public static String getTypeMain(int r)
   {
      return "" + main.get(r)[4];
   }
   
   public static String getAnswerMain(int r)
   {
      return "" + main.get(r)[5];
   }

   public static int getIDMain(int r)
   {
      return Integer.valueOf(main.get(r)[6]);
   }

   public static void main(String[] args)
   {
   
      //load();
   
      // int idWidth = 10;
   //       int catWidth = 15;
   //       int diffWidth = 20;
   //       int questWidth = 20;
   //       int choiceWidth = 20;
   //       int typeWidth = 15;
   //       int correctWidth = 10;
   //         
   //       String[] headers = {"ID", "Category", "Difficulty Level", "Question", "Answer Choice", "Answer Type", "Correct Answer"};
   //          
   //          // print those beautiful headers
   //       System.out.printf("%-" + idWidth + "s", headers[0]);
   //       System.out.printf("%-" + catWidth + "s", headers[1]);
   //       System.out.printf("%-" + diffWidth + "s", headers[2]);
   //       System.out.printf("%-" + questWidth + "s", headers[3]);
   //       System.out.printf("%-" + choiceWidth + "s", headers[4]);
   //       System.out.printf("%-" + typeWidth + "s", headers[5]);
   //       System.out.printf("%-" + correctWidth + "s", headers[6]);
   //       System.out.println();
   //          
   //          // these beautiful seperations
   //       System.out.printf("%-" + idWidth + "s", "----");
   //       System.out.printf("%-" + catWidth + "s", "---------");
   //       System.out.printf("%-" + diffWidth + "s", "----------------");
   //       System.out.printf("%-" + questWidth + "s", "---------");
   //       System.out.printf("%-" + choiceWidth + "s", "--------------");
   //       System.out.printf("%-" + typeWidth + "s", "-----------");
   //       System.out.printf("%-" + correctWidth + "s", "--------------");
   //       System.out.println();
   //    
   //          // data
   //       int id = 1;
   //       for (String[] rows : main) {
   //          System.out.printf("%-" + idWidth + "d", id++);
   //          System.out.printf("%-" + catWidth + "s", rows[0]);
   //          System.out.printf("%-" + diffWidth + "s", rows[1]);
   //          System.out.printf("%-" + questWidth + "s", rows[2]);
   //          System.out.printf("%-" + choiceWidth + "s", rows[3]);
   //          System.out.printf("%-" + typeWidth + "s", rows[4]);
   //          System.out.printf("%-" + correctWidth + "s", rows[5]);
   //          System.out.println();
   //       }
   
   
      // String[] arrs = getDistinctCats();
//       String[] arra = getDistinctDiffs();
//       for (int i = 0 ; i < arrs.length ; i++)
//       {
//          if (arrs[i] != null)
//          {
//             System.out.println(arrs[i]);
//          }
//          
//       }
//       for (int i = 0 ; i < arra.length ; i++)
//       {
//          if (arrs[i] != null)
//          {
//             System.out.println(arra[i]);
//          }
//          
//       }
//    
   
   selectQs("Multiplication", "Easy Difficulty");
   for (int i = 0 ; i < seld.size() ; i++)
   {
      System.out.println(seld.get(i)[i]);
   }
   
   
   } // end of main method

   public static String[] getDistinctCats() 
   {
      return main.stream().map(arr -> arr[0]).distinct().toArray(String[]::new);
   }
   
   public static String[] getDistinctDiffs() 
   {
      return main.stream().map(arr -> arr[1]).distinct().toArray(String[]::new);
   }
   
   public static void selectQs(String cat, String diff)
   {
      clearSeld();
      for (int i = 0 ; i < main.size() ; i++)
      {
         if (cat.equals("A") || getCategoryMain(i).equals(cat))
         {
               if (diff.equals("A") || getDifficultyMain(i).equals(diff))
               {
                  // System.out.println("Found Match");
                  seld.add(main.get(i));
               }
         }
      }
      shuffle(seld);
   }
   
   public static void clearSeld()
   {
      seld.clear();
   }
   
   public static int returnSelLength()
   {
      return seld.size();
   }
   
} // end of class