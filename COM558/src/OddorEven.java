import java.util.Scanner;
/****
 ***** Created by Jayne Mc Laughlin on 2/10/2023
 ***** Calculate if number is odd or even
 ******/
public class OddorEven
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      //Declaring and initialising variables
      int input;

      System.out.println("Please enter a integer number: ");
      input = keyboard.nextInt();

      if (input % 2 == 0)
      {
         System.out.println(input + " this number is even.");
   }//if

      else
      {
         System.out.println(input + " this number is odd");
      }//else


   }//main
}//class