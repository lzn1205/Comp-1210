/**
  * Create a program that writting class.
  * Project 4.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version September 17th, 2021.
  */
import java.text.DecimalFormat;
   /** Decagonal defines objects for label, edge, and height. */
public class DecagonalPrism {
   /** Create a DecagonalPrism class that stores the label,
    edge, and height (edge and height each must be non-negative).
    * Print the object based on input, and run interactions.
    * @param args Command line arguments (not used).
    */
   //Instance variables
   private String label;
   private double edge;
   private double height;
   //Constructors
   /**
   * Comment for function.
   * @param labelIn **Stringlabel**
   * @param edgeIn **edge** 
   * @param heightIn **height** 
   */
   public DecagonalPrism(String labelIn, double edgeIn, double heightIn) {
      setLabel(labelIn);
      setEdge(edgeIn);
      setHeight(heightIn);  
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
      if (labelIn == null) {
         return false;
      }
      else {
         label = labelIn.trim();
         return true;
      }
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
      boolean isSet = true;
      if (edgeIn >= 0) {
         edge = edgeIn;
         return isSet;
      }
      else {
         isSet = false;
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
      boolean isSet = true;
      if (heightIn >= 0) {
         height = heightIn;
         return isSet;
      }
      else {
         isSet = false;
      }
      return isSet;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double surfaceArea() {
      return baseArea() * 2 + lateralSurfaceArea();
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double baseArea() {
      return 2.5 * Math.pow(edge, 2) * Math.sqrt(5 + 2 * Math.sqrt(5));
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double lateralSurfaceArea() {
      return 10 * edge * height;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public double volume() {
      return baseArea() * height;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public String toString() {
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0##");
      String result = "A decagonal prism \"" + label + "\" with edge = " 
         + edge + " units and height = " + height + " units, has:"
         + "\n\tsurface area = " + decimalFormat.format(surfaceArea()) 
         + " square units" + "\n\tbase area = " 
         + decimalFormat.format(baseArea()) 
         + " square units" + "\n\tlateral surface area = " 
         + decimalFormat.format(lateralSurfaceArea()) + " square units" 
         + "\n\tvolume = " + decimalFormat.format(volume()) + " cubic units";
      return result;
   }
}
