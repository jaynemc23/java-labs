import java.util.Scanner;
/****
 ***** Created by jayne on 25.10
 ***** how to cook a lasagna
 *****/
public class Lasagna
{
   static Scanner keyboard = new Scanner(System.in);
   static String lasagna = "Lasagna";

   // TODO: define the 'expectedMinutesInOven()' method
   public static int expectedMinutesInOven()
   {
      return 40;
   }//expectedMinutesInOven

   // TODO: define the 'remainingMinutesInOven()' method
   public static int remainingMinutes(int pRemainingMinutes)
   {
      return expectedMinutesInOven() - pRemainingMinutes;
   }

   // TODO: define the 'preparationTimeInMinutes()' method

   public static int preparationTimeInMinutes(int layers)
   {
      return layers * 2;
   }//preparationTimeInMinutes

   // TODO: define the 'totalTimeInMinutes()' method

   public static int totalTimeInMinutes(int layers, int expectedMinutes)
   {
      return expectedMinutesInOven() + preparationTimeInMinutes(layers);
   }








   public static void main(String[] args)
   {
      int minutes = expectedMinutesInOven();
      int remaining = remainingMinutes(30);
      System.out.println(minutes);
      System.out.println(remaining);
      int prepMinutes = preparationTimeInMinutes(4);
      System.out.println(prepMinutes);
      int totalTime = totalTimeInMinutes(4, 40);
      System.out.println(totalTime);

   }//main
}//class