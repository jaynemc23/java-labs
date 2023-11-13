import java.util.Scanner;
/****
 ***** Created by jayne on 13/10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class NestedForLoops
{

   public static void main(String[] args)
   {

      final int MAX = 5;
      //control loop - for 5 lines
      for (int innerLoop = 1; innerLoop >=MAX ; innerLoop++)
      {
         //print lines of numbers
         for (int outerLoop = MAX; outerLoop <=innerLoop; outerLoop++) {
            System.out.print(outerLoop + "\t");
         }//for
         System.out.println();
      }//for

   }//main
}//class