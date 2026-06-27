public class Teacher extends Staff
{

   private String subject;
   public Teacher(int age, String name, int years, double salary, String subject)
   {
      
      super(age, name, years, salary);
      setRole("Teacher");
      this.subject = subject;
      
   }
   
   public String toString()
   {
   
   return super.toString() + "\nSubject: " + subject;
   
   }
   

}