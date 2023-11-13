import java.util.Scanner;
import java.text.DecimalFormat;
/****
 ***** Created by jayne on 26.10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Divisr
{

   public static void main(String[] args)
   {

      Scanner keyboard = new Scanner(System.in);
      int startNumber;
      int finishNumber;
      int divisor;

      // prompts for a start number, a finish number
      System.out.println("Enter your start number : ");
      startNumber = keyboard.nextInt();
      System.out.println("Enter your finish number : ");
      finishNumber = keyboard.nextInt();
      System.out.println("Enter your divisor number : ");
      divisor = keyboard.nextInt();

      //(assume start < finish) and a divisor,
      for (int number=startNumber; number <= finishNumber; number++)
      {
         if (number % divisor == 0 )
         {
            System.out.println("Output:   " + number);
         }
      }//for
   }//main
}//class