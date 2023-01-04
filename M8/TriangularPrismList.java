/**
  * Create a program that writting class.
  * Project 8.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version October 29th, 2021.
  */
import java.text.DecimalFormat;
/** Triangular defines objects for label, edge, and height. */
public class TriangularPrismList {
   private String listName = "";
   private TriangularPrism[] list;
   private int numberOfTriangularPrism = 0;
   /**
   * Comment for function.
   * @param listNameIn **name of list**
   * @param listIn **list** 
   * @param numberOfTriangularPrismIn **num** 
   */
   public TriangularPrismList(String listNameIn, TriangularPrism[] listIn, 
      int numberOfTriangularPrismIn) {
      listName = listNameIn;
      list = listIn;
      numberOfTriangularPrism = numberOfTriangularPrismIn;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public String getName() {
   
      return listName;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public int numberOfTriangularPrisms() {
   
      return numberOfTriangularPrism;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double totalSurfaceArea() {
      double total = 0;
      
      for (int i = 0; i < numberOfTriangularPrism; i++) {
         total += list[i].surfaceArea();
      }   
      
      return total;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double totalVolume() {
      double total = 0;
      
      for (int i = 0; i < numberOfTriangularPrism; i++) {
         total += list[i].volume();
      }   
      
      return total;   
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double averageSurfaceArea() {
      double total = 0;
      
      for (int i = 0; i < numberOfTriangularPrism; i++) {
         total += list[i].surfaceArea();   
      }
      
      if (numberOfTriangularPrism > 0) {
         total /= numberOfTriangularPrism;
      }
      
      return total;    
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double averageVolume() {
      double total = 0;
      
      for (int i = 0; i < numberOfTriangularPrism; i++) {
         total += list[i].volume();   
      }
      
      if (numberOfTriangularPrism > 0) {
         total /= numberOfTriangularPrism;
      }
      
      return total;  
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0##");
      
      String result = "----- Summary for " 
         + listName + " -----"
         + "\nNumber of TriangularPrisms: " 
         + numberOfTriangularPrism  
         + "\nTotal Surface Area: " 
         + decimalFormat.format(totalSurfaceArea()) + " square units"
         + "\nTotal Volume: " 
         + decimalFormat.format(totalVolume()) + " cubic units"
         + "\nAverage Surface Area: " 
         + decimalFormat.format(averageSurfaceArea()) + " square units"
         + "\nAverage Volume: " 
         + decimalFormat.format(averageVolume()) + " cubic units\n";
      return result;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public TriangularPrism[] getList() {
   
      return list;
   }
   /**
   * Comment for function.
   * @param labelIn **Stringlabel**
   * @param edgeIn **edge** 
   * @param heightIn **height** 
   */
   public void addTriangularPrism(String labelIn, 
         double edgeIn, double heightIn) {
      TriangularPrism object = new TriangularPrism(labelIn, edgeIn, heightIn);
      
      list[numberOfTriangularPrism] = object;
      numberOfTriangularPrism++;
   }
   /**
   * Comment for function.
   * @param labelIn **Stringlabel**
   * @return **return**
   */
   public TriangularPrism findTriangularPrism(String labelIn) {
      TriangularPrism object = new TriangularPrism("", 0, 0);
      boolean tool = false;
      
      for (int i = 0; i < numberOfTriangularPrism; i++) {
      
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            object = list[i];
            tool = true;   
         }
      }
      
      if (tool) {
      
         return object;
      }
      else {
      
         return null;
      }
   }
   /**
   * Comment for function.
   * @param labelIn **Stringlabel**
   * @return **return**
   */
   public TriangularPrism deleteTriangularPrism(String labelIn) {
      TriangularPrism object = findTriangularPrism(labelIn);
      
      for (int i = 0; i < numberOfTriangularPrism; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            object = list[i];
            for (int j = i; j < numberOfTriangularPrism - 1; j++) {
               list[j] = list[j + 1];
            }
            
            list[numberOfTriangularPrism - 1] = null;
            numberOfTriangularPrism--; 
            break;   
         }
      }
       
      return object;
   }
   /**
   * Comment for function.
   * @param labelIn **Stringlabel**
   * @param edgeIn **edge** 
   * @param heightIn **height**
   * @return **return**
   */

   public boolean editTriangularPrism(String labelIn, 
               double edgeIn, double heightIn) {
      boolean tool = false;
      
      for (int i = 0; i < numberOfTriangularPrism; i++) {
         if (list[i].getLabel().equalsIgnoreCase(labelIn)) {
            list[i].setEdge(edgeIn);
            list[i].setHeight(heightIn);
            tool = true;
         }
      }
      
      return tool;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public TriangularPrism findTriangularPrismWithLargestVolume() {
      if (numberOfTriangularPrism > 0) {
         TriangularPrism largestVolume = list[0];
      
         for (int i = 0; i < numberOfTriangularPrism; i++) {
            if (list[i].volume() > largestVolume.volume()) {
               largestVolume = list[i];
            }
         }
         
         return largestVolume;
      }
      else {
      
         return null;
      }
   }
}