// Brian Soltani
// I did give nor recieve unauthorized aid on this assignment.

import java.util.*;

public class RecursiveMaximum
{

   public static int find(int[] list, int n)
   {
   
   /*
   
   first time using psudo code... turns out its helpful. who knew
   
   > Set up the base case for when the index is 0
   > Form the recursion condition
   > Keep track of the next number in the array with a String value
   > Use the same code as a sorting algorithm checking which number is bigger
   > Return the corresponding values
   > Do this for each added value of the array starting at 2, print inside of the recursion
   
   */
      int checkNextNum;
      
      
   
   
   
      if (n == 0)
         checkNextNum = list[0];
         
      else
      {
      
         checkNextNum = find(list, n - 1); // sets to next
         
         if (list[n] > checkNextNum) // checks which is high
            checkNextNum = list[n]; 
         
      }
      
      System.out.print("The max value in [ " );
   
      for (int h = 0 ; h <= n ; h++) // prints
      {
      
         System.out.print(list[h] + " ");
      
      }
      
      System.out.println("] is " + checkNextNum);
      
      return checkNextNum;
   
   }   
     
   public static void main(String[] args)
   {
   
      int rand;
      int[] arr = new int[10];
      
      for (int h = 0 ; h < 10 ; h++) // instanciates + prints
      {
      
         arr[h] = (int) (Math.random() * 100) + 1;
         // System.out.print(arr[h] + " ");
      
      }
      
      System.out.println("\n Largest num: " + find(arr, arr.length-1));
      
   
   }


}