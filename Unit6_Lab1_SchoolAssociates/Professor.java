// On my HONOR I have NOT given nor recieved unauthorized aid on my assignment, Brian Soltani
public class Professor extends Teacher
{

   private boolean tenure;
   private String officeNum;
   public Professor(int age, String name, int years, double salary, String subject, String officeNum, boolean tenure)
   {
      
      super(age, name, years, salary, subject);
      setRole("Profesor");
      this.officeNum = officeNum;
      this.tenure = tenure;
      
   }
   
   public String toString()
   {
   
      return super.toString() + " Office Number: " + officeNum + " Has Tenure: " + tenure;
   
   }
   

}