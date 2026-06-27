// On my HONOR I have NOT given nor recieved unauthorized aid on my assignment, Brian Soltani
public class K12Student extends Student
{

   private int grade;
   public K12Student(int age, String name, String studentID, int grade)
   {
   
      super(age, name, studentID);
      setRole("K - 12 Student");
      this.grade = grade;
   
   }
   
   public String toString()
   {
   
      return super.toString() + " \nGrade: " + grade;
      
   }

}