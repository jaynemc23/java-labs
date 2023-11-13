import java.util.Scanner;
import java.text.DecimalFormat;
/****
 ***** Created by jayne on
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Tax1
{
   public static void main(String[] args)
   {
      final int CUTOFF = 10000;
      final double TAX = 0.2;

      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat("00.00");  //import statement needed
      double grossPay, netPay, tax=0;

      //Prompt and read in grossPay
         System.out.println("Please enter your gross pay £ ");
         grossPay = keyboard.nextDouble();
         netPay = grossPay;


      grossPay = keyboard.nextDouble();   //clear buffer????

         if (grossPay>10000)
         {
            tax = grossPay*TAX;
            netPay=grossPay-tax;

         }//if

         System.out.println("\n\nYour gross pay is £" + df.format(grossPay));
         System.out.println("Your tax is £ " + df.format(tax));
         System.out.println("Your net pay is £ " + df.format(netPay));

   }//main
}//class
