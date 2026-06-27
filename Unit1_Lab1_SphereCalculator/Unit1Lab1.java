/*
Brian Soltani
On my honour as a student, I have not given nor recieved unauthorized aid on this assignment.
Source for user input: https://www.javatpoint.com/how-to-get-input-from-user-in-java (used prior to lesson on 8/29)
*/

import java.util.*;
public class Unit1Lab1
{
   public static void main(String[] args)
   {
       Scanner radi = new Scanner(System.in);
       System.out.println("Input any number in console to find out it's diameter, circumference, surface area, and volume.");
       double radius = radi.nextDouble(); // nextDouble works too thats insane
       double diameter = radius * 2;
       double circumfernce = diameter * Math.PI;
       double surfaceArea = 4 * (radius * radius) * Math.PI;
       double volume = (4 * (radius * radius * radius) * Math.PI) / 3;
         
       System.out.println("Diameter of the circle: " +diameter);
       System.out.println("Circumference of the circle: " +circumfernce);
       System.out.println("Surface Area of the sphere: " +surfaceArea);
       System.out.println("Volume of the sphere: " +volume);
      
   }
}