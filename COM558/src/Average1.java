import java.util.Scanner;
/****
 ***** Created by jayne on 25/10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Average1
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int numberOfEntries, input;
      int sum = 0;

      //user how many numbers they are going to enter,
      System.out.println("How many times will you enter a number :");
      numberOfEntries=keyboard.nextInt();

      // then reads in the numbers
      for(int number = 1; number <= numberOfEntries; number++)
      {
         System.out.println("Enter a whole number");
         input = keyboard.nextInt();
         sum+= input;
      }//for

      if (numberOfEntries >0 )
      {
         double average = (double) sum / numberOfEntries;
         System.out.println("The average of the numbers is : " + average);
      }//if
         else
      {
         System.out.println("No numbers to calculate the average");
      }//else
   }//main
}//class