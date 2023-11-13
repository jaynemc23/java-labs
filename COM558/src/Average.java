import java.util.Scanner;
import java.text.DecimalFormat;
/****
 ***** Created by Jayne Mc Laughlin on 9/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Average
{

   public static void main(String[] args)
   {

      final int STOP_VALUE =0;
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");

      int numberEntries=0;
      int input=0;
      double average=0;
      double total=0;

      do
      {
         System.out.println("Please enter a whole number or " + STOP_VALUE + " to exit.");
         input = keyboard.nextInt();
         keyboard.nextLine();

         if (input != STOP_VALUE)
         {
            numberEntries++;
            total += input;
         }
      }//do
      while(input !=0);

      if(numberEntries > 0)
      {
         average = total / numberEntries;
         System.out.println("Your total is: " + total);
         System.out.println("The average of these numbers is: " + df.format(average));
      }//if
      else
      {
         System.out.println("You didn't input any numbers");
      }//else


   }//main
}//class