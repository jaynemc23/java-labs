import java.util.Scanner;
/****
 ***** Created by jayne mc laughlin on 27/09/2023
 ***** Program for explaining next() and next.Line()
 *****/
public class PlayWithStrings
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
//Declaration of variables//
      String name, fullName;

      System.out.println("Please enter full name: ");
      fullName = keyboard.next();
      keyboard.nextLine();

         System.out.println("Your full name is: "+ fullName);

         System.out.println("Please enter full name; ");
         fullName = keyboard.nextLine();

         System.out.println("Your name is: " + fullName);
   }//main
}//class