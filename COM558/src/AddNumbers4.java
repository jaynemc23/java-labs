import java.util.Scanner;
/****
 ***** Created by jayne on 24/10
 ***** WHILE LOOP PROGRAM
 *****/
public class AddNumbers4
{
   static final int TERMINATOR =-99;


   public static void main(String[] args)
   {
      int number;
      int total = 0;
      Scanner keyboard = new Scanner (System.in);

      System.out.println("Please enter next number or TERMINATOR -999");
      number = keyboard.nextInt();

      while (number!=TERMINATOR)
      {
         total = total + number;
         System.out.println("Enter another number (or -999 to finish) : ");
         number = keyboard.nextInt();
      }//while

      System.out.println("Total of numbers = " + total);
   }//main
}//class