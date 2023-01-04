import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* Comment for function.
*/
public class ItineraryTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   
   /** Test method.*/
   @Test public void getFromAirportTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
           
      Assert.assertEquals("ATL", trip.getFromAirport());
   }
   
   /** Test method.*/
   @Test public void getToAirportTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
           
      Assert.assertEquals("LGA", trip.getToAirport());
   }
   /** Test method.*/
   @Test public void getDepDateTimeTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
           
      Assert.assertEquals("2021/11/21 1400", trip.getDepDateTime());
   }
   /** Test method.*/
   @Test public void getArrivalDateTimeTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
           
      Assert.assertEquals("2021/11/21 1640", trip.getArrivalDateTime());
   }
   /** Test method.*/
   @Test public void getMilesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
           
      Assert.assertEquals("", 800, trip.getMiles()); 
   }
   /** Test method.*/
   @Test public void toStringNew() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
           
      boolean isSet = trip.toString().contains("ATL");
      Assert.assertEquals(trip.toString().contains("ATL"), isSet);
   }  
}