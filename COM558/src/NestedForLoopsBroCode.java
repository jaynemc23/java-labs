import java.util.Scanner;
/****
 ***** Created by jayne on 26/10
 ***** A loop inside a loop - NESTED LOOPS
 *****/
public class NestedForLoopsBroCode
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      int rows;
      int columns;

      System.out.println("Enter # of rows: ");
      rows = keyboard.nextInt();
      System.out.println("Enter # of columns: ");
      columns = keyboard.nextInt();
      System.out.println("Enter symbol to use: ");
      String symbol = keyboard.next();

      for (int count = 1 ; count <=rows ; count++)
      {
         System.out.println();
         for(int count2 = 2; count2 <= columns; count2 ++)
         {
            System.out.println(symbol);
         }
      }


   }//main
}//class