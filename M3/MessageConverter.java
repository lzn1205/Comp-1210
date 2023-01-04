/**
  * Create a program that exchanges letters in a String to encode a message.
  * Activity 3.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version September 5th, 2021.
  */
public class MessageConverter {
   /** A method using Scanner class exchanges letter of string input.
     * Input String.
     * @param args Command line arguments-unused.
     */
   public static void main(String[] args) {
      Scanner userInput = new Scanner(System.in);
      String message = "";
      int outputType;
      String result = "";
      System.out.print("Type in a message and press enter:\n\t> ");
      message = userInput.nextLine();
      // Created the list.
      System.out.print("\nOutput types:"
         + "\n\t0: As is "
         + "\n\t1: Trimmed"
         + "\n\t2: lower case"
         + "\n\t3: UPPER CASE"
         + "\n\t4: v_w_ls r_pl_c_d"
         + "\n\t5: Without first and last character"
         + "\nEnter your choice: ");
      outputType = Integer.parseInt(userInput.nextLine());
      // as is
      if (outputType == 0) {
         result = message;
      }
      // trimmed
      else if (outputType == 1) {
         result = message.trim();
      }
      // lower case
      else if (outputType == 2) {
         result = message.toLowerCase();
      }
      // upper case
      else if (outputType == 3) {
         result = message.toUpperCase();
      } 
      // replace vowels
      else if (outputType == 4) {
         result = message.replace("a", "_");
         result = result.replace("e", "_");
         result = result.replace("i", "_");
         result = result.replace("o", "_");
         result = result.replace("u", "_");
      }
      // without first and last character
      else if (outputType == 5) {
         result = message.substring(1, message.length() - 1);
      }
      // invalid input
      else {
         result = "Error: Invalid choice input.";
      }
      System.out.println("\n" + result);
   }
}
