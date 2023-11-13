import java.util.Scanner;
import java.text.DecimalFormat;
/****
 ***** Created by Jayne Mc Laughlin on 2/10/2023
 ***** Calculate the square root of user's input
 *****/
public class SquareRoot
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      DecimalFormat df = new DecimalFormat("00.00");
      int input;
      double inputSq;

      //Prompt user
      System.out.println("Please enter a whole number: ");
      input = keyboard.nextInt();
      keyboard.nextLine(); //CLEAR THE BUFFER

      if (input>0)
      {
         inputSq = Math.sqrt(input);
         System.out.println("The square root of " + input + (" = ") + df.format(inputSq));
      }//if

      else if (input==0)
      {
         System.out.println("This number has no square root.");
      }
      
   }//main
}//class