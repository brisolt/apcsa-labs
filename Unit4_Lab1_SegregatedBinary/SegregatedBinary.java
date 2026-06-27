/*

On my honor as a student I haven't given nor recieved unauthorized aid on this assessment
Brian Soltani

*/


/**
* The SegregatedBinary class creates a randomly generated array of 0's and 1's,
* then segregates the 0's to the left side of the array and the 1's to the right.
* @author Kimberly A. Baram
* @version 1.0
*/
public class SegregatedBinary{

/**
  * Builds and returns an array with a random number of elements
  * (between 10 and 20, inclusive), filled with randomly
  * generated 0's and 1's
  * @return The randomly generated array
  */
   public static int[] buildArray(){
      int random = (int) (Math.random() * 11) + 10;
      int zeroOne;
      int[] numbers = new int[random];
      for (int i = 0 ; i < random ; i++)
      {
         zeroOne = (int) (Math.random() * 2);
         numbers[i] = zeroOne;
      
      }
      return numbers;  //temporary return value so that this template compiles
   }

/**
  * Prints the contents of the passed array.
  * @param arr the array to be printed.
  */
   public static void printArray(int[] arr){
      
      String total = "";
      for (int i = 0 ; i < arr.length ; i++)
      {
      
         total = total + " " + arr[i]; 
      
      }
      System.out.println(total);
   }

/**
  * Counts and returns the number of zeros in the passed array.
  * @param arr the array to count zeros
  * @return the number of zeros
  */
   public static int countZeros(int[] arr){
      int zeros = 0;
      for (int i = 0 ; i < arr.length ; i++)
      {
         if (arr[i] == 0)
         {
            zeros++;
         }
      }
      return zeros;  //temporary return value so that this template compiles
   }

/**   
  * Builds and returns a NEW array containing the same number of one's and
  * zero's as the original, but with the 0's to the left and the 1's to the right.
  * Example: if arr contains {0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0}
  * then the returned array is {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}
  * @param the array on which the returned array is based
  * @return a new array with the 0's and 1's segregated
  */
   public static int[] rearrange(int[] arr){
      int[] newArray = new int[arr.length]; // makes new array
      int numZero = 0;
      for (int i = 0 ; i < arr.length ; i++) // fetches zeros
      {
         if (arr[i] == 0)
         {
            numZero++;
         }
      }
      int remainders = arr.length - numZero; // finds remainding slots for numbrse
      for (int i = 0 ; i < arr.length ; i++)
      {
         for (int k = 0 ; k < numZero ; k++)
         {
            if (arr[i] == 0)
            {
               newArray[k] = 0;
            }
         }
         for (int j = 0 ; j < remainders ; j++) // makes them one
         { 
            newArray[numZero + j] = 1;
         }
      }
      return newArray;  // funny return statement
   }

/**
  * Prints the numbers of zeros and ones contained in the passed array.
  * Example: if arr contains {0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0}
  * Then the following is printed:
  *     Zeros: 10
  *     Ones: 6
  * @param arr the array from which to count the ones and zeros
  */
   public static void printNumOfEach(int[] arr){
      int numZero = 0;
      for (int i = 0 ; i < arr.length ; i++) // fetches zeros
      {
         if (arr[i] == 0)
         {
            numZero++;
         }
      }
      int remain = arr.length - numZero;
      System.out.println("\nZeros: " + numZero + "\nOnes: " + remain);
   }

/**
  * Test the methods written above.
  * @param args not used
  */
   public static void main(String[] args){
      int[] arr = buildArray();
      int[] rearranged = rearrange(arr);
      System.out.println("Original array:");
      printArray(arr);
      printNumOfEach(arr);
      System.out.println("\nSegregated array:");
      printArray(rearranged);
   }
}