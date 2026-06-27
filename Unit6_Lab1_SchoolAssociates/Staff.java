import java.util.*;
public class Staff extends SchoolAssociates
{

   private int years;
   private double salary;
   
   public Staff(int age, String name,  int years, double salary)
   {
   
      super(age, name);
      setRole("Staff");
      this.salary = salary;
      this.years = years;
   
   }
   
   public String toString()
   {
   
      return super.toString() + " \nSalary: " + salary + " \nYears: " + years;
   
   }

}