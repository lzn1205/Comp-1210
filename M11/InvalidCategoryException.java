/**
  * Create a program that writting class.
  * Project 11.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version November 22th, 2021.
  */
public class InvalidCategoryException extends Exception {
   /**
   * Comment for function.
   * @param category **comments**
   */
   public InvalidCategoryException(String category) {
      super("For category: " + "\"" + category + "\"");
   }
}