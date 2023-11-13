import java.util.Scanner;
/****
 ***** Created by jayne on 12/10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Donations
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      String largestDonar;
      String name = "unknown";
      int largestAmount = 0;
      int amount=0;
      int totalAmount=0;


      do
      {
         System.out.println("How much would you like to donate?");
         amount = keyboard.nextInt();
         totalAmount += amount;


         if (amount > largestAmount)
         {
            largestAmount = amount;

         }
      }
      while(totalAmount<500);

      System.out.println("The charity has reached its target");
      System.out.println("They have received " + (totalAmount/amount) + " donations");
      System.out.println("The largest donor was from " + name + " for £" + largestAmount);


   }//main
}//class