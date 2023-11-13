import java.util.Scanner;
/****
 ***** Created by Jayne Mc Laughlin on 5/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class CheckCase
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String input;
      char letter, upperLetter;

      System.out.println("Please enter a letter: ");
      input=keyboard.nextLine();
      letter= input.charAt(0);

      //if ((letter>='A') && (letter<='Z'))
      if (Character.isUpperCase(letter))
         System.out.println("Your original letter was: " + letter + " no conversion needed");

      else
      {
         upperLetter = Character.toUpperCase(letter);
         System.out.println("Your original letter was: " + letter + "your converted letter is " + upperLetter);
      }//else



   }//main
}//class