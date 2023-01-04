/**
  * Create a program that writting class.
  * project 9.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version November 5th, 2021.
  */
public class Economy extends AirTicket {
   /** set award base.*/
   public static final double ECONOMY_AWARD_MILES = 1.5;
   
   /**
   * Comment for function.
   * @param flightNumIn **comment**
   * @param tripDataIn **comment** 
   * @param baseFareIn **comment**
   * @param fareAdjIn **comment**
   */
   
   public Economy(String flightNumIn, Itinerary tripDataIn, 
         double baseFareIn, double fareAdjIn) {
      super(flightNumIn, tripDataIn, baseFareIn, fareAdjIn);
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public double totalFare() {
      return getBaseFare() * getFareAdjustmentFactor();
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public int totalAwardMiles() {
      return (int) (getItinerary().getMiles() * ECONOMY_AWARD_MILES);
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public String toString() {
      String output = super.toString() + "\n   Includes Award Miles Factor: "
         + ECONOMY_AWARD_MILES;
      return output;
   }
}