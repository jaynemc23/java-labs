import java.util.Scanner;
/****
 ***** Created by Jayne Mc Laughlin on 8/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class AddNumbers1
{ static final int TERMINATOR = -999;
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      int number;
      int total=0;
      int count=0;
      double average;

         System.out.println("Enter a Number");
         number = keyboard.nextInt();

         while (number!= TERMINATOR)
         {
            total = total + number;
            count = count + 1;
            System.out.println("Enter another number - ");
            number = keyboard.nextInt();
         }//while

         System.out.println("The Total of the numbers = " + total );
         System.out.println("The number of numbers = " + count );
         average = (double) total /count;
         System.out.println("The average of the numbers = " + average );
      
   }//main
}//class