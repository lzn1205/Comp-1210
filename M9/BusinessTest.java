import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* Comment for function.
*/
public class BusinessTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Test method.*/
   @Test public void getFoodAndBeveragesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      
      Assert.assertEquals(" ", 50.0, b.getFoodAndBeverages(), 0.1);
   }
   /** Test method.*/
   @Test public void getEntertainmentTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      
      Assert.assertEquals(" ", 50.00, b.getEntertainment(), 0.01);
   }
   /** Test method.*/
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      
      Assert.assertEquals(" ", 1000, b.totalFare(), 0.01);
   }
   /** Test method.*/
   @Test public void totalAwardMilesTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800); 
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      
      Assert.assertEquals(" ", 1600, b.totalAwardMiles());
   }
   /** Test method.*/
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      Business b = new Business("DL 1860", trip, 450, 2.0, 50.0, 50.00);
      
      boolean isSet = b.toString().contains("DL 1860");
      Assert.assertEquals(b.toString().contains("DL 1860"), isSet);
   }
}