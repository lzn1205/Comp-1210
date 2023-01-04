/**
  * Create a program that writting class.
  * project 9.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version November 5th, 2021.
  */
public class Itinerary {
   private String fromAirport;
   private String toAirport;
   private String departureTime;
   private String arrivalDateTime;
   private int miles;
   /**
   * Comment for function.
   * @param fromAirportIn **comment**
   * @param toAirportIn **comment** 
   * @param departureTimeIn **comment**
   * @param arrivalDateTimeIn **comment**
   * @param milesIn **comment**
   */
   public Itinerary(String fromAirportIn, String toAirportIn, 
         String departureTimeIn, String arrivalDateTimeIn, int milesIn) {
      fromAirport = fromAirportIn;
      toAirport = toAirportIn;
      departureTime = departureTimeIn;
      arrivalDateTime = arrivalDateTimeIn;
      miles = milesIn;   
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public String getFromAirport() {
      return fromAirport;
   }

   /**
   * Comment for function.
   * @return **return**
   */
   
   public String getToAirport() {
      return toAirport;
   }

   /**
   * Comment for function.
   * @return **return**
   */
   
   public String getDepDateTime() {
      return departureTime;
   }

   /**
   * Comment for function.
   * @return **return**
   */
   
   public String getArrivalDateTime() {
      return arrivalDateTime;
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public int getMiles() {
      return miles;
   }
   
   /**
   * Comment for function.
   * @return **return**
   */
   
   public String toString() {
      return getFromAirport() + "-" + getToAirport() + " (" + getDepDateTime() 
         + " - " + getArrivalDateTime() + ") " + getMiles() + " miles";
   }
}