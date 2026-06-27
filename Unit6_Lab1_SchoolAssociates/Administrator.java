// On my HONOR I have NOT given nor recieved unauthorized aid on my assignment, Brian Soltani
public class Administrator extends Staff
{

   private String oversee, overseeTwo;

   public Administrator(int age, String name, int years, double salary, String oversee, String overseeTwo)
   {
   
   super(age, name, years, salary);
   setRole("Administrator");
   this.oversee = oversee;
   this.overseeTwo = overseeTwo;
   
   }
   
   public String toString()
   {
   
      return super.toString() + "\nOversees: " + oversee + " and " + overseeTwo;
   
   }
   

}