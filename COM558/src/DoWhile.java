import java.util.Scanner;
/****
 ***** Created by Jayne Mc Laughlin on 8/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class DoWhile
{
   public static void main(String[] args)
   {
      int count, number;

      System.out.println("Enter a number ");
      Scanner keyboard = new Scanner(System.in);
      number = keyboard.nextInt();

      count=1;

      do
      {
         System.out.println(count + " , ");
         count++;
      } while (count <= number);

      System.out.println();
      System.out.println("Buckle my shoe");
   }//main
}//class