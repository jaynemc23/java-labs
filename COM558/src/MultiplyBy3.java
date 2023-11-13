import java.util.Scanner;
/****
 ***** Created by Jayne Mc Laughlin on 1/20/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class MultiplyBy3
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      //Declaring and initialising variables
      final int MULTIPLIER = 3;
      int input;
      int num;

      System.out.println("Please enter a whole number :");
      input=keyboard.nextInt();

      //Calculations
      num = input * MULTIPLIER;

      //Prints
      System.out.print("Answer: "+ num);

   }//main
}//class