import java.util.Scanner;
import java.text.DecimalFormat;
/****
 ***** Created by Jayne Mc Laughlin on 29/09/2023
 ***** calculates the density of an object given its mass
 ***** and volume
 *****/
public class Density
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");

      //Declaration and initialisation of variables
      double density, mass, volume;

      System.out.println("Please enter the Mass : ");
      mass = keyboard.nextDouble();

      System.out.println("Please enter the Volume : ");
      volume = keyboard.nextDouble();

      //Calculations
      density = mass / volume;

      //Prints
      System.out.println("Mass = " + mass + " kg");
      System.out.println("Volume = " + volume + " metres cubed");
      System.out.println("Density = " + density + " kg per metre cubed");
   }//main
}//class