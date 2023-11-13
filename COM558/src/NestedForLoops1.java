/****
 ***** Created by jayne on 13/10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class NestedForLoops1
{


   public static void main(String[] args)
   {

      final int MAX = 5;

      for (int innerLoop = 1; innerLoop <= 5; innerLoop++)
      {

         for (int outerLoop = 1; outerLoop <= innerLoop; outerLoop++)
         {
            System.out.println(outerLoop + "\t");

         }
      }


   }//main
}//class