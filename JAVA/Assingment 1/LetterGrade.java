import java.util.Scanner;
class LetterGrade
{
  public static void main(String args[])
    {
      String lettergrade;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the numerical grade ");
      
      int Numericalgrade = scanner.nextInt();
    
       if (Numericalgrade < 10)
        {
          lettergrade = "A";
         }
        else
         {
            lettergrade = "B";
          }
       System.out.println("The corresponding letter grade is " +lettergrade);
   }
}  