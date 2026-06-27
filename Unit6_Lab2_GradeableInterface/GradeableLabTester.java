//name and honor code on other files

//does not compile or run
public class GradeableLabTester
{
   
   public static void main(String arg[])
   {
      String pass = "";
      String percentage = "";
      
      int score = 0;
      int randomOne = 0;
      randomOne = (int) (Math.random() * 20) + 1;
      
      int randomTwo = 0;
      randomTwo = (int) (Math.random() * 65) + 16;
      
      int randomThree = 0;
      randomThree = (int) (Math.random() * 13);
      
      for (int i = 0 ; i <= randomOne ; i++)
      {
         percentage = HighSchool.getNewGrade();
      }
      
      for (int i = 0 ; i <= randomTwo ; i++)
      {
         score = APExamTaker.getScore();
      }
      
      if (HighSchool.isPassing())
      {
         pass = " passed.";
      }
      else
      {
         pass = " did not pass";
      }
      
      System.out.println("Kenny G. is a high school student who aspires to be a famous saxophone artist. He finished his band semester with a " + percentage +" and " + pass);
      
      
      
      if (APExamTaker.isPassing())
      {
         pass = " and passed";
      }
      else {
         pass = " and did not pass";
      }
      
      System.out.println("Ringo Starr, a famous English musician, recently took his AP Music Theory test. He scored a " + APExamTaker.getScore() + " out of 5 " + pass);
      
      for (int i = 0 ; i <= randomThree ; i++)
      {
         score = DriversPermitStudent.getScore();
      }
      
      if (DriversPermitStudent.isPassing())
      {
         pass = " and passed";
      }
      else
      {
         pass = " and failed.";
      }
      
      System.out.println("Max Verstappen, soon to be a famous Formula 1 driver, is currently taking his Driver's Permit test. He scored a " + DriversPermitStudent.getScore() + pass);
      
   }
   
}