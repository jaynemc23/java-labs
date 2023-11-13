import java.util.Scanner;
import java.lang.*;
/****
 ***** Created by jayne` on 12/10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class FindNumber1
{

   public static void main(String[] args)
   {
      final int SEARCHNUMBER = 9;
      int number=0;
      int count=0;

      Scanner keyboard = new Scanner(System.in);
      System.out.println("Looking for number 9");

      do
      { number = (int)(Math.random() * 10);

     System.out.println("The number is " + number);
         count+=1;
      }
      while(number!=SEARCHNUMBER);
      System.out.println("Found search number - " + number);

      System.out.println("It took " + count + " tries to guess the correct number.");

   }//main
}//class