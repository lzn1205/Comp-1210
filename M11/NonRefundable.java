/**
  * Create a program that writting class.
  * project 9.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version November 5th, 2021.
  */
public class NonRefundable extends AirTicket {
   private double discount;
   
  /**
   * Comment for function.
   * @param flightNumIn **comment**
   * @param tripDataIn **comment** 
   * @param baseFareIn **comment**
   * @param fareAdjIn **comment**
   * @param discountIn **comment**
   */

   public NonRefundable(String flightNumIn, Itinerary tripDataIn, 
         double baseFareIn, double fareAdjIn, double discountIn) {
      super(flightNumIn, tripDataIn, baseFareIn, fareAdjIn);
      discount = discountIn;
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public double getDiscountFactor() {
      return discount;
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   public double totalFare() {
      return getBaseFare() * getFareAdjustmentFactor() * getDiscountFactor();
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public int totalAwardMiles() {
      return getItinerary().getMiles();
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public String toString() {
      String output = super.toString() + "\n   Includes DiscountFactor: "
         + getDiscountFactor();
      return output;   
   }
}