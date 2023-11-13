import java.util.Scanner;
/****
 ***** Created by jayne mc laughlin on 12/10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class DisplayMenu
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);
      int menuChoice;

      do
      {
         System.out.println("1.  Enter your name ");
         System.out.println("2.  Enter your address");
         System.out.println("3.  Exit");
         System.out.println("Please enter your menu selection");

         menuChoice=keyboard.nextInt();
      }

         while (menuChoice!=1 & menuChoice!=2 & menuChoice!=3);
      System.out.println("Your menu selection was " + menuChoice);
   }//main
}//class