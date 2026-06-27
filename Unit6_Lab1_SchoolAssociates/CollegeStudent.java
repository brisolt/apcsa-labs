// On my HONOR I have NOT given nor recieved unauthorized aid on my assignment, Brian Soltani
public class CollegeStudent extends Student
{

   private String major, studentStatus;
   private double gpa;
   public CollegeStudent(int age, String name, String studentID, double gpa, String major, String studentStatus)
   {
   
   super(age, name, studentID);
   setRole("College Student");
   this.gpa = gpa;
   this.major = major;
   this.studentStatus = studentStatus;
   
   }
   
   public String toString()
   {
   
      return super.toString() + " \nGrade Point Average: " + gpa + " \nMajor: " + major + " \nStatus: " + studentStatus;
   
   }
   
}