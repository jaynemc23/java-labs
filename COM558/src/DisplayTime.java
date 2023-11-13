import java.util.Scanner;
/****
 ***** Created by Jayne Mc Laughlin on 29/09/2023
 ***** calculate time in from seconds to minutes
 *****/
public class DisplayTime
{


   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      //Declaring and initialising variables
      final int SIXTY = 60;
      int seconds;
      int minutes;
      int seconds2;

      //Prompt and read
      System.out.println("Please enter time in seconds : ");
      seconds = keyboard.nextInt();

      //Calculations
      minutes = seconds / SIXTY;
      seconds2 = seconds % SIXTY;

      //Print
      System.out.println(seconds + " seconds is " + minutes + " minutes and "+ seconds2 + " seconds");

   }//main
}//class