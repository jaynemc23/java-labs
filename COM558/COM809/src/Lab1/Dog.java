package Lab1;

/****
 ***** Created by jayne on 5/11/23
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class Dog
{
      //instance variables
   private String name;
   private int age;

   //default constructor
   public Dog ()
   {

   }

   //overloaded constructor
   public Dog(String dogName, int dogAge)
   {
      name = dogName;
      age = dogAge;
   }

   //void method to carry out print process fo dog details
   public void printDogInfo()
   {
      System.out.println("Dog name " + name + ".");
      System.out.println("Dog age is " + age + ".");
   }

}//class