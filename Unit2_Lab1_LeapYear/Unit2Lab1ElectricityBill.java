/*
On my honor as a student I have neither given nor recieved unauthorized aid on this assignment.
Brian Soltani

also this is leap year not electricity bill, whoopsies.
*/
import java.util.*;
public class Unit2Lab1ElectricityBill
{

   public static void main(String[] args)
   {
      
      System.out.println("Give a random year");
      Scanner yearInput = new Scanner(System.in);
      int year = yearInput.nextInt();
      int closestYear = year;
           
      if ((year % 4 == 0) && (year % 100 != 0))
      {
         System.out.println(year + " is a leap year.");
      }
      else if (year % 4 == 3)
      {
         closestYear++;
         if (closestYear % 100 == 0)
         {
            closestYear = closestYear - 4;
         }
         System.out.println(year + " is NOT a leap year. The closest leap year is " + closestYear);
      }
      else if (year % 4 == 1)
      {
         closestYear--;
         if (closestYear % 100 == 0)
            {
               closestYear = closestYear + 4;
            }
         System.out.println(year + " is NOT a leap year. The closest leap year is " + closestYear);
      }
      else if ((year % 4 == 2) || (year % 100 == 0))
      {
         double half = Math.random();
         if (half >= 0.50)
         {
            closestYear = closestYear - 4;
         }
         if (half < 0.50)
         {
            closestYear = closestYear + 4;
         }
       
         System.out.println(year + " is NOT a leap year. The closest leap year is " + closestYear);
      }
      
      
     
   }
}
