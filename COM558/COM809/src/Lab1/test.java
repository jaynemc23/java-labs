package Lab1;
import java.text.DecimalFormat;
import java.util.Scanner;


/****
 ***** Created by j on
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class test
{
   static Scanner keyboard = new Scanner(System.in);
   static DecimalFormat df = new DecimalFormat("0.00");
   static double area;
   static int equilateralSide;
   public static double calculateArea(int pSide) {
      return area = (Math.sqrt(3) / 4) * pSide * pSide;
   }

   public static void main(String[] args)
   {
      System.out.println("Equilateral Triangle");
      System.out.println("********************");
      System.out.println("Enter the length of the side of the equilateral triangle: ");
      equilateralSide = keyboard.nextInt();
      System.out.println("The area of the triangle is " + df.format(calculateArea(equilateralSide)) + " units squared\n");

   }//main
}//class