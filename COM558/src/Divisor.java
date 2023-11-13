import java.util.Scanner;
/****
 ***** Created by Jayne Mc Laughlin on 9/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Divisor
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int finish;
      int start;
      int divisor;
      int total=0;
      double average = 0;
      double numberOfOutput = 0;

      System.out.println("Please enter a start number: ");
      start=keyboard.nextInt();

      System.out.println("Please enter a finish number: ");
      finish=keyboard.nextInt();

      System.out.println("Please enter a divisor number: ");
      divisor=keyboard.nextInt();

      System.out.println("Output:    ");

      do
      {

         if (start % divisor == 0)
         {
            System.out.println(start);
            total +=start;
            numberOfOutput++;
         }

            start++;

      }
      while (start<=finish);

      average = total / numberOfOutput;
      System.out.println("Total : " + ( total ));
      System.out.println("The average of the numbers: " + (average));
   }//main
}//class