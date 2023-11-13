import java.util.Scanner;
import java.text.DecimalFormat;
import javax.swing.*;
/****
 ***** Created by Jayne Mc Laughlin on 30/09/2023
 ***** calculate rectangle using JOptionPane
 *****/
public class Rectangle1JOptionPane
{
   public static void main(String[] args)
   {
   Scanner keyboard = new Scanner(System.in);
   DecimalFormat df = new DecimalFormat("00.00");

   //Declaring and initialising variables
      double length, breadth,area , perimeter;
      String answerLength, answerBreadth;

      answerLength = JOptionPane.showInputDialog("Please enter the value Rectangle length : "  );
      answerBreadth = JOptionPane.showInputDialog("Please enter the value Rectangle breadth : "  );

      length=Double.parseDouble(answerLength);
      breadth=Double.parseDouble(answerBreadth);

   //Calculations
      perimeter = length * breadth;
      area = length * breadth * perimeter;

   //Prints
      JOptionPane.showMessageDialog(null, "Rectangle length = " + length + "\n\n Rectangle breadth = "+ breadth + "\n\n Rectangle Area = " + area + "\n\n Rectangle Perimeter = " + perimeter);


   }//main
}//class