/*
Honor Statement
Brian Soltani, I have not given  nor recieved any unauthorized aid on this assignment.

*/

import java.util.*;
import java.io.*;

public class Score
{
   
   int question;
   boolean wasCorrect;
   String answer;
   static Score name;
   int id;
   
   static ArrayList<ArrayList<Score>> reserved = new ArrayList<ArrayList<Score>>();
   static ArrayList<String[]> iHateJava = new ArrayList<String[]>();
   
   public static void clearReserved()
   {
      reserved.clear();
   }
   
   public Score(int id, int question, boolean wasCorrect, String answer)
   {
      this.id = id;
      this.question = question;
      this.wasCorrect = wasCorrect;
      this.answer = answer;
   }
   
   public static void addToArr(ArrayList<Score> arr, int id, int q, boolean c, String a)
   {
      name = new Score(id, q, c, a);
      arr.add(name);
      //System.out.println("***********" + arr.size());
   }
   
   public static void addToRes(ArrayList<Score> arr)
   {
      reserved.add(arr);
   }
   
   public int returnID()
   {
      return id;
   }
   
   public int getQuestions()
   {
      return question;
   }
   
   public boolean getCorrect()
   {
      return wasCorrect;
   }
   
   public static void printTests()
   {
      double totalCorrect = 0;
      double totalSize = 0;
      double countCorrect = 0;
      if (reserved.size() != 0)
      {
         System.out.println("\n" + reserved.size() + " tests taken.\n----------\n");
         for (int i = 0 ; i < reserved.size() ; i++)
         {
            countCorrect = 0.0;
            System.out.println("Test number " + (i + 1) + " out of " + (reserved.size()) + "\n");
           // System.out.println(reserved.get(i).size());
            totalSize+=reserved.get(i).size();
            for (int h = 0 ; h < reserved.get(i).size() ; h++)
            {
               System.out.println(reserved.get(i).get(h).toString());
               if (reserved.get(i).get(h).getCorrect())
               {
                  countCorrect++;
                  totalCorrect++;
               }
            }
            System.out.println("     " + ( countCorrect / reserved.get(i).size() * 100) + "% on this test.\n");
            System.out.println("-----------\n");
         }
         System.out.println("     " + ( totalCorrect / totalSize * 100) + "% on all taken tests.\n");
         System.out.println("-----------\n");
      
         
      }
      else
      {
         System.out.println("\nNo tests taken.");
         return;  
      }
   }
   
   public String getAnswer()
   {
      return answer;
   }
   
   @Override
   public String toString()
   {
      String e = "Incorrect";
      if (wasCorrect)
         e = "Correct";
      return "     Quest: " + question + " | ID: " + id + " | Answer was: " + e + " | Your Answer: " + answer;
   }
   
   // public static void main(String args[])
//    {
//       Score s1 = new Score(1, true, "26");
//       Score s2 = new Score(5, true, "13");
//       //
//       Score s3 = new Score(3, false, "26");
//       Score s4 = new Score(8, true, "29");
//       Score s5 = new Score(10, false, "36");
//       //
//       Score s6 = new Score(2, false, "29");
//       
//       ArrayList<Score> one = new ArrayList<Score>();
//       
//       one.add(s1);
//       one.add(s2);
//       
//       reserved.add(one);
//       one = new ArrayList<Score>();
//    //     one.clear();
//       
//       one.add(s3);
//       one.add(s4);
//       one.add(s5);
//             
//       reserved.add(one);
//       one = new ArrayList<Score>();
//    //   one.clear();
//    
//       one.add(s6);
//       reserved.add(one);
//    
//       for (int c = 0 ; c < reserved.size() ; c++)
//       {
//          System.out.println("array "+c);
//          for (int i = 0 ; i < reserved.get(c).size() ; i++)
//          {
//          
//             System.out.print("element "+i + "  ");      
//             System.out.println(reserved.get(c).get(i).toString());
//          }
//       }
//    }
   
     
   public static void analysis()
   {
      
      int hate = CSVHandler.mainSize();
      
      String[] cat = Menu.catsArr();
      String[] dif = Menu.diffsArr();
   
      int[][] rightAns = new int[cat.length][dif.length];
      int[][] totalAns = new int[cat.length][dif.length];
      if (reserved.size() != 0)
      {
         for (int i = 0 ; i < cat.length ; i++)
         {
            for (int h = 0 ; h < dif.length ; h++)
            {
             //   System.out.println(cat[i]);
            //                System.out.println(dif[h]);
               
               for (int k = 0 ; k < reserved.size() ; k++)
               {
                  for (int g = 0 ; g < reserved.get(k).size() ; g++)
                  {
                     for (int f = 0 ; f < hate ; f++)
                     {
                        if (CSVHandler.getIDMain(f) == reserved.get(k).get(g).returnID())
                        {
                           if (CSVHandler.getCategoryMain(f).equals(cat[i]) && CSVHandler.getDifficultyMain(f).equals(dif[h]))
                           {
                              totalAns[i][h]++;
                              if (reserved.get(k).get(g).getCorrect())
                              {
                                 rightAns[i][h]++;
                              }
                           }
                        }
                     }
                  }
               }
               
            }        
         }
        
      }
      
      
      System.out.print(padRight("", 50));
      for (String b : dif) {
         System.out.print(padRight(b, 50));
      }
      System.out.println();
         
         // Print the table rows
      for (int d = 0; d < cat.length; d++) 
      {
         System.out.print(padRight(cat[d], 50));
         for (int j = 0; j < dif.length; j++) 
         {
            double ratio = (double) rightAns[d][j] / totalAns[d][j] * 100;
            if (totalAns[d][j] == 0)
            {
               ratio = 0;
            }
            System.out.print("% Right: " + padRight(String.format("%.2f", ratio), 43));
         }
         System.out.println();
      }
      
   }
      
      
      // double totalCorrect = 0;
   //       double totalSize = 0;
   //       double countCorrect = 0;
   //          System.out.println("\n" + reserved.size() + " tests taken.\n----------\n");
   //          for (int i = 0 ; i < reserved.size() ; i++)
   //          {
   //             countCorrect = 0.0;
   //             System.out.println("Test number " + (i + 1) + " out of " + (reserved.size()) + "\n");
   //            // System.out.println(reserved.get(i).size());
   //            totalSize+=reserved.get(i).size();
   //             for (int h = 0 ; h < reserved.get(i).size() ; h++)
   //             {
   //                System.out.println(reserved.get(i).get(h).toString());
   //                if (reserved.get(i).get(h).getCorrect())
   //                {
   //                   countCorrect++;
   //                   totalCorrect++;
   //                }
   //             }
   //             System.out.println("     " + ( countCorrect / reserved.get(i).size() * 100) + "% on this test.\n");
   //             System.out.println("-----------\n");
   //          }
   //             System.out.println("     " + ( totalCorrect / totalSize * 100) + "% on all taken tests.\n");
   //             System.out.println("-----------\n");
   // 
   //          
   //       }
   //       else
   //       {
   //          System.out.println("\nNo tests taken.");
   //          return;  
   //       }
   
   
   public static String padRight(String s, int n) 
   {
      return String.format("%-" + n + "s", s);
   }
   
}
   


