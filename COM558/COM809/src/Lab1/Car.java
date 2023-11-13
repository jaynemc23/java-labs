package Lab1;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.spi.CalendarDataProvider;

import static java.util.Calendar.YEAR;

/******
 *****Created by Jayne Mc Laughlin on {DATE}
 *****update the programme descrition here
 *****/
public class Car

{
   private int id;
   private String make;
   private String ownerName;
   private String colour;
   private int yearOfManufacture;
   private int topSpeed;
   private double costPrice;
   private static int noOfCars = 0;


   //Define default constructor method
   public Car ()
   {
      id= 0;
      make = "-";
      ownerName = "-";
      colour = "-";
      yearOfManufacture = 0;
      topSpeed = 0;
      costPrice = 0;
      noOfCars = 0;

   }//default constructor

   public Car (int pId, String pMake, String pOwnerName, String pColour, int pYearOfManufacture, int pTopSpeed, double pCostPrice)
   {
      id = pId;
      make = pMake;
      ownerName = pOwnerName;
      colour = pColour;
      yearOfManufacture = 0;
      topSpeed = 0;
      costPrice = 0;

   } // alt constructor1

   public Car(int pId,String pMake, String pOwnerName, String pColour)
   {
      id = pId;
      make = pMake;
      ownerName = pOwnerName;
      colour = pColour;

      yearOfManufacture = 0;
      topSpeed = 0;
      costPrice = 0;

   } // alt constructor2

   public Car (int pId, String pOwnerName, int pTopSpeed)
   {
      id = pId;
      ownerName = pOwnerName;
      topSpeed = pTopSpeed;
      colour = " unknown";
      make = "unknown";
      yearOfManufacture =0;
      costPrice =0;

   }// alt constructor3

   //Method to print out car info
   public void printCarInfo()
   {
      System.out.println("The ID is " + id);
      System.out.println("The make is " + make);
      System.out.println("The Owner's name is " + ownerName);
      System.out.println("The colour is " + colour);
      System.out.println("The Year of manufacture " + yearOfManufacture);
      System.out.println("The top speed is " + topSpeed);
      System.out.println("The cost of the car is " + costPrice);
   }//printCarInfo

      //set method for each attribute
      public void setID (int itsID)
      {
         id = itsID;

      }
    public void setMake (String itsMake)
   {
      make = itsMake;
   }

   public void setOwner (String whoOwns)
   {
      ownerName = whoOwns;
   }

   public void setColour (String itsColour)
   {
      colour = itsColour;

   }
   public void setYear (int whenBuilt)
   {
      yearOfManufacture = whenBuilt;

   }
   public void setSpeed (int maxSpeed)
   {
      topSpeed = maxSpeed;
   }

   public void setCost (double price)
   {
      costPrice = price;

   }

   //get method for each attribute
   public int getID()
   {
      return id;
   }

   public String getMake()
   {
      return make;
   }

   public String getOwner()
   {
      return ownerName;
   }

   public String getColour()
   {
      return colour;
   }

   public int getYear()
   {
      return yearOfManufacture;
   }

   public int getSpeed()
   {
      return topSpeed;
   }

   public double getCost()
   {
      return costPrice;
   }


   public void printCarInfo(String make, String colour, int yearOfManufacture)
   {
      System.out.println("The make of this car is " + make);
      System.out.println("The colour of this car is " + colour);
      System.out.println("The year of this car is " +  yearOfManufacture);
   }//printCarInfo

   public int ageOfCar()
   {
      // get todays date from date object
      Date today = new Date();
      Date carYear = new Date(2010-1900,0,1);

      Calendar one = getCalendar(carYear);
      Calendar two = getCalendar(today);
      //define attribute of Car
      int noYear = -1;
      if (yearOfManufacture == 0) return noYear;
      return two.get(YEAR) - one.get(YEAR);
   }


   private static Calendar getCalendar(Date date)
   {
      Calendar cal = Calendar.getInstance(Locale.ENGLISH);
      cal.setTime(date);
      return cal;
   }//getCalendar

   public double currentValue(double annualDepreciationRate)
   {
      if (costPrice == 0 || yearOfManufacture == 0) return -1;
      double value;
      return value = costPrice - (costPrice * (annualDepreciationRate / 100)* ageOfCar());
   }//currentValue

   public static int numberOfCars()
   {
      return noOfCars++;
   }//numberOfCars



}//class