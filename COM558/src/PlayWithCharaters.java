import java.util.Scanner;
/****
 ***** Created by jayne mc laughlin on 27/09/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class PlayWithCharaters
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      //Declaration of variables
      String input;
      char letter;

      //Prints out
      System.out.print ("Please enter our name: ");
      input = keyboard.nextLine();
      letter = input.charAt(0);

      System.out.println ("Your letter is: " + letter);
   }//main
}//class