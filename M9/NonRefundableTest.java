import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* Comment for function.
*/
public class NonRefundableTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Test method.*/
   @Test public void getDiscountFactorTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      
      Assert.assertEquals(" ", 0.90, nr.getDiscountFactor(), 0.01);
   } 
   /** Test method.*/
   @Test public void totalFareTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
   
      Assert.assertEquals(" ", 182.25, nr.totalFare(), 0.01);
   }
   /** Test method.*/
   @Test public void totalAwardMiles() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      
      Assert.assertEquals(" ", 800, nr.totalAwardMiles());
   }
   /** Test method.*/
   @Test public void toStringTest() {
      Itinerary trip = new Itinerary("ATL", "LGA", "2021/11/21 1400",
           "2021/11/21 1640", 800);
      NonRefundable nr = new NonRefundable("DL 1860", trip, 450, 0.45, 0.90);
      
      boolean isSet = nr.toString().contains("DL 1860");
      Assert.assertEquals(nr.toString().contains("DL 1860"), isSet);
   }
}