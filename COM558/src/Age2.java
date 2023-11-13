import java.util.Scanner;
/****
 ***** Created by Jayne Mc Laughlin on 5/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Age2
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      String name;
      int age;

      System.out.println("Please enter your name: ");
      name = keyboard.nextLine();

      System.out.println("Please enter your age: ");
      age = keyboard.nextInt();

      if (age >= 18)
      {
         System.out.println(name + " you are an adult aged " + age);
   }//if

      else

          {
            System.out.println(name + " you are a child aged " + age);
         }  //else
   }//main
}//class