import java.util.Scanner;
/****
 ***** Created by jayne on 19 10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class TestMethods
{
   static Scanner keyboard = new Scanner (System.in);
   static String firstName;
  static int guessNumber;
  static int numb1, numb2, productNumber;

  static boolean correct;

   static void whoAmI()
   {
      System.out.println("Please enter your first name : ");
      firstName = keyboard.nextLine();
   }//whoAmI

   static void goodGuess()
   {
      final int HUNDRED = 100;
      System.out.println(firstName + ", please enter an integer number : ");
      numb1 = keyboard.nextInt();
      System.out.println(firstName + ", please enter another integer number : ");
      numb2 = keyboard.nextInt();

      if (correct)
      {
         System.out.println(" You have guessed the correct number");
      }
      else
         System.out.println("The number you have guessed is incorrect");
   }//goodGuess

   public static void productOfNumbers()
   {
      System.out.println(firstName + ", please enter an integer number : ");
      numb1 = keyboard.nextInt();
      System.out.println("Please enter another integer number : ");
      numb2 = keyboard.nextInt();
      productNumber = numb1 * numb2;
      System.out.println("The product of " + numb1 + " and " + numb2 + " is " + productNumber);

   }//productOfNumbers

   public static void maxNumber()
   {
      System.out.println("Please enter an integer number : ");
      numb1 = keyboard.nextInt();
      System.out.println("Please enter another integer number : ");
      numb2 = keyboard.nextInt();
      if (numb1 > numb2)
         System.out.println("Number1 is the max number");
      else
         System.out.println("Number 2 is the max number");

   }

   public static void main(String[] args)
   {
      whoAmI();
      goodGuess();
      productOfNumbers();
      maxNumber();


   }//main
}//class