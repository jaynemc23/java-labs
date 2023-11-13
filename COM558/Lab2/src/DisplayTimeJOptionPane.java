import java.util.Scanner;
import javax.swing.*;
/****
 ***** Display time in minutes and seconds using JOptionPane
 ******
 *****/
public class DisplayTimeJOptionPane
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      //Declaring and initialising variables
      final int SIXTY = 60;
      int answer;
      int minutes;
      int remainderSeconds;
      String answerString;

      answerString = JOptionPane.showInputDialog("Please enter time in seconds : ");

      answer = Integer.parseInt(answerString);
      //Calculations
      minutes = answer / SIXTY;
      remainderSeconds = answer % SIXTY;

      //Print
      JOptionPane.showMessageDialog(null,answer + " seconds is " + minutes + " minutes and "+ remainderSeconds + " seconds");
   }//main
}//class