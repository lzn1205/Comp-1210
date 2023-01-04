/**
  * Create a program that writting class.
  * Project 6.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version October 2nd, 2021.
  */
import java.util.ArrayList;
/** To create the array list */
import java.text.DecimalFormat;
/** Decagonal defines objects final summary list. */
import java.io.File;
/** File import */
import java.io.FileNotFoundException;
/** throw method*/
import java.util.Scanner;
/** input.*/
public class DecagonalPrismList {
   // Fields
   private String nameList;
   private ArrayList<DecagonalPrism> listObjects 
      = new ArrayList<DecagonalPrism>();
   // Constructors
   /**
   * Comment for function.
   * @param nameListIn **Stringlabel**
   * @param listObjectsIn **list**
   */
   public DecagonalPrismList(String nameListIn, 
      ArrayList<DecagonalPrism> listObjectsIn) {
      nameList = nameListIn;
      listObjects = listObjectsIn;
   }
   // Methods

   /**
   * Comment for function.
   * @return **return**
   */

   public String getName() {
      return nameList;
   }
   
   /**
   * Comment for function.
   * @return **return**
   */

   public int numberOfDecagonalPrisms() {
      if (listObjects.size() != 0) {
         return listObjects.size();
      }
      else {
         return 0;
      }
   }
   
   /**
   * Comment for function.
   * @return **return**
   */

   public double totalSurfaceArea() {
      double sumSurArea = 0.0;
      int i = 0;
      while (i < listObjects.size()) {
         sumSurArea += listObjects.get(i).surfaceArea();
         i++;
      }
      return sumSurArea;
   }
   
   /**
   * Comment for function.
   * @return **return**
   */

   public double totalBaseArea() {
      double sumBaseArea = 0.0;
      int i = 0;
      while (i < listObjects.size()) {
         sumBaseArea += listObjects.get(i).baseArea();
         i++;
      }
      return sumBaseArea; 
   }
   
   /**
   * Comment for function.
   * @return **return**
   */

   public double totalLateralSurfaceArea() {
      double sumLarSurArea = 0.0;
      int i = 0;
      while (i < listObjects.size()) {
         sumLarSurArea += listObjects.get(i).lateralSurfaceArea();
         i++;
      }
      return sumLarSurArea; 
   }
   
   /**
   * Comment for function.
   * @return **return**
   */

   public double totalVolume() {
      double sumVolume = 0.0;
      int i = 0;
      while (i < listObjects.size()) {
         sumVolume += listObjects.get(i).volume();
         i++;
      }
      return sumVolume; 
   }
   
   /**
   * Comment for function.
   * @return **return**
   */

   public double averageSurfaceArea() {
      if (listObjects.size() != 0) {
         return totalSurfaceArea() / numberOfDecagonalPrisms();
      }
      else {
         return 0;
      }
   }
   
   /**
   * Comment for function.
   * @return **return**
   */

   public double averageVolume() {
      if (listObjects.size() != 0) {
         return totalVolume() / numberOfDecagonalPrisms();
      }
      else {
         return 0;
      }
   }

   /**
   * Comment for function.
   * @return **return**
   */

   public String toString() {
      if (listObjects.size() != 0) {
         String result = "";
         int i = 0;
         while (i < listObjects.size()) {
            result += listObjects.get(i).toString();
            i++;
         }
         return result;
      }
      else {
         return "";
      }
   }
   
   /**
   * Comment for function.
   * @return **return**
   */

   public String summaryInfo() {
      DecimalFormat resultFormat = new DecimalFormat("#,##0.0##");
      String result = "----- Summary for " + nameList + " -----"
         + "\nNumber of Decagonal Prisms: " + numberOfDecagonalPrisms()
         + "\nTotal Surface Area: " + resultFormat.format(totalSurfaceArea())
         + "\nTotal Base Area: " 
         + resultFormat.format(totalBaseArea())
         + "\nTotal Lateral Surface Area: " 
         + resultFormat.format(totalLateralSurfaceArea())
         + "\nTotal Volume: " + resultFormat.format(totalVolume())
         + "\nAverage Surface Area: " 
         + resultFormat.format(averageSurfaceArea())
         + "\nAverage Volume: " + resultFormat.format(averageVolume());
      return result;     
   }
   
   /**
   * Comment for function.
   * @return **return**
   */

   public ArrayList<DecagonalPrism> getList() {
      return listObjects;
   }     
   /**
   * Comment for function.
   * @param fileNameIn **fileName**
   * @throws FileNotFoundException ** comment**
   * @return **return**
   */ 
   public DecagonalPrismList readFile(String fileNameIn) 
                                       throws FileNotFoundException {
      Scanner inFile = new Scanner(new File(fileNameIn));
      ArrayList<DecagonalPrism> listOutput = new ArrayList<DecagonalPrism>();

      nameList = inFile.nextLine();
       
      while (inFile.hasNextLine()) {
         String objectSize = inFile.nextLine();
         double objectEdge = Double.parseDouble(inFile.nextLine());
         double objectHeight = Double.parseDouble(inFile.nextLine()); 
                  
         DecagonalPrism output 
            = new DecagonalPrism(objectSize, objectEdge, objectHeight);
         listOutput.add(output);
      }
      
      DecagonalPrismList fullList 
         = new DecagonalPrismList(nameList, listOutput);
      
      return fullList;
   }
   
   /**
   * Comment for function.
   * @param labelIn **Stringlabel**
   * @param edgeIn **edge** 
   * @param heightIn **height** 
   */
   
   public void addDecagonalPrism(String labelIn, 
               double edgeIn, double heightIn)  {
      
      DecagonalPrism addNumber = new DecagonalPrism(labelIn, edgeIn, heightIn);
      
      listObjects.add(addNumber);
   }
   
   /**
   * Comment for function.
   * @return **return**
   * @param labelIn **Stringlabel**
   */
   
   public DecagonalPrism findDecagonalPrism(String labelIn) { 
            
      for (DecagonalPrism tool : listObjects) {
         if (tool.getLabel().equalsIgnoreCase(labelIn)) {
            return tool;
         }
      }
      return null;
   }
   
   /**
   * Comment for function.
   * @param labelIn **Stringlabel**
   * @return **return**
   */
   
   public DecagonalPrism deleteDecagonalPrism(String labelIn) {
      DecagonalPrism tool1 = null;
      tool1 = findDecagonalPrism(labelIn);
      
      if (tool1 != null) {
         listObjects.remove(tool1);
      }
      
      return tool1;
   }
   
   /**
   * Comment for function.
   * @param labelIn **Stringlabel**
   * @param edgeIn **edge** 
   * @param heightIn **height**
   * @return **return** 
   */
   
   public boolean editDecagonalPrism(String labelIn, 
               double edgeIn, double heightIn) {
      boolean result = false;
      
      for (DecagonalPrism tool : listObjects) {
         if (tool.getLabel().equalsIgnoreCase(labelIn)) {
            tool.setEdge(edgeIn);
            tool.setHeight(heightIn);
            result = true;
         }
      }
      return result;
   }
}