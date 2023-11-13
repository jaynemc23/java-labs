package Lab1;

import java.util.Scanner;

/****
 ***** Created by jayne on 5/11/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Transport
{
   static Scanner keyboard = new Scanner(System.in);
   static final int HIGHWEIGHT = 1000;
   static final int HIGHCOST = 1200;
   static final int LOWWEIGHT = 500;
   static final int MIDDLECOST = 750;
   static final int LOWCOST = 400;
   static final int DISCOUNTNUMBER = 5;
   static double DISCOUNTRATE = 0.25;
   static int weight;
   static final int TERMINATOR = -1;
   static int totalWeight = 0;
   static int numberOfContainers = 0;
   static double cost;

   public static int getWeight(int number)
   {
      System.out.println("Please enter the weight of container" + "(in kg) or -1 to finish: ");
      number = keyboard.nextInt();
      return number;
   }//get weight

   public static int calculateCost(int number, int weight)
   {
      if (weight>HIGHWEIGHT)
         cost = HIGHCOST;

                 else
                    if (weight > LOWWEIGHT)
                    {
                       cost = MIDDLECOST;
                    }
                    else
                    {
                       cost = LOWCOST;
                    }
                    if (number <= DISCOUNTNUMBER)
                    {
                       cost = cost - (cost * DISCOUNTRATE);
                    }
                    return (int) cost;
   }


   public static void main(String[] args)
   {
      weight = getWeight(1);

      while (weight != TERMINATOR)
      {
         totalWeight += weight;
         numberOfContainers++;
         weight =  getWeight(numberOfContainers);
      }

      cost = calculateCost(numberOfContainers, totalWeight);

      System.out.println("The total number of containers is " + numberOfContainers);
      System.out.println("The total weight of the containers is " + totalWeight);
      System.out.println("The total cost of transport " + cost);

   }//main
}//class