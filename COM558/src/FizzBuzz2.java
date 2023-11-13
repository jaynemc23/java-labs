import java.util.Scanner;
/****
 ***** Created by Jayne Mc Laughlin on 11/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class FizzBuzz2
{
   public static void main(String[] args)
   {
      final int FIZZ = 3;
      final int BUZZ = 7;
      Scanner keyboard = new Scanner(System.in);
      int start;
      int finish;

      System.out.println("Please enter a start value: ");
      start=keyboard.nextInt();
      System.out.println("Please enter a finish value: ");
      finish=keyboard.nextInt();

   for (int count = start; count <= finish; count++ )
   {

      if (count % FIZZ == 0)
      {
         System.out.println("FIZZ");
      }

      if (count % BUZZ == 0)
      {
         System.out.println("BUZZ");
      }

      if ((count % FIZZ == 0) && (count % BUZZ == 0))
      {
         System.out.println("FIZZ BUZZ");
      }

      else
      {
         System.out.println(count);
      }


   }
   }//main
}//class