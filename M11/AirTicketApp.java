/**
  * Create a program that writting class.
  * project 10.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version November 12th, 2021.
  */
import java.io.FileNotFoundException;
/** set format. */
public class AirTicketApp {
   /**
   * Comment for function.
   * @param  args **comments**
   * @throws FileNotFoundException **comments**
   */
   public static void main(String[] args) {
      if (args.length == 0 || args[0] == null || args[0].equals("")) {
         System.out.print("***"
               + " File name not provided by command line argument."
               + "\nProgram ending.\n"); 
      }
      else {
         try {
            AirTicketProcessor t = new AirTicketProcessor();
            t.readAirTicketFile(args[0]);
            System.out.println(t.generateReport());
            System.out.println(t.generateReportByFlightNum());
            System.out.println(t.generateReportByItinerary());
            System.out.println(t.generateReportForInvalidInput());
         }
         
         catch (FileNotFoundException e) {
            System.out.print("*** File not found."
                  + "\nProgram ending.\n");
         } 
      }  
   }
}