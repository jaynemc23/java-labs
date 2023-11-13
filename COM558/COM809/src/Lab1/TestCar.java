package Lab1;

import java.util.Calendar;
import java.util.Scanner;

/******
 *****Created by Jayne Mc Laughlin on {DATE}
 *****update the programme descrition here
 *****/
public class TestCar

{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Car myCar = new Car();
      Car sistersCar = new Car(100, "Ford", "My sister Mary", "red", 2008, 105, 10995.00);
      Car bossCar = new Car(101, "Honda", "Pat Bell", "Silver", 2011, 210, 27500.00);
      Car aCar = new Car(102, "Janet Allison", 100);
      Car bCar = new Car(103, "John Smith", 100);

      //printCarInfo()
      myCar.printCarInfo();
      sistersCar.printCarInfo();
      bossCar.printCarInfo();
      aCar.printCarInfo();
      bCar.printCarInfo();

      //call set methods to change attributes of bCar
      bCar.setMake("Vauxhall");
      bCar.setOwner("James Rodgers");
      bCar.setYear(2012);
      bCar.setCost(10000);

      //print out the attributes of bCar
      bCar.printCarInfo();

      //new object cCar with no attributes initialised
      Car cCar = new Car();

      //call set methods
      cCar.setID(104);
      cCar.setMake("Toyota");
      cCar.setOwner("Robert Smith");
      cCar.setColour("Blue");
      cCar.setYear(2010);
      cCar.setSpeed(120);
      cCar.setCost(12000);

      //print out cCar
      cCar.printCarInfo();
      bCar.printCarInfo();

      //print out cCar ageOfCar
      int result = cCar.ageOfCar();
      int noAgeResult = aCar.ageOfCar();
      double annualDepreciationRate = 0;
      int noValue = (int) aCar.currentValue(0);
      int totalCars = aCar.numberOfCars();


      System.out.println("The age of cCar is " + result);
      System.out.println("The age of aCar is " + noAgeResult);
      System.out.println("What is the depreciation rate as a percentage : ");
      annualDepreciationRate = keyboard.nextDouble();
      double currentValue = cCar.currentValue(annualDepreciationRate);
      System.out.println("The current value of cCar is " + currentValue);
      System.out.println("The value of aCar is : " + noValue);
      System.out.println("The number of cars is " + totalCars);

   }//main
}//class