import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* Comment for function.
*/
public class TriangularPrismTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Test method for getLabel.*/
   @Test public void getLabelTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals("Small Example", ex1.getLabel());
   }
   /** Test method for setLabel.*/
   @Test public void setLabelTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      boolean isSet = false;
      String label = "Medium Example";
      isSet = ex1.setLabel(label);
      Assert.assertEquals(" ", ex1.getLabel(), label);
      Assert.assertTrue(isSet);
   }
   /** Test method for setLabel.*/
   @Test public void setLabel1Test() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      boolean isSet = ex1.setLabel(null);
      Assert.assertFalse(isSet);
   }
   
   /** Test method for getEdge.*/
   @Test public void getEdgeTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(" ", 1.8, ex1.getEdge(), 0.0);
   }
   /** Test method for setEdge.*/
   @Test public void setEdgeTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      boolean isSet = false;
      double edge = 10.7;
      isSet = ex1.setEdge(edge);
      Assert.assertEquals(" ", ex1.getEdge(), edge, .000001);
      Assert.assertTrue(isSet);
   }
   /** Test method for setEdge.*/
   @Test public void setEdge1Test() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      boolean isSet = ex1.setEdge(-1);
      Assert.assertFalse(isSet);
   }

   /** Test method for getHeight.*/
   @Test public void getHeightTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(" ", 3.25, ex1.getHeight(), .000001);
   }
   /** Test method for setHeight.*/
   @Test public void setHeightTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      boolean isSet = false;
      double height = 25.4;
      isSet = ex1.setHeight(height);
      Assert.assertEquals(" ", ex1.getHeight(), height, .000001);
      Assert.assertTrue(isSet);
   }
   /** Test method for setHeight.*/ 
   @Test public void setHeight1Test() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      boolean isSet = ex1.setHeight(-1);
      Assert.assertFalse(isSet);
   }
   /** Test method for triangleArea.*/
   @Test public void triangleAreaTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25); 
      Assert.assertEquals(" ", 1.402961, ex1.triangleArea(), .000001);
   }
   /** Test method for rectangleArea.*/
   @Test public void rectangleAreaTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25); 
      Assert.assertEquals(" ", 5.85, ex1.rectangleArea(), .000001);
   }
   /** Test method for surfaceArea.*/
   @Test public void surfaceAreaTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25); 
      Assert.assertEquals(" ", 20.355922, ex1.surfaceArea(), .000001);
   }
   /** Test method for volume.*/
   @Test public void volumeTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25); 
      Assert.assertEquals(" ", 4.559623, ex1.volume(), .000001);
   }
   /** Test method for toString.*/
   @Test public void toStringTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25); 
      Assert.assertTrue(ex1.toString().contains("\"Small Example\""));  
   }
   /** Test method for getCount.*/
   @Test public void getCountTest() {
      TriangularPrism.resetCount();
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(" ", 1, TriangularPrism.getCount());
   }
   /** Test method for resetCount.*/
   @Test public void resetCountTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism.resetCount();
      Assert.assertEquals(" ", 0, TriangularPrism.getCount());
   }
   /** Test method for equals.*/
   @Test public void equalsTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism obj = new TriangularPrism("Small Example", 1.8, 3.25);
      boolean isSet = false;
      isSet = ex1.equals(obj);
      Assert.assertEquals(ex1, obj);
      Assert.assertTrue(isSet);
   }
   /** Test method for equals.*/
   @Test public void equals1Test() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25); 
      TriangularPrism obj1 = new TriangularPrism("Medium Example", 1.8, 3.25);
      boolean isSet = false;
      isSet = ex1.equals(obj1);
      Assert.assertFalse(isSet);
   }
   /** Test method for equals.*/
   @Test public void equals2Test() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25); 
      TriangularPrism obj2 = new TriangularPrism("Small Example", 2.1, 3.25);
      boolean isSet = false;
      isSet = ex1.equals(obj2);
      Assert.assertFalse(isSet);
   }
   /** Test method for equals.*/
   @Test public void equals3Test() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25); 
      TriangularPrism obj3 = new TriangularPrism("Small Example", 1.8, 3.55);
      boolean isSet = false;
      isSet = ex1.equals(obj3);
      Assert.assertFalse(isSet);
   }
   /** Test method for equals.*/
   @Test public void equals4Test() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25); 
      String obj4 = " ";
      boolean isSet = ex1.equals(obj4);
      Assert.assertFalse(isSet);
   }
   /** Test method for hashCode.*/
   @Test public void hashCodeTest() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      Assert.assertEquals(" ", 0, ex1.hashCode());
   }
   
   /** Test method for compareTo.*/
   @Test public void compareToTest1() {
      TriangularPrism ex2 = new TriangularPrism("Medium Example", 1.8, 3.25);
      ex2.volume();
      
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      ex1.volume();
      
      Assert.assertTrue(ex2.compareTo(ex1) == 0);
   }
   /** Test method for compareTo.*/
   @Test public void compareToTest2() {
      TriangularPrism ex2 = new TriangularPrism("Medium Example", 10.7, 25.4);
      ex2.volume();
      
      TriangularPrism ex3 = new TriangularPrism("Large Example", 45.47, 105.0);
      ex3.volume();
      
      Assert.assertTrue(ex2.compareTo(ex3) < 0);
   }
   /** Test method for compareTo.*/
   @Test public void compareToTest3() {
      TriangularPrism ex2 = new TriangularPrism("Medium Example", 10.7, 25.4);
      ex2.volume();
      
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      ex1.volume();      
      Assert.assertTrue(ex2.compareTo(ex1) > 0);
   }

}