/**
  * Create a program that writting class.
  * project 10.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version November 12th, 2021.
  */
import java.util.Comparator;
/** set format. */
public class ItineraryComparator implements Comparator<AirTicket> {
   /**
   * Comment for function.
   * @param t1 **comments**
   * @param t2 **comments**
   * @return **return**
   */
   public int compare(AirTicket t1, AirTicket t2) {
      return ((t1.getItinerary().toString()).
         compareTo((t2.getItinerary().toString())));
   }
}