import java.util.Scanner;
import java.text.DecimalFormat;
/****
 ***** Created by jayne on 26.10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class NumberMenu2
{
   static Scanner keyboard = new Scanner (System.in);
   static DecimalFormat df = new DecimalFormat("0.00");
   static int inputNumber, choice, secondNumber;

   public static void testZero(int testNumber)
   {
      if (testNumber == 0)
      {
         System.out.println("This number is zero");
      }
      else
      {
         System.out.println("This number is not zero");
      }
   }//testZero

   public static void squareRoot(int number)
   {
      if (number >= 0)
      {
         double sqrt = Math.sqrt(number);
         System.out.println("The square root of the number is : " + df.format(sqrt));
      } else
      {
         System.out.println("The square root is not shown for negative numbers");
      }
   }//squareRoot

   public static void oddOrEven (int number)
   {
      if (number % 2 == 0)
      {
         System.out.println("The number entered is even");
      }
      else
      {
         System.out.println("The number entered is odd");
      }
   }//oddOrEven

   public static int exitOrAnotherNumber(int zero, int anotherNumber)
   {
      System.out.println("Enter 1 to continue with another number, or enter 0 to Exit");
      anotherNumber = keyboard.nextInt();
      if (anotherNumber == 1)
      {
         System.out.println("Enter another number: ");
         secondNumber = keyboard.nextInt();
      }
      else
      {
         System.out.println("Exiting program");
      }

      return zero;
   }

   public static void main(String[] args)
   {
      do
      {
         //prompt user to enter number

         System.out.println("Enter a number : ");
         inputNumber = keyboard.nextInt();

         System.out.println(" 1. Test if zero ");
         System.out.println(" 2. Find square root ");
         System.out.println(" 3. Test if Odd or Even");
         System.out.println(" 4. Enter Another Number or Exit ");
         System.out.println("Enter a menu option : ");
         choice = keyboard.nextInt();

         switch (choice)
         {
            case 1:
            {
               testZero(inputNumber);
            }
            break;
            case 2:
            {
               squareRoot(inputNumber);
            }
            break;
            case 3:
            {
               oddOrEven(inputNumber);
            }
            break;
            case 4:
            {
               exitOrAnotherNumber(1,0);
            }
         }//do
      }
         while (choice!=0 & choice!= 2 & choice!= 3);

   }//main
}//class