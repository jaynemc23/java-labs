import java.util.Scanner;
/****
 ***** Created by jayne mc laughlin on 17/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Circle3
{  //declaring a constant
   static final double MULTIPLIER = 2.0;
   static double radius;

   //a method to calculate the area
   static double getArea()
   {
      return Math.PI * Math.pow (radius, MULTIPLIER);
      //return statement
   }//getArea

   //a method to calculate the circumference
   static double getCircumference ()
   {
      return MULTIPLIER * Math.PI * radius;
      //return statement
   }//getCircumference

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      double area, circumference;

      System.out.println("Enter radius of a circle - ");
      radius = keyboard.nextDouble();

      area = getArea();
      //call the getArea() method

      circumference = getCircumference();
      //call the getCircumference() method

      System.out.println("Area of circle = " + area + "\n\n");

      System.out.println("Circumference of circle = " + circumference);
   }//main
}//class