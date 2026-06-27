public class Student extends SchoolAssociates
{

   private String studentID;
   public Student(int age, String name, String studentID)
   {
   
      super(age, name);
      setRole("Student");
      this.studentID = studentID;
   
   }
   
   public String toString()
   {
   
      return super.toString() + " \nStudent ID: " + studentID;
   
   }
   
   

}