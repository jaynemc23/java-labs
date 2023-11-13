import java.util.Scanner;
import java.text.DecimalFormat;
/****
 ***** Created by Jayne Mc Laughlin on 2/10/2023
 ***** Calculate the gross pay using tax
 *****/
public class Tax3
{
   public static void main(String[] args)
   {
      final double HIGH_TAX= 0.4;
      final double LOW_TAX=0.2;
      final double LIMIT1=10000, LIMIT2=40000;
      Scanner keyboard = new Scanner(System.in);
      DecimalFormat df = new DecimalFormat ("00.00");

      //Declaring and initialising variables
      double grossPay, taxPay, netPay;

      //Prompt user to enter grossPay
      System.out.println("Please enter our gross pay £ ");
      grossPay= keyboard.nextDouble();

      //Decision
      //0-10000
      //+10000 - 40000
      //>40000

      //70000

      if (grossPay > LIMIT2)   //FROM 10000 TO 40000
      {
         taxPay = (grossPay - LIMIT2) * HIGH_TAX;
         taxPay = taxPay +(grossPay -LIMIT1) * LOW_TAX;
      }//if

      else if (grossPay > LIMIT1)
      {     //calculate for tax
         taxPay = (grossPay - LIMIT1) * LOW_TAX;
      }//if

      else
      {
         taxPay=0;
      }//else

      //Calculations
      netPay = grossPay - taxPay;

      //Prints
         System.out.println("Your gross pay is £" + df.format(grossPay));
         System.out.println("The net pay is £ " + df.format(netPay));
         System.out.println("Your tax is £" + df.format(taxPay));



   }//main
}//class