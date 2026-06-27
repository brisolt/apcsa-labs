// Brian Soltani - I have neither given nor recieved unauthorized aid on this assignment

import java.util.*;
public class TicketDriver
{

   private static int seat = (int) (Math.random() * 8) + 1;
   private static int group = (int) (Math.random() * 5) + 1;
   private static int row = (int) (Math.random() * 6) + 1;
   private static String letter = "";

   public static String getLet()
   {
   
      if (row == 1)
         return "A";
      else if (row == 2)
         return "B";
      else if (row == 3)
         return "C";
      else if (row == 4)
         return "D";
      else if (row == 5)
         return "E";
      else 
         return "F";
      
   }
   
   public static String getLet(int g)
   {
   
      if (g == 1)
         return "A";
      else if (g == 2)
         return "B";
      else if (g == 3)
         return "C";
      else if (g == 4)
         return "D";
      else if (g == 5)
         return "E";
      else 
         return "F";
      
   }



   public static void main(String[] arg)
   {
   
      ArrayList<ArlineTicketManager> tickets = new ArrayList<>();
      
      for (int i = 0 ; i < 15 ; i++)
      {
      
         seat = (int) (Math.random() * 8) + 1;
         group = (int) (Math.random() * 5) + 1;
         row = (int) (Math.random() * 6) + 1;
         letter = getLet();
                  
         tickets.add(new ArlineTicketManager(i + 1, letter, seat, group));
      
      }
      
      System.out.println("Group 1 Passengers: \n");
      ArlineTicketManager yooo = new ArlineTicketManager(1, "", 1, 1);
      ArlineTicketManager temp = new ArlineTicketManager(1, "", 1, 1);
      
      for (int i = 0 ; i < 5 ; i++)
      {
      
        System.out.println("Group " + (i + 1) + " Passengers: \n");

      
         for (int j = 0 ; j < tickets.size() ; j++)
         {
         

         
            yooo = tickets.get(j);
      
            if (yooo.getGroup() == i + 1)
            {
            
               System.out.println(yooo.toString());
            
            }
         
         }
         
         System.out.println("\n");
      
      }
      
      
      // AHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH
      System.out.println("Passengers that can board together:\n");
      
      boolean matchfnd = true;
      int matches = 0;      
      
       for (int i = 0 ; i < 5 ; i++)
       {
         
         for (int g = 0 ; g < 6 ; g++)
         {
   
          matchfnd = false;
          matches = 0;
         
            for (int j = 0 ; j < tickets.size() - 1 ; j++)
            {
            
               yooo = tickets.get(j);
         
               if ((yooo.getGroup() == i + 1) && (yooo.getRow().equals(getLet(g + 1))))                  
               {
            
                  if (matchfnd)
                     {
                     
                        System.out.println(temp.toString());  
                        matches++;
                     
                     }
                  else
                     matchfnd = true;
                  
                  temp=yooo;
               }
            }

            if (matches>0)
               System.out.println(temp.toString());

         
         }
      
                  
         System.out.println("\n");
      
       }
      
      
   
      
      
      
   
   }

}