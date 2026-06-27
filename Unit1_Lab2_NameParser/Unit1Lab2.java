/*
Brian Soltani
On my honour as a student, I have not given nor recieved unauthorized aid on this assignment.
*/

import java.util.*;
public class Unit1Lab2
{
   public static void main(String[] args)
   {
   
      Scanner input = new Scanner(System.in);
      System.out.println("Input your full name (first middle last)");
      String fullName= input.nextLine();
      int firstIndex = fullName.indexOf(" ");
      int secondIndex = fullName.lastIndexOf(" ");
      String firstName = fullName.substring(0, firstIndex);
      String middleName = fullName.substring(firstIndex+1, secondIndex);
      String lastName = fullName.substring(secondIndex+1);
      
      System.out.println("Your full name is " +firstName+" "+middleName+ " " +lastName+".");
      System.out.println("Your full rearranged name is " +lastName+", "+firstName+" "+middleName.substring(0, 1)+".");
      System.out.println("Your initials are " +firstName.substring(0, 1) + middleName.substring(0, 1) + lastName.substring(0, 1)); 
        }
}