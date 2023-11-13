import java.util.Scanner;/****
 ***** Created by Jayne Mc Laughlin on 7/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class FizzBuzz
{
   public static void main(String[] args)
   {
      final int FIZZ = 3;
      final int BUZZ = 7;

      Scanner keyboard = new Scanner(System.in);
      int userInput = 7;

      System.out.println("Please enter a whole number: ");
      userInput = keyboard.nextInt();
      keyboard.nextLine();

      if (userInput%FIZZ == 0)
      {
         System.out.println("FIZZ ");
      }

      if (userInput%BUZZ == 0);
      {
         System.out.println("BUZZ ");
      }

      if (userInput%FIZZ != 0 && userInput%BUZZ != 0)
      {
         System.out.println(userInput);
      }
      System.out.println("Thank you for using my FIZZ BUZZ program");
   }//main
}//class