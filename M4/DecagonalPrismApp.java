import java.util.Scanner;
/**
  * Create a program that writting class.
  * Project 4.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version September 17th, 2021.
  */
public class DecagonalPrismApp {
 /**
   * Create DecagonalPrism class with main method.
   * Create DecagonalPrismApp class with a main method that reads 
   in values for label, edge, and height.    
   * Test edge, height and print ex1.
   * @param args Command line arguments (not used).
   */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      System.out.print("Enter label, edge, and height for a decagonal prism.");
      System.out.print("\n\tlabel: ");
      String label = userInput.nextLine();
      System.out.print("\tedge: ");
      double edgeIn = Double.parseDouble(userInput.nextLine());
      if (edgeIn < 0) {
         System.out.println("Error: edge must be non-negative.");
         return;
      } 
      else {
         System.out.print("\theight: ");
         double heightIn = Double.parseDouble(userInput.nextLine());
         if (heightIn < 0) {
            System.out.println("Error: height must be non-negative.");
            return;
         }
         else {
            DecagonalPrism output = new DecagonalPrism(label, edgeIn, heightIn);
            System.out.println(output);  
         }
      }
   }
}