/**
  * Create a program that writting class.
  * project 9.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version November 5th, 2021.
  */
import java.text.DecimalFormat;
/** set format. */
public class Business extends AirTicket {
   protected double foodAndBeverages;
   protected double entertainment;
   /** set award base.*/
   public static final double BUSI_AWARD_MILES = 2.0;
   
   /**
   * Comment for function.
   * @param flightNumIn **comment**
   * @param tripDataIn **comment** 
   * @param baseFareIn **comment**
   * @param fareAdjIn **comment**
   * @param foodAndBeveragesIn **comment**
   * @param entertainmentIn **comment**
   */
   
   public Business(String flightNumIn, Itinerary tripDataIn, double baseFareIn,
      double fareAdjIn, double foodAndBeveragesIn, double entertainmentIn) {
      super(flightNumIn, tripDataIn, baseFareIn, fareAdjIn);
      foodAndBeverages = foodAndBeveragesIn;
      entertainment = entertainmentIn;
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public double getFoodAndBeverages() {
      return foodAndBeverages;
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public double getEntertainment() {
      return entertainment;
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public double totalFare() {
      return getBaseFare() * getFareAdjustmentFactor()
         + getFoodAndBeverages() + getEntertainment();
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public int totalAwardMiles() {
      return (int) (getItinerary().getMiles() * BUSI_AWARD_MILES);
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");
      String output = super.toString() + "\n   Includes Food/Beverage: "
         + decimalFormat.format(getFoodAndBeverages()) 
         + " Entertainment: " + decimalFormat.format(getEntertainment());
      return output;
   }
}