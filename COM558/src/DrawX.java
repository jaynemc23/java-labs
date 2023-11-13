import java.util.Scanner;
/****
 ***** Created by jayne on 19 10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class DrawX
{
   static Scanner keyboard = new Scanner (System.in);

   public static void drawOuter()
   {
      System.out.println("*               *");
   }//drawOuter

   public static void drawInner()
   {
      System.out.println("   *        *");
   }
   public static void drawMiddle()
   {
      System.out.println("        *  ");
   }

   public static void main(String[] args)
   {
      drawOuter();
      drawInner();
      drawMiddle();
      drawInner();
      drawOuter();
   }//main
}//class