import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.in;

/****
 ***** Created by Jayne Mc Laughlin on 12/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Dice
{


   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (in);
      int dice1, dice2;
      String choice = "";
      String roll = "roll";

      System.out.println("To roll the dice type 'roll' " );
      roll=keyboard.next();

      do
      {
         dice1 = (int) (Math.random() * 6);
         System.out.println("The first dice number is " + dice1);
         dice2 = (int) (Math.random() * 6);
         System.out.println("The second dice number is " + dice2);
         System.out.println("Roll again? (y/n): ");
         choice=keyboard.next();


      }
      while (choice.equals("y"));








   }//main
}//class