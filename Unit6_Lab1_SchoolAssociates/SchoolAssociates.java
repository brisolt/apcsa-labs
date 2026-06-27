// On my HONOR I have NOT given nor recieved unauthorized aid on my assignment, Brian Soltani
public class SchoolAssociates
{

   private int age;
   private String name, role;

   public SchoolAssociates(int age, String name)
   {
   
      this.age = age;
      this.name = name;
      setRole("School Associate");
   
   }
   
   public void setRole(String role)
   {
   
      this.role = role;
   
   }
   
   public String toString()
   {
   
      return "Age: " + age + " \nName " + name + " \nRole " + role;
   
   }

}