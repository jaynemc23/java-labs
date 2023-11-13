package Lab1;
import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Double.sum;

/****
 ***** Created by jayne on 5/11/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class MethodOverloading
{
   static Scanner keyboard = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat("0.00");
   static double area, sum;
   static int equilateralSide;

   ///Method to calculate the area of an equilateral triangle
   public static double calculateArea(int pSide)
   {
      return (double) (Math.sqrt(3) / 4) * (pSide * pSide);

   }//calculateArea

   //Method to calculate the area of an isosceles triangle
   public static double calculateArea(int pSide1, int pSide2)
   {
      return area = (double) (pSide1 * pSide2) / 2;

   }//calculateArea


   //Method to calculate the area of a scalene triangle
   public static double calculateArea(int pSide1, int pSide2, int pSide3)
   {
      sum = (double) (pSide1 + pSide2 + pSide3) /2;
     return area = Math.sqrt(sum * (sum - pSide1) * (sum - pSide2) * (sum - pSide3));
   }

   public static void main(String[] args)
  {
     int equilateralSide;

     System.out.println("Equilateral Triangle");
     System.out.println("********************");
     System.out.println("Enter the length of the side of the equilateral triangle: ");
     equilateralSide = keyboard.nextInt();
     System.out.println("The area of the triangle is " + df.format(calculateArea(equilateralSide)) + " units squared\n");

     System.out.println("Isosceles Triangle");
     System.out.println("********************");
     System.out.println("Enter the length of the side of the Isosceles triangle: ");
     equilateralSide = keyboard.nextInt();
     System.out.println("The area of the triangle is " + df.format(calculateArea(equilateralSide)) + " units squared\n");

     System.out.println("Scalene Triangle");
     System.out.println("********************");
     System.out.println("Enter the length of the side of the Scalene triangle: ");
     equilateralSide = keyboard.nextInt();
     System.out.println("The area of the triangle is " + df.format(calculateArea(equilateralSide)) + " units squared\n");
   }//main
}//class