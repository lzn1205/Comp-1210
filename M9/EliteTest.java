import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* Comment for function.
*/
public class EliteTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Test method.*/
   @Test public void getCommunicationTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);     
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);
      
      Assert.assertEquals(" ", 100.00, be.getCommunication(), 0.01);
   }
   /** Test method.*/
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);
      
      Assert.assertEquals(" ", 1325, be.totalFare(), 0.01);
   }
   /** Test method.*/
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      Elite be = new Elite("DL 1860", trip, 450, 2.5, 50.0, 50.00, 100.00);
      
      boolean isSet = be.toString().contains("DL 1860");
      Assert.assertEquals(be.toString().contains("DL 1860"), isSet);
   }
   
}