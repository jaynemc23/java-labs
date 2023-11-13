import java.util.Scanner;
/****
 ***** Created by jayne on 4/10/23
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Example
{

   public static void main(String[] args)
   {

      Scanner keyboard = new Scanner(System.in);

      double number1, number2, number3, average;

      System.out.print("Enter three numbers: ");

      number1 = keyboard.nextDouble();

      number2 = keyboard.nextDouble();

      number3 = keyboard.nextDouble();

      // Compute and output average

      average = (number1 + number2 + number3) / 3;

      System.out.println(average);


   }//main
}//class