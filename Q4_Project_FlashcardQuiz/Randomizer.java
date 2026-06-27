// port java.util.*;
// import java.io.*;
// 
// public class Randomizer
// {
//    public static void shuffle(ArrayList<String[]> data)
//    {
//       Random rand = new Random();
//       for (int i = data.size() - 1; i > 0; i--) 
//       {
//         int next = rand.nextInt(i + 1); // random index
//         String[] temp = data.get(i);
//         data.set(i, data.get(next));
//         data.set(next, temp); // sets to the next random index
//       }
//     
//    } // end of shuffle
//    
//    
//    // with 2d array tester
//    
//    // public static void main(String[] args)
// //    {
// //    
// //       CSVHandler.load();
// //    
// //       String[][] arr = new String[18][6];
// //       arr = CSVHandler.returnArray();
// //       
// //       shuffle(arr);
// //       
// //       System.out.println(arr[3][5]);
// //       
// //    } // end of main
//    
// }