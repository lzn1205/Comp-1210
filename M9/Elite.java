/**
  * Create a program that writting class.
  * project 9.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version November 5th, 2021.
  */
import java.text.DecimalFormat;
/** set format. */

public class Elite extends Business {
   private double communication;
   
   /**
   * Comment for function.
   * @param flightNumIn **comment**
   * @param tripDataIn **comment** 
   * @param baseFareIn **comment**
   * @param fareAdjIn **comment**
   * @param foodAndBeveragesIn **comment**
   * @param entertainmentIn **comment**
   * @param communicationIn **comment**
   */
   
   public Elite(String flightNumIn, Itinerary tripDataIn, 
      double baseFareIn, double fareAdjIn, double foodAndBeveragesIn, 
      double entertainmentIn, double communicationIn) {
      super(flightNumIn, tripDataIn, baseFareIn, 
         fareAdjIn, foodAndBeveragesIn, entertainmentIn);
      communication = communicationIn;
   } 
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public double getCommunication() {
      return communication;
   }
 
   /**
   * Comment for function.
   * @return **return**
   */
   
   public double totalFare() {
      return super.totalFare() + getCommunication();
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public int totalAwardMiles() {
      return (int) (getItinerary().getMiles() * super.BUSI_AWARD_MILES);
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");
      String output = super.toString() + "\n   Includes: Comm Services: "
         + decimalFormat.format(getCommunication());
      return output;
   }
}