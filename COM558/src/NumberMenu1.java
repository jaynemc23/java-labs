import java.util.Scanner;
import java.text.DecimalFormat;
/****
 ***** Created by jayne on 24.10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class NumberMenu1
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      DecimalFormat df = new DecimalFormat("0.00");

      int number, choice, anotherChoice;

      do
      {
         //prompt user to enter number

         System.out.println("Enter a number : ");
         number = keyboard.nextInt();

         System.out.println(" 1. Test if zero ");
         System.out.println(" 2. Find square root ");
         System.out.println(" 3. Test if Odd or Even");
         System.out.println(" 4. Enter Another Number or Exit ");
         System.out.println("Enter a menu option : ");
         choice = keyboard.nextInt();

         switch (choice)
         {
            case 1:
               if (number == 0)
               {
                  System.out.println("The number you entered is zero");
               } else
               {
                  System.out.println("The number you entered is not zero");
               }
               break;

            case 2:
               if (number >= 0)
               {
                  double sqrt = Math.sqrt(number);
                  System.out.println("The square root of the number is : " + df.format(sqrt));
               } else
               {
                  System.out.println("The square root is not shown for negative numbers");
               }
               break;

            case 3:
               if (number % 2 == 0)
               {
                  System.out.println("The number entered is even");
               } else
               {
                  System.out.println("The number entered is odd");
               }

            case 4:
               System.out.println("Enter 1 to continue with another number, or enter 0 to Exit");
               anotherChoice = keyboard.nextInt();
               if (anotherChoice == 1)
               {
                  System.out.println("Enter another number: ");
                  choice = keyboard.nextInt();
               }
               else
               {
                  System.out.println("Exiting program");
               }
               break;
            default:
               System.out.println("Invalid choice");
               break;
         }
      }

         while(choice!=0 & choice!= 2 & choice!= 3);


   }//main
}//class