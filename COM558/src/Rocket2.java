import java.util.Scanner;
import java.text.DecimalFormat;

/****
 ***** Created by jayne on 22.10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Rocket2
{
  static int takeOffHour, takeOffMinute, takeOffSecond;
  static  int flightTime, hours, minutes, seconds;
  static int arrivalHour, arrivalMinute, arrivalSecond;

   static DecimalFormat df = new DecimalFormat("00");
   static Scanner keyboard = new Scanner(System.in);

   //method readData() - read in blast-off time(hours, minutes and seconds)
   public static void readData ()
   {
      System.out.println("What is the take-off time (24-hour clock):");
      System.out.print("Hour: ");
      takeOffHour = keyboard.nextInt();
      System.out.print("Minutes: ");
      takeOffMinute = keyboard.nextInt();
      System.out.print("Seconds: ");
      takeOffSecond = keyboard.nextInt();


      System.out.println("How long is the flight time in seconds?");
      flightTime = keyboard.nextInt();
   }//readData


   //calculations

   public static void calculateArrivalTime ()
   {
       final int SECMINHOUR =60;
       final int HOURSINDAY = 24;

      arrivalSecond = takeOffSecond + flightTime;
      arrivalMinute = takeOffMinute + (arrivalSecond / SECMINHOUR);
      arrivalSecond = arrivalSecond % SECMINHOUR;
      arrivalHour = takeOffHour + (arrivalMinute / SECMINHOUR);
      arrivalMinute = arrivalMinute % SECMINHOUR;
      arrivalHour = arrivalHour % HOURSINDAY;
   }

   //output results
   public static void outputResults()
   {
      System.out.println("Take-off time :       " + df.format(takeOffHour) + ":" + df.format(takeOffMinute) + ":" + df.format(takeOffSecond));
      System.out.println("Flight time:          " + df.format(flightTime));
      System.out.println("Expected Arrival Time:         " + df.format(arrivalHour)+ ":" + df.format(arrivalMinute) + ":" + df.format(arrivalSecond));
   }//outputResults


   public static void main(String[] args)
   {
      readData();
      calculateArrivalTime();
      outputResults();


   }//main
}//class