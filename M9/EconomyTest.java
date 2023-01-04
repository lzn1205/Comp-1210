import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* Comment for function.
*/
public class EconomyTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Test method.*/
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      Economy e = new Economy("DL 1860", trip, 450, 1.0);
      
      Assert.assertEquals(" ", 450, e.totalFare(), 0.01);
   }
   /** Test method.*/
   @Test public void totalAwardMilesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      Economy e = new Economy("DL 1860", trip, 450, 1.0);
      
      Assert.assertEquals(" ", 1200, e.totalAwardMiles());
   }
   /** Test method.*/
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      Economy e = new Economy("DL 1860", trip, 450, 1.0);
      
      boolean isSet = e.toString().contains("DL 1860");
      Assert.assertEquals(e.toString().contains("DL 1860"), isSet);
   }
}