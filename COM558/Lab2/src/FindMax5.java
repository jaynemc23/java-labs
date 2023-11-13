import java.util.Scanner;
/****
 ***** Created by jayne on 19.10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class FindMax5
{
   static int num1, num2;
   static Scanner keyboard = new Scanner (System.in);

//a re-useable method to get the numbers

   public static void getNumbers()
   {
      System.out.println("Please enter number 1");
      num1 = keyboard.nextInt();
      System.out.println("Please enter number 2");
      num2 = keyboard.nextInt();
   }//getNumbers

   public static void printAnswer()
   {
      if (num1 > num2)
         System.out.println("Number1 is the max number");
      else
         System.out.println("Number 2 is the max number");
   }//printAnswer

   public static void main(String[] args)
   {
      getNumbers();
      printAnswer();
      getNumbers();
      printAnswer();


   }//main
}//class