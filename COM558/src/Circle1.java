import java.util.Scanner;     //importing Scanner class
/****
 ***** Created by jayne mc laughlin on 24/09/2023
 ***** calculating circle
 *****/
public class Circle1
{

   public static void main(String[] args)
   {
      final double MULTIPLIER = 2.0;
      Scanner keyboard = new Scanner(System.in);
      double radius,area, circumference;

      System.out.print("Enter radius of a circle - ");
      radius = keyboard.nextDouble();

      System.out.print("\n");    //skip a line

      area = Math.PI * radius * radius;
      System.out.print("Area of circle =" + area + "\n\n");

      circumference = MULTIPLIER * Math.PI * radius;
      System.out.print("Circumference of circle =" + circumference);

   }//main
}//class