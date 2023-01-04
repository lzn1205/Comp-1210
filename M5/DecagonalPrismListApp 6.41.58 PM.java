/**
  * Create a program that writting class.
  * Project 5.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version September 24th, 2021.
  */
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
/** import list of class to define this list. */ 
public class DecagonalPrismListApp {
   /** Reading file and then use this file to print the output.
     * @param args - not used.
     * @throws FileNotFoundException ** for Scanner on File **
     */
   public static void main(String[] args) throws FileNotFoundException {
      ArrayList<DecagonalPrism> listOutput = new ArrayList<DecagonalPrism>();
      Scanner input = new Scanner(System.in);
      System.out.print("Enter file name: ");
      String fileName = input.nextLine();
      Scanner inFile = new Scanner(new File(fileName));
      String listName = inFile.nextLine();
      while (inFile.hasNextLine()) {
         String objectSize = inFile.nextLine();
         double objectEdge = Double.parseDouble(inFile.nextLine());
         double objectHeight = Double.parseDouble(inFile.nextLine());          
         DecagonalPrism output 
            = new DecagonalPrism(objectSize, objectEdge, objectHeight);
         listOutput.add(output);
      }
      DecagonalPrismList fullList 
         = new DecagonalPrismList(listName, listOutput);
      System.out.print("\n" + fullList.getName() + "\n\n" 
         + fullList.toString() + "\n");
      System.out.println(fullList.summaryInfo());
   }
}