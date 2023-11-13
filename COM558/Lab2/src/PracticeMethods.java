import javax.swing.*;

/****
 ***** Created by jayne on 26.10
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class PracticeMethods
{
   //method to accept a String and integer
   // return character within String at that index position of integer
   public static char findChar(String pString1, int pNum1)
   {
      return pString1.charAt(pNum1);
   }//findChar

   //method that accepts 2 Strings and return a boolean.
   // Compares 2 String for equality and returns true if yes and false if not
   public static boolean compareEqual(String pString1, String pString2)
   {
      return pString1.equals(pString2);
   }//compareEqual

   //method that accepts a String and a character and returns a boolean.
   // Loops through the String looking for a character and if it finds returns true else returns false.
   public static boolean lookChar(String pString1, char pLetter)
   {
      int count = 0;
      do
      {
         if (pString1.charAt(count) == pLetter)

      return true;

      else

      count++;

   } while(count<=(pString1.length()-1));
   return false;
}//lookChar

//method that accepts a String and a character and returns an integer.
// Loops through the String looking for a character and
// counts number of occurrences of the character in the String.
// Returns the count.
   public static int charLook(String pString, char pChar)
   {
      int letterCount =0;
      for(int count =0; count < pString.length(); count++)
      {
         if (pString.charAt(count) == pChar)
            letterCount++;
      }//for
      return letterCount;
   }//charLook

   //method accepts 2 integers (row and col)
   // and returns nothing.
   // Set up nested for loop to print out square of multiple of 2 numbers as row and col.
   public static void printNumbers(int pRow, int pCol)
   {
      for (int row =1; row <= pRow; row++)
      {
         for (int col =1; col<=pCol;col++)
         {
            System.out.println((row*col) + " \t");
         }//for
         System.out.println();
      }//for
   }//printNumbers

	//Method accepts age and gender.
   //Method checks if age is between 18 and 65 and gender is female
   // returns a true else returns a false.
   public static boolean checkCriteria(int pAge, char Gender)
   {
      if ((pAge >= 18) && (pAge <=65) && (Gender == 'f' )|| (Gender =='F'))
      {
         return true;
      }

      else
      {
         return false;
      }//for
   }//checkCriteria

   public static void main(String[] args)
   {
      //findChar call method
      String inputString = "Hello there!";
      int index = 5; // The index of the ('o') in the string

      //Call the findChar method and store the result in a variable
      char result = findChar(inputString, index);

      //Print out the character at the specified index
      System.out.println("Character at index " + index + " : " + result);

      //checkStrings call method
      String inputString1 = "check String";
      String inputString2 = "check character";

      //call the checkStrings and store the result in a variable
      boolean answer = compareEqual(inputString1, inputString2);

      //print out if true or false

         if (answer)
         {
         System.out.println("They are equal");
      }
         else
         {
            System.out.println("They are not equal");
         }//checkStrings

         //checkStrings call method
         String name = " Mary Jane";
         char favourite = 'a'; // The index of the 'a' in the string


      //call the lookChar method and store the result in a variable
      boolean check = lookChar(name, favourite);

      //print out if true or false
      if (check)
      {
         System.out.println("We have found the character");
      }
      else
      {
         System.out.println("The character is not at this index");
      }//lookChar

      // checkStrings call method
      String dogName = "Martin";
      char easy = 'e';

      //call the checkStrings method and store the result in a variable
      int letterCount = charLook(dogName, easy);

      //print out
      System.out.println("The amount of " + easy + "'s is " + letterCount);

      // printNumber call method (void method)
      printNumbers(2, 5);



   }//main
}//class