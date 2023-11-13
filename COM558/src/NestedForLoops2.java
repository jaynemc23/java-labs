import java.util.Scanner;
/****
 ***** Created by jayne on 13/10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class NestedForLoops2
{

   public static void main(String[] args)
   {
      final int MAX = 5;
      Scanner keyboard = new Scanner(System.in);
      int outerLoop;
      for (int innerLoop = 1; innerLoop <= 5; innerLoop++)
      {

         for (outerLoop = MAX; innerLoop <= outerLoop; innerLoop++)
         {
            System.out.println(outerLoop + "\t");
         }
      }
   }//main
}//class