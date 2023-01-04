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
   public static void main(String[] args) throws FileNotFoundException {
      if (args.length == 0) {
         System.out.println("File name expected as command line argument." 
            + "\nProgram ending.");      
      }
      else {
         AirTicketProcessor t = new AirTicketProcessor();
         t.readAirTicketFile(args[0]);
         System.out.println(t.generateReport());
         System.out.println(t.generateReportByFlightNum());
         System.out.println(t.generateReportByItinerary());         
      }
      
   }
}