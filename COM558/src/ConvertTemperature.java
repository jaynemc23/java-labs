import java.util.Scanner;
import java.text.DecimalFormat;
/****
 ***** Created by Jayne Mc Laughlin on 29/09/2023
 ***** Converting temperatures from centigrade to Fahrenheit
 *****/
public class ConvertTemperature
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat ("000.00");

      //Declaring and initialising variables
      double centigrade;
      double fahrenheit;

      System.out.println("Please enter the temperature in centigrade ");
      centigrade = keyboard.nextDouble();

      //Calculations
      fahrenheit = ((double) 9 / 5 * centigrade) + 32;
      System.out.println(centigrade + " degrees centigrade = " + fahrenheit + " degrees fahrenheit");

      

   }//main
}//class