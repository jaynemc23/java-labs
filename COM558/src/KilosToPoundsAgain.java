import java.util.Scanner;
import java.text.DecimalFormat;
/****
 ***** Created by jayne on 25.10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class KilosToPoundsAgain
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
       DecimalFormat df = new DecimalFormat("00.00");

      double pounds;

      for(int kilo=5; kilo<=100; kilo+=5)
      {
            pounds = kilo * 2.2;
            System.out.println("Kilograms \t\t\t Pounds");
            System.out.println(kilo +" \t\t\t "	+ 	" \t\t " + df.format(pounds));
         }//for
   }//main
}//class