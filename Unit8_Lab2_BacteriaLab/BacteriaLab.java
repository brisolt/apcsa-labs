/*
Brian Soltani
I didnt recieve nor give unauthorized aid on this assignment
*/

import java.util.*;

public class BacteriaLab
{

   static Scanner console = new Scanner(System.in); // "static Scanner" looks so ugly imo
   private static int hour, numOfBac;
   
   public static void main(String[] args) {
      int holder = 0;
      hour = 0;
      System.out.println("How many bacteria were left on the classroom door?");
      numOfBac = console.nextInt();
      System.out.println("How many hours passed before the doorknob was cleaned?");
      holder = console.nextInt(); 
      cycle(holder);
      System.out.println("There were " + numOfBac + " bacteria on the doorknob at the time of cleaning.");
   }
   
   public static void cycle(int hrs) {
      if (hour == hrs)
         return;
      else {
         numOfBac = numOfBac * 5;
         hour++;
         cycle(hrs);
      }
   
   }

}