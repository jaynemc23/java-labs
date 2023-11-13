import java.util.Scanner;
/****
 ***** Created by Jayne Mc Laughlin on 2/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class TestNumber
{

   public static void main(String[] args)
   {
      final int INPUT;
      Scanner keyboard = new Scanner(System.in);

      //Prompt user
      System.out.println("Please a whole number: ");
      INPUT = keyboard.nextInt();
      keyboard.nextLine();

      if (INPUT>0)
      {
         System.out.println("The number " + INPUT + " is greater than 20");
      }//if

      else if (INPUT==0)
      {
         System.out.println("The number " + INPUT + " is not greater than 20");
      }//if

      else if (INPUT<0)
      {
         System.out.println("The number " + INPUT + " ");
      }

   }//main
}//class