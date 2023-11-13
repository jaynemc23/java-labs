import java.util.Scanner;
/**** File name: ReadIntVariables
 ***** Created by Jayne Mc Laughlin  on 24/09/2023
 ***** Use the Scanner programme to read values from the keyboard
 *****/
public class ReadIntVariables
{
   public static void main(String[] args)
   {  Scanner keyboard = new Scanner (System.in);
      //Sets up an object of the Scanner class allowing us to
      //use it to read values from the keyboard

      int length, breadth;
      //declare two integer variables length and breadth

      System.out.println("Please enter a value for the length");
      //always prompt the user for a value first then read
      //from the keyboard
      length = keyboard.nextInt();

      //returns the next keyboard input as a value of type int
      //to the variable length

      System.out.println("Please enter a value for the breadth");
      //always prompt the user for a value first then read
      //from the keyboard

      breadth = keyboard.nextInt();
      //returns the next keyboard input aas a value of type int
      //to the variable breadth

      System.out.println("The value entered for length is" + length);
      System.out.println("The value entered for breadth is" + breadth);

   }//main
}//class