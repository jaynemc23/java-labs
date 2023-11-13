package Lab2;

/****
 ***** Created by Jayne mc l on 13/11/2023
 ***** UPDATE PROGRAM DESCRIPTION HERE
 *****/
public class CD
{
   private int number, issueDate;
   private String artistName, albumName;
   private double costPrice, salePrice;
   private Boolean doubleCD;

   //Define default constructor method
   public CD()
   {
      number = 0;
      issueDate = 0;
      artistName = " ";
      albumName = " ";
      costPrice = 0;
      salePrice = 0;
      doubleCD = false;
   }//default constructor

   //over-riden default constructor
   public CD(String pArtistName, String pAlbumName, int pIssueDate)
   {
      artistName = pArtistName;
      albumName = pAlbumName;
      issueDate = 0;
      costPrice = 0;
      salePrice = 0;
      number = 0;
      doubleCD = false;
   }// alt constructor

   public int getNumber()
   {
      return number;
   }

   public void setNumber(int number)
   {
      this.number = number;
   }

   public int getIssueDate()
   {
      return issueDate;
   }

   public void setIssueDate(int issueDate)
   {
      this.issueDate = issueDate;
   }

   public String getArtistName()
   {
      return artistName;
   }

   public void setArtistName(String artistName)
   {
      this.artistName = artistName;
   }

   public String getAlbumName()
   {
      return albumName;
   }

   public void setAlbumName(String albumName)
   {
      this.albumName = albumName;
   }

   public double getCostPrice()
   {
      return costPrice;
   }

   public void setCostPrice(double costPrice)
   {
      this.costPrice = costPrice;
   }

   public double getSalePrice()
   {
      return salePrice;
   }

   public void setSalePrice(double salePrice)
   {
      this.salePrice = salePrice;
   }

   public Boolean getDoubleCD()
   {
      return doubleCD;
   }

   public void setDoubleCD(Boolean doubleCD)
   {
      this.doubleCD = doubleCD;
   }

   //third constructor - for use whenever all of the details exception of number
   public CD (int pIssueDate, String pArtistName,String pAlbumName,double pCostPrice, double pSalePrice, Boolean pDoubleCD )
   {
      issueDate = pIssueDate;
      artistName = pArtistName;
      albumName = pAlbumName;
      costPrice = 0;
      salePrice = 0;
      doubleCD = false;

   }//third constructor

   //setMethods
   public void setNumber

   public void printAllInfo()
   {
      System.out.println("The year of issue for the CD is " + issueDate);
      System.out.println("The name of the artist is " + artistName);
      System.out.println("The name of the album is " + albumName);
      System.out.println("The cost of the CD is " + costPrice);
      System.out.println("The sale price of the CD is " + salePrice);
      System.out.println(doubleCD + " this CD is a double CD");
   }//Print all ifo

   public int getYear()
   {
      return issueDate;
   }//getYear

   public void updatePrices(double value)
   {
      costPrice += value;
      salePrice += value * 2;
   }//updatePrices

   public static void main(String[] args)
   {
   }//main
}//class