import java.util.Scanner;
import java.text.DecimalFormat;
/****
 ***** Created by jayne on 22/10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class TestMethods2
{
   static final int THREE = 3;
   static Scanner keyboard = new Scanner (System.in);
   static DecimalFormat df = new DecimalFormat("00.00");
   static int input, input2, number, number2;
   static double yards, feet, inches, metres;

   static String conversion = "";

   static int parameter;

//Method for multiplyBy3
   public static int multiplyBy3(int pInput)
   {
      return pInput * THREE;
   }//multiplyBy3

   public static int addOne(int pInput2)
   {
      pInput2++;
      return pInput2;
   }

   public static int productOf(int pNumber, int pNumber2)
   {
      return pNumber * pNumber2;
   }

   public static double convertToMetres(double pYards,double pFeet, double pInches)
   {
      return (pYards * 0.91) + (pFeet * 0.30) + (pInches * 0.02);
   }

   public static String convertToWords(int pNum)
   {
      String result = "";
      switch (pNum)
      {
         case 0:
            result = "zero";
            break;
         case 1:
            result = ("one");
            break;

         case 2:
            result = ("two");
            break;

         case 3:
            result = ("three");
            break;

         case 4:
            result = ("four");
            break;

         case 5:
            result = ("five");
            break;

         case 6:
            result = ("six");
            break;

         case 7:
            result = ("seven");
            break;

         case 8:
            result = ("eight");
            break;

         case 9:
            result = ("nine");
            break;
      }
      return result;
   }

   public static void main (String[] args)
   {
      System.out.println("Please enter an integer value : ");
      input = keyboard.nextInt();
      input = multiplyBy3(input);
      System.out.println("The result of trebling the value = " + input);

      System.out.println("Please enter an integer value : ");
      input2 = keyboard.nextInt();
      input2 = addOne(input2);
      System.out.println("The value is now = " + input2);

      System.out.println("Please enter an integer number : ");
      number = keyboard.nextInt();
      System.out.println("Please enter another integer number : ");
      number2 = keyboard.nextInt();
      number = productOf(number, number2);
      System.out.println("The Product of those two numbers is " + number );

      System.out.println("Please enter the length in yards : ");
      yards = keyboard.nextDouble();
      System.out.println("Please enter the length in feet : ");
      feet = keyboard.nextDouble();
      System.out.println("Please enter the length in inches : ");
      inches = keyboard.nextDouble();
      metres = convertToMetres(yards, feet, inches);
      System.out.println("The length of parameters in metres : " + df.format(metres));

      System.out.println("Please enter an integer value between 0-9 : ");
      parameter = keyboard.nextInt();
      conversion = convertToWords(parameter);
      System.out.println(conversion + " ");

   }//main
}//class