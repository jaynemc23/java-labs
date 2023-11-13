import java.util.Scanner;
/****
 ***** Created by Jayne Mc Laughlin on 5/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Age
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner (System.in);

      int age =22;

      System.out.println("Please enter you age");
      age=keyboard.nextInt();

      //if
      if ((age>18) && (age<55))
      {
         System.out.println("You can register for a ticket");
      } //if

      else
      {
         System.out.println("You cannot register for a ticket");
      }//else
   }//main
}//class