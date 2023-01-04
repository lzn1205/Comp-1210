/**
  * Create a program that writting class.
  * project 10.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version November 12th, 2021.
  */
import java.text.DecimalFormat;
/** set format. */
public abstract class AirTicket implements Comparable<AirTicket> {
   protected String flightNum;
   protected Itinerary tripData;
   protected double baseFare;
   protected double fareAdj;
  
   /**
   * Comment for function.
   * @param flightNumIn **comment**
   * @param tripDataIn **comment** 
   * @param baseFareIn **comment**
   * @param fareAdjIn **comment**
   */
   
   public AirTicket(String flightNumIn, Itinerary tripDataIn, 
         double baseFareIn, double fareAdjIn) {
      flightNum = flightNumIn;
      tripData = tripDataIn;
      baseFare = baseFareIn;
      fareAdj = fareAdjIn;
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public String getFlightNum() {
      return flightNum;
   }
     
   /**
   * Comment for function.
   * @return **return**
   */
   
   public Itinerary getItinerary() {
      return tripData;
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public double getBaseFare() {
      return baseFare;
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public double getFareAdjustmentFactor() {
      return fareAdj;
   }
   
 
   /**
   * Comment for function.
   * @return **return**
   */
   
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("$#,##0.00");
      String output = "Flight: " + getFlightNum();
      output += "\n" + getItinerary() + " (" + totalAwardMiles() 
         + " award miles)";
      output += "\n" + "Base Fare: " + decimalFormat.format(getBaseFare())
         + " Fare Adjustment Factor: " + getFareAdjustmentFactor();
      output += "\n" + "Total Fare: " + decimalFormat.format(totalFare())
         + " (" + getClass() + ")";
      return output;
          
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public abstract double totalFare();
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public abstract int totalAwardMiles();
   
    /**
   * Comment for function.
   * @return **return**
   * @param airTicket **comment**
   */
   
   public int compareTo(AirTicket airTicket) {
      return (flightNum).compareTo(airTicket.getFlightNum());
   }
   
}
