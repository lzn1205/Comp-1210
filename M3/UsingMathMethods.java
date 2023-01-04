import java.util.Scanner;
import java.text.DecimalFormat;
/**
  * Create a program that create and solve Math project.
  * Project 3.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version September 5th, 2021.
  */
public class UsingMathMethods {
  /** A method using Scanner class and DecimalFormat class.
     * Solve math problem by adding input x.
     * Find the variable result based on Input.
     * Print result in many ways.
     * @param args Command line arguments (not used).
     */
   public static void main(String[] args) {
      double x, result;
      // Format 
      DecimalFormat decimalFormat = new DecimalFormat("#,##0.0##");
      // Input x
      Scanner numberInput = new Scanner(System.in);
      System.out.print("Enter a value for x: ");
      x = numberInput.nextDouble();
      // The Problem
      result = (8 * Math.pow(x, 4) + Math.sqrt(Math.abs(4 * Math.pow(x, 3)
         + 4 * Math.pow(x, 2) + 4 * x + 4))) / (4 + Math.abs(x));
      // Output Result
      System.out.print("Result: " + result);   
      String resultCharacter = Double.toString(result);
      // Identify point decimal
      int decimalPoint = resultCharacter.indexOf(".");
      // Left of decimal point
      String leftDecimal = resultCharacter.substring(0, decimalPoint);
      // Right of decimal point
      String rightDecimal = resultCharacter.substring(decimalPoint + 1,
         resultCharacter.length());
      System.out.println("\n# of characters to left of decimal point: "
         + leftDecimal.length());
      System.out.println("# of characters to right of decimal point: "
         + rightDecimal.length());
      System.out.println("Formatted Result: " 
         + decimalFormat.format(result));
   }
}