import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Random;
/**
  * Create a program that show details of ticket.
  * Project 3.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version September 5th, 2021.
  */
public class MoonTrip {
   /** A method using Scanner, DecimalFormat, and Random class.
     * Input ticket code.
     * Find the variable results based on Input.
     * Print result in details.
     * @param args Command line arguments (not used).
     */
   public static void main(String[] args) { 
      Random prize = new Random();
      DecimalFormat priceAndcost = new DecimalFormat("$#,##0.00");
      DecimalFormat disCount = new DecimalFormat("0%");
      DecimalFormat prizeNumber = new DecimalFormat("00000");
      Scanner ticket = new Scanner(System.in);
      System.out.print("Enter ticket code: ");
      String ticketCode = ticket.nextLine();
      // Eleminate spaces. 
      String code = ticketCode.trim();
      if (code.length() < 27) {
         //System.out.println("" + code);
         System.out.println("\n*** Invalid Ticket Code ***"
            + "\nTicket code must have at least 27 characters.");
      }
      else {
         // Ticket by using substring
         System.out.print("\nTicket: " + code.substring(26, code.length())); 
         // Date by using substring
         System.out.print("   Date: " + code.substring(0, 2) 
            + "/" + code.substring(2, 4) + "/" + code.substring(4, 8));
         // Time by using substring
         System.out.print("   Time: " + code.substring(8, 10) + ":" 
            + code.substring(10, 12));
         // Seat by using substring
         System.out.print("\nSeat: " + code.substring(23, 26));
         String price = code.substring(12, 21);
         // Switch string to number
         double numberPrice = Double.parseDouble(price) / 100;
         System.out.print("   Price: "
            + priceAndcost.format(numberPrice));
         String discount = code.substring(21, 23);
         double numberDiscount = Double.parseDouble(discount) / 100;
         System.out.print("   Discount: "
            + disCount.format(numberDiscount));
         // Cost
         double cost = numberPrice * (1 - numberDiscount);
         System.out.print("   Cost: "
            + priceAndcost.format(cost));
         // Prize number
         int numberPrize = prize.nextInt(99999) + 1;
         System.out.println("\nPrize Number: "
            + prizeNumber.format(numberPrize));
      }
   }
}