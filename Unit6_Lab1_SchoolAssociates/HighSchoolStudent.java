// On my HONOR I have NOT given nor recieved unauthorized aid on my assignment, Brian Soltani
public class HighSchoolStudent extends K12Student
{

   private double GPA;
   public HighSchoolStudent(int age, String name, String studentID, int grade, double GPA)
   {
   
   super(age, name, studentID, grade);
   setRole("High School Student");
   this.GPA = GPA;
   
   }

   public String toString()
   {
   
      return super.toString() + " Grade Point Average: " + GPA;
   
   }

}