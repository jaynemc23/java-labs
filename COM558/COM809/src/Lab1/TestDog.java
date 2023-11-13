package Lab1;

/****
 ***** Created by jayne on 5/11/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class TestDog
{
   public static void main(String[] args)
   {
      //create new objects of type Dog
      Dog dog1 = new Dog ("Lego" , 14);   //new instance of Dog
      Dog dog2 = new Dog ("Oslo", 6);  //new instance of Dog

      //print out the details of each dog
      dog1.printDogInfo();
      System.out.println();
      dog2.printDogInfo();
   }//main
}//class