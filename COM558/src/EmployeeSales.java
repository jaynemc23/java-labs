import java.util.Objects;
import java.util.Scanner;
/****
 ***** Created by jayne on 23/10
 ***** Read in employee sales and output their level
 *****/
public class EmployeeSales
{
   static Scanner keyboard = new Scanner (System.in);

   //Method to read in and return name
public static String enterName()
   {
      System.out.println("Enter your name : ");
      return keyboard.nextLine();
   }//enterName()

   //Method to read in and return a value
   public static double enterValue(String saleType)
   {
      System.out.println();
      System.out.println("Enter the " + saleType + " value: ");
      return keyboard.nextDouble();
   }//enterValue

   //Method to check if a value is in the range 0..100
   public static boolean checkValue(double value)
   {
      return (value >= 0) && (value <= 100);
   }//checkValue

   //Method to assign and return the overall value

   public static double calculateValue(double cashSales, double cardSales)
   {
      return Math.round((cashSales + cardSales) / 2);
   }//calculateValue

   //Method to assign and return the overall level

   public static String assignLevel(double cashSales, double cardSales, double finalLevel)
   {
      final int STEADY = 40 ;
      final int OUTSTANDING = 70;

   if ((cashSales < STEADY) || (cardSales < STEADY))
      {
         return "Under Performing";
      }//if
   else {
      if (finalLevel < OUTSTANDING)
      {
         return "Steady";
      }//if
      else
      {
         return "Outstanding";
      }
      }//else
   }//assignLevel


//Method to out results
   public static void outputResults (String pName, double pCashSales, double pCardSales,  double pFinalLevel)
   {
      System.out.println();
      System.out.println("Name \t\t\t\t\t CashSales     \t\t CardSales   \t\t Overall");
      System.out.println(pName    +					(int)    pCashSales   + 					 (int)   pCardSales    + 			   (int)  pFinalLevel +       assignLevel(pCashSales, pCardSales, pFinalLevel));
   }//outputResults

   public static void main(String[] args)
   {
      String name;
      double cashSales, cardSales, finalLevel;
      boolean cashSalesValueOK, cardSalesValueOK;

      name = enterName();
      cashSales = enterValue("cash sales");
      cashSalesValueOK = checkValue(cashSales);
      if (cashSalesValueOK) {
         cardSales=enterValue("card sales");
         cardSalesValueOK = checkValue  (cardSales);

        if (cardSalesValueOK)
        {
           finalLevel = calculateValue(cashSales, cardSales);
           outputResults(name, cashSales, cardSales, finalLevel);
         }//if

         else
         {
            System.out.println("Cash sales value out of range");
         }//else
      }//if

      else
      {
         System.out.println("Card sales value out of range");
      }
   }//main
}//class