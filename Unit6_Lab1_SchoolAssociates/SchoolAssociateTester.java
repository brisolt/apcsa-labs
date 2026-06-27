// On my HONOR I have NOT given nor recieved unauthorized aid on my assignment, Brian Soltani
// This tester comes from the assignment details but I changed up the names a tad bit.
//Nicely played Brian

public class SchoolAssociateTester{
   public static void main(String[] args){
      SchoolAssociates[] people = new SchoolAssociates[9];
      people[0] = new SchoolAssociates(41, "Travis Pugh the Third");
      people[1] = new Staff(36, "Travis Pugh the Fourth", 45000, 10);
      people[2] = new Administrator(40, "Travis Pugh (Unrelated to Travis Pugh Sr.)", 75000, 8, "English", "Social Studies");
      people[3] = new Teacher(42, "Travis Pugh Jr.", 55000, 20, "Geometry");
      people[4] = new Professor(59, "Travis Pugh Sr.", 84000, 30, "Digital Systems", "Daniels Hall 322", true);
      people[5] = new Student(7, "Travis Pugh the Eighth", "2984765");
      people[6] = new K12Student(10, "Travis Pugh the Sixth", "2568583", 4);
      people[7] = new HighSchoolStudent(18, "Travis Pugh the Fifth", "1335685", 12, 4.332);
      people[8] = new CollegeStudent(19, "Steve", "436482690247", 3.688, "English", "Undergrad");
      
      for (SchoolAssociates person: people){
         System.out.println(person + "\n\n");
      }  
   }
}