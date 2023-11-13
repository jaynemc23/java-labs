import java.util.Scanner;
/****
 ***** Created by jayne mc laughlin on 15/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class TimeDifference
{
   static final int SIXTY = 60;
   static final int ONE = 1;
   //declare here to be accessible to the whole class
   static int startHours, startMinutes, startSeconds, finishHours, finishMinutes, finishSeconds;

   static int hours, minutes, seconds;
   //method to read in the startTime and finishTime
   static void readData()

   {
      Scanner keyboard = new Scanner (System.in);

      System.out.println("Please enter the start time in hours -  " );
      startHours = keyboard.nextInt();
      System.out.println("Please enter the start time in minutes -  " );
      startMinutes = keyboard.nextInt();
      System.out.println("Please enter the start time in seconds -  " );
      startSeconds = keyboard.nextInt();
      System.out.println("Please enter the finish time in 24 hour clock, the hours -  " );
      finishHours = keyboard.nextInt();
      System.out.println("Please enter the finish time in 24 hour clock, the minutes -  " );
      finishMinutes = keyboard.nextInt();
      System.out.println("Please enter the finish time in 24 hour clock, the seconds -  " );
      finishSeconds = keyboard.nextInt();

   }//method

   //Method to calculate the time difference
   static void calculateDifference()
   {
      if (finishSeconds<startSeconds)
      {
         finishMinutes -= 1;
         finishSeconds += 60;
      }
      seconds = finishSeconds - startSeconds;
      if (finishMinutes<startMinutes)
      {
         finishHours -= ONE;
         finishMinutes += SIXTY;
      }
      minutes = finishMinutes - startMinutes;

      hours = finishHours - startHours;

   }// calculateDifference

   //method to output the results
static void outputResults()
{
   System.out.println("The start time is " + startHours + " : " + startMinutes + " : " + startSeconds);

   System.out.println("The finish time is " + finishHours + " : " + finishMinutes + " : " + finishSeconds);


   System.out.println("The time difference is " + hours + " : " + minutes + " : " + seconds);
}

   public static void main(String[] args)
   {
      readData();
      calculateDifference();
      outputResults();
   }//main
}//class