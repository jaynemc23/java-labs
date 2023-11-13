import java.util.Scanner;     //importing Scanner class
/****
 ***** Created by Jayne Mc Laughlin on 24/09/2023
 ***** Calculate rectangle area
 *****/
public class CalculateRectangleArea
{// program to read length and breadth of a rectangle from the
   //keyboard and calculate and display the area and perimeter

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      double length, breadth, area, perimeter;

      System.out.print("Enter length of rectangle - ");
      length = keyboard.nextDouble();

      System.out.print("Enter breadth of rectangle - ");
      breadth = keyboard.nextDouble();

      area = length * breadth;
      System.out.print("Area of rectangle = " + area + "\n");

      perimeter = 2.0 * (length + breadth);
      System.out.print("Perimeter of rectangle = " + perimeter);
   }//main
}//class