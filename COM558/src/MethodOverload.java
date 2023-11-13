import java.util.Scanner;
/****
 ***** Created by jayne on 26.10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class MethodOverload
{
public static double findMax(double pNum1, double pNum2)
{
   if(pNum1 > pNum2)
      return pNum1;
   else return pNum2;
}//findMax

   public static int findMax (int pNum1, int pNum2)
{
   return Math.max(pNum1, pNum2);
}//findMax

   public static boolean checkEquality(char pChar1, char pChar2)
   {
      return (pChar1 == pChar2);
   }//checkEquality

   public static boolean checkEquality(String pString1, String pString2)
   {
      return pString1.equals(pString2);
   }

   public static void main(String[] args)
   {
      System.out.println("The max number is: " + findMax(3.2, 6.7));
      System.out.println("The max number is: " + findMax(15, 21));
      System.out.println("This is " + checkEquality('r', 'R'));
      System.out.println("This is " + checkEquality("jayne","jayne"));

   }//main
}//class