import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
* Comment for function.
*/
public class TriangularPrismListTest {


   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
   }
   /** Test method for getName.*/
   @Test public void getNameTest() {
      TriangularPrism[] list = new TriangularPrism[50];
      list[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrismList t = new TriangularPrismList("", list, 1);
      Assert.assertEquals("", t.getName());
   }
   /** Test method for numberOfTriangularPrisms.*/
   @Test public void numberOfTriangularPrismsTest() {
      TriangularPrism[] list = new TriangularPrism[50];
      list[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      list[1] = new TriangularPrism(" Medium Example ", 10.7, 25.4);
      list[2] = new TriangularPrism("Large Example", 45.47, 105.0);
      TriangularPrismList t = new TriangularPrismList("", list, 3);
      Assert.assertEquals(3, t.numberOfTriangularPrisms());
   }
   /** Test method for totalSurfaceAreaTest.*/
   @Test public void totalSurfaceAreaTest() {
      TriangularPrism[] list = new TriangularPrism[50];
      list[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      list[1] = new TriangularPrism(" Medium Example ", 10.7, 25.4);
      list[2] = new TriangularPrism("Large Example", 45.47, 105.0);
      TriangularPrismList t = new TriangularPrismList("", list, 3);
      double tSurfaceArea = t.totalSurfaceArea();
      Assert.assertEquals(17048.423, tSurfaceArea, .001);
   }
   /** Test method for totalVolume.*/
   @Test public void totalVolumeTest() {
      TriangularPrism[] list = new TriangularPrism[50];
      list[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      list[1] = new TriangularPrism(" Medium Example ", 10.7, 25.4);
      list[2] = new TriangularPrism("Large Example", 45.47, 105.0);
      TriangularPrismList t = new TriangularPrismList("", list, 3);
      double tVolume = t.totalVolume();
      Assert.assertEquals(95266.376, tVolume, .001);
   }
   /** Test method for averageSurfaceArea.*/
   @Test public void averageSurfaceAreaTest1() {
      TriangularPrism[] list = new TriangularPrism[50];
      list[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      list[1] = new TriangularPrism(" Medium Example ", 10.7, 25.4);
      list[2] = new TriangularPrism("Large Example", 45.47, 105.0);
      TriangularPrismList t = new TriangularPrismList("", list, 3);
      double aSurfaceArea = t.averageSurfaceArea();
      Assert.assertEquals(5682.808, aSurfaceArea, .001);
   }
   /** Test method for averageSurfaceArea.*/
   @Test public void averageSurfaceAreaTest2() {
      TriangularPrism[] list = new TriangularPrism[50];
      TriangularPrismList t = new TriangularPrismList("", list, 0);
      double aSurfaceArea = t.averageSurfaceArea();
      Assert.assertEquals(0, aSurfaceArea, .001);
   }
   /** Test method for averageVolume.*/
   @Test public void averageVolumeTest1() {
      TriangularPrism[] list = new TriangularPrism[50];
      list[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      list[1] = new TriangularPrism(" Medium Example ", 10.7, 25.4);
      list[2] = new TriangularPrism("Large Example", 45.47, 105.0);
      TriangularPrismList t = new TriangularPrismList("", list, 3);
      double aVolume = t.averageVolume();
      Assert.assertEquals(31755.459, aVolume, .001);     
   }
   /** Test method for averageVolume.*/
   @Test public void averageVolumeTest2() {
      TriangularPrism[] list = new TriangularPrism[50];
      TriangularPrismList t = new TriangularPrismList("", list, 0);
      double aVolume = t.averageVolume();
      Assert.assertEquals(0, aVolume, .001);     
   }

   /** Test method for toString.*/
   @Test public void toStringTest() {
      TriangularPrism[] list = new TriangularPrism[50];
      list[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      list[1] = new TriangularPrism(" Medium Example ", 10.7, 25.4);
      list[2] = new TriangularPrism("Large Example", 45.47, 105.0);
      TriangularPrismList t = new TriangularPrismList(
            "TriangularPrism Test List", list, 3);
      String result = "----- Summary for TriangularPrism Test List -----"
         + "\nNumber of TriangularPrisms: 3"  
         + "\nTotal Surface Area: 17,048.423 square units"
         + "\nTotal Volume: 95,266.376 cubic units"
         + "\nAverage Surface Area: 5,682.808 square units"
         + "\nAverage Volume: 31,755.459 cubic units\n";
      Assert.assertEquals(t.toString(), result);  
   }
   /** Test method for getList.*/

   @Test public void getListTest() {
      TriangularPrism[] list = new TriangularPrism[5];
      TriangularPrismList t = new TriangularPrismList("", list, 0);
      Assert.assertArrayEquals(list, t.getList());
   }
   /** Test method for addTriangularPrism.*/
   @Test public void addTriangularPrismTest() {
      TriangularPrism[] list = new TriangularPrism[50];
      list[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      list[1] = new TriangularPrism(" Medium Example ", 10.7, 25.4);
      TriangularPrismList t = new TriangularPrismList("", list, 2);
      t.addTriangularPrism("Large Example", 45.47, 105.0);
      Assert.assertEquals(3, t.numberOfTriangularPrisms(), .0001);
   }
   /** Test method for findTriangularPrism.*/
   @Test public void findTriangularPrismTest1() {
      TriangularPrism[] list = new TriangularPrism[50];
      list[0] = new TriangularPrism("Small", 1.8, 3.25);
      TriangularPrismList t = new TriangularPrismList("", list, 1);
      TriangularPrism isSet = t.findTriangularPrism("Large");
      Assert.assertEquals(null, isSet);
   }
   /** Test method for deleteTriangularPrism.*/
   @Test public void deleteTriangularPrismTest() {
      TriangularPrism[] list = new TriangularPrism[50];
      list[0] = new TriangularPrism("Small Example", 1.8, 3.25);
      list[1] = new TriangularPrism(" Medium Example ", 10.7, 25.4);
      list[2] = new TriangularPrism("Large Example", 45.47, 105.0);
      TriangularPrismList t = new TriangularPrismList("", list, 3);
      TriangularPrism ex1 = new TriangularPrism("Small Example", 0, 0);
      ex1 = t.deleteTriangularPrism("Small Example");
      Assert.assertEquals(2, t.numberOfTriangularPrisms());
   }
   /** Test method for editTriangularPrism.*/
   @Test public void editTriangularPrismTest() {
      TriangularPrism ex1 = new TriangularPrism("Small", 1.8, 3.25);
      TriangularPrism[] list = {ex1};
      TriangularPrismList t = new TriangularPrismList("", list, 1);
      boolean isSet = false;
      isSet = t.editTriangularPrism("Medium", 10.7, 25.4);
      Assert.assertFalse(isSet);
   }
   /** Test method for findTriangularPrismWithLargestVolume.*/
   @Test public void findTriangularPrismWithLargestVolumeTest1() {
      TriangularPrism ex1 = new TriangularPrism("Small Example", 1.8, 3.25);
      TriangularPrism ex2 = new TriangularPrism(" Medium Example ", 10.7, 25.4);
      TriangularPrism[] list = {ex1, ex2};
      TriangularPrismList t = new TriangularPrismList("", list, 2);
      TriangularPrism isSet = t.findTriangularPrismWithLargestVolume();
      Assert.assertEquals(list[1], isSet);
   }
   /** Test method for findTriangularPrismWithLargestVolume.*/
   @Test public void findTriangularPrismWithLargestVolumeTest2() {
      TriangularPrism[] list = new TriangularPrism[50];
      TriangularPrismList t = new TriangularPrismList("", list, 0);
      TriangularPrism isSet = t.findTriangularPrismWithLargestVolume();
      Assert.assertEquals(null, isSet);
   }
}