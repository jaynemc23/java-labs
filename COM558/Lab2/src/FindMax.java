import java.util.Scanner;
/****
 ***** Created by jayne mc laughlin on 19/10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class FindMax
{
   static int num1, num2;
   static Scanner keyboard = new Scanner(System.in);

   public static void main(String[] args)
   {
      System.out.println("Please enter number 1");
      num1 = keyboard.nextInt();
      System.out.println("Please enter number 2");
      num2 = keyboard.nextInt();

      if (num1>num2)
      {
         System.out.println("Number 1 is the max number");
      }
         else
         System.out.println("Number 2 is the max number");

   }//main
}//class