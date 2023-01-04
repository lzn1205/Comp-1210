/**
  * Create a program that writting class.
  * Project 7B.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version October 12th, 2021.
  */
import java.text.DecimalFormat;
 /** Decagonal defines objects for label, edge, and height. */
public class TriangularPrism implements Comparable<TriangularPrism> {
   /** Create a TriangularPrism class that stores the label,
    edge, and height (edge and height each must be non-negative).
    * Print the object based on input, and run interactions.
    * @param args Command line arguments (not used).
    */
   private String label = "";
   private double edge = 0.0;
   private double height = 0.0;
   private static int count = 0;
   /**
   * Comment for function.
   * @param labelIn **Stringlabel**
   * @param edgeIn **edge** 
   * @param heightIn **height** 
   */
   public TriangularPrism(String labelIn, double edgeIn, double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);
      count++;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public String getLabel() {
      return label;
   }
   /**
   * Comment for function.
   * @param labelIn **label**
   * @return **return**
   */
   public boolean setLabel(String labelIn) {
      boolean isSet = false;
      if (labelIn != null) {
         label = labelIn.trim();
         isSet = true;
      }
      return isSet;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double getEdge() {
      return edge;
   }
   /**
   * Comment for function.
   * @param edgeIn **edge**
   * @return **return**
   */
   public boolean setEdge(double edgeIn) {
      boolean isSet = false;
      if (edgeIn >= 0) {
         edge = edgeIn;
         isSet = true;
      }
      return isSet;
   } 
   /**
   * Comment for function.
   * @return **return**
   */
   public double getHeight() {
      return height;
   }
   /**
   * Comment for function.
   * @param heightIn **height**
   * @return **return**
   */
   public boolean setHeight(double heightIn) {
      boolean isSet = false;
      if (heightIn >= 0) {
         height = heightIn;
         isSet = true;
      }
      return isSet;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double triangleArea() {
      return 0.25 * Math.sqrt(3 * Math.pow(edge, 4));
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double rectangleArea() {
      return edge * height;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double surfaceArea() {
      return 2 * triangleArea() + 3 * rectangleArea();
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double volume() {
      return triangleArea() * height;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0##");
      String result = "TriangularPrism \"" + label 
         + "\" with triangle edge of " 
         + decimalFormat.format(edge) + " units \nand prism height of " 
         + decimalFormat.format(height) + " units has:"
         + "\n\ttriangle area = " + decimalFormat.format(triangleArea()) 
         + " square units" + "\n\trectangle area = " 
         + decimalFormat.format(rectangleArea()) 
         + " square units" + "\n\tsurface area = " 
         + decimalFormat.format(surfaceArea()) + " square units" 
         + "\n\tvolume = " + decimalFormat.format(volume()) 
         + " cubic units\n\n";
      return result; 
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public static int getCount() {
      return count;
   }
   /**
   * Comment for function.
   */
   public static void resetCount() {
      count = 0;
   }
   /**
   * Comment for function.
   * @param obj **replace**
   * @return **return**
   */
   public boolean equals(Object obj) {
      if (!(obj instanceof TriangularPrism)) {
         return false;
      }
      else {
         TriangularPrism d = (TriangularPrism) obj;
         return (label.equalsIgnoreCase(d.getLabel())
                  && (Math.abs(edge - d.getEdge()) < .000001)
                  && (Math.abs(height - d.getHeight()) < .000001));
      }
   }
   /**
   * The method is required by Checkstyle.
   * @return **return**
   */
   public int hashCode() {
      return 0;
   }
   /**
   * Comment for function.
   * @param obj **compare**
   * @return **return**
   */
   public int compareTo(TriangularPrism obj) {
      if (Math.abs(this.volume() - obj.volume()) < 0.000001) {
         return 0;
      }
      else if (this.volume() < obj.volume()) {
         return -1;
      }
      else {
         return 1;
      }
   }
}
