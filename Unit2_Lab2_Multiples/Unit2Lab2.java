/*
On my honor as a student I have neither given nor recieved unauthorized aid on this assignment.
Brian Soltani
*/

import java.util.*;
public class Unit2Lab2
{
   
   public static void main(String[] args)
   {
   
   Scanner input = new Scanner(System.in);
   System.out.println("Enter a number (0 to exit): \n");
   int multiple = input.nextInt();
   int absVal = Math.abs(multiple);
   int infLoop = 0;
   while (infLoop < 1)
   {
      if (multiple == 0)
      {
         System.out.println("\n BYE BYE.");
         infLoop++;
      }
      else
      {
         absVal = Math.abs(multiple);
         System.out.println("Multiplication table for " + multiple);
         for (int i = 0 ; i <= absVal ; i++)
         {
            System.out.println(i + " x "  + multiple + " = " + (i * multiple));
         }
         System.out.println("\n Enter another number (0 to exit): \n");
         multiple = input.nextInt();
      }
   }
   }
}