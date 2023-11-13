import java.text.DecimalFormat;
/****
 ***** Created by Jayne Mc Laughlin on 9/10/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class KilosToPounds
{

   public static void main(String[] args)
   {

      DecimalFormat df = new DecimalFormat("00.0");

      double pounds = 0;


      for(double kilos=5; kilos<=100; kilos +=5)
       {
          pounds = kilos * 2.2;
          System.out.println("Kilograms" + "   Pounds");
          System.out.println(kilos +   "         " + df.format(pounds));
       }//for
   }//main
}//class