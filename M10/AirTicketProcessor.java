/**
  * Create a program that writting class.
  * project 10.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version November 12th, 2021.
  */
import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.FileNotFoundException;
/** set format. */
public class AirTicketProcessor {
   private AirTicket[] airticketObjs;
   private String[] invalidRecords;
   /**
   * Comment for function.
   */
   public AirTicketProcessor() {
      airticketObjs = new AirTicket[0];
      invalidRecords = new String[0];
   }
   /**
   * Comment for function.
   * @param fileName **comments**
   * @throws FileNotFoundException **comments**
   */
   public void readAirTicketFile(String fileName) throws FileNotFoundException {
      Scanner inFile = new Scanner(new File(fileName));
      
      while (inFile.hasNext()) {
      
         Scanner lineScan = new Scanner(inFile.nextLine()).
                  useDelimiter(",");         
         while (lineScan.hasNext()) {
            String flightNum;
            Itinerary tripData;
            AirTicket airTicket;
            
            switch (lineScan.next().charAt(0)) {
            
               case 'N':
                  flightNum = lineScan.next();
                  tripData = new Itinerary(lineScan.next(), lineScan.next(), 
                     lineScan.next(), lineScan.next(), 
                     Integer.parseInt(lineScan.next()));
                  airTicket = new NonRefundable(flightNum, tripData, 
                     Double.parseDouble(lineScan.next()), 
                     Double.parseDouble(lineScan.next()), 
                     Double.parseDouble(lineScan.next()));
                  
                  addAirTicket(airTicket);
                  break;
               
               case 'E':
                  flightNum = lineScan.next();
                  tripData = new Itinerary(lineScan.next(), lineScan.next(), 
                     lineScan.next(), lineScan.next(), 
                     Integer.parseInt(lineScan.next()));
                  airTicket = new Economy(flightNum, tripData, 
                     Double.parseDouble(lineScan.next()), 
                     Double.parseDouble(lineScan.next()));
                  
                  addAirTicket(airTicket);
                  break;
               
               case 'B':
                  flightNum = lineScan.next();
                  tripData = new Itinerary(lineScan.next(), lineScan.next(), 
                     lineScan.next(), lineScan.next(), 
                     Integer.parseInt(lineScan.next()));
                  airTicket = new Business(flightNum, tripData, 
                     Double.parseDouble(lineScan.next()), 
                     Double.parseDouble(lineScan.next()), 
                     Double.parseDouble(lineScan.next()), 
                     Double.parseDouble(lineScan.next()));
                  
                  addAirTicket(airTicket);
                  break;   
                  
               case 'F':
                  flightNum = lineScan.next();
                  tripData = new Itinerary(lineScan.next(), 
                     lineScan.next(), lineScan.next(), 
                     lineScan.next(), Integer.parseInt(lineScan.next()));
                  airTicket = new Elite(flightNum, tripData, 
                     Double.parseDouble(lineScan.next()), 
                     Double.parseDouble(lineScan.next()), 
                     Double.parseDouble(lineScan.next()), 
                     Double.parseDouble(lineScan.next()), 
                     Double.parseDouble(lineScan.next()));
                  
                  addAirTicket(airTicket);
                  break;   
               
               default:
                  break;
            }
         }
      }
   }
   /**
   * Comment for function.
   * @param objectsIn **comments**
   */
   public void addAirTicket(AirTicket objectsIn) {
      airticketObjs = Arrays.copyOf(airticketObjs, airticketObjs.length + 1);
      airticketObjs[airticketObjs.length - 1] = objectsIn; 
   }
    /**
   * Comment for function.
   * @param invalidRecordsIn **comments**
   */
   public void addInvalidRecord(String invalidRecordsIn) {
      invalidRecords = Arrays.copyOf(invalidRecords, invalidRecords.length + 1);
      invalidRecords[invalidRecords.length - 1] = invalidRecordsIn; 
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public String generateReport() {
      String output = "----------------------------\n" 
         + "Air Ticket Report\n"
         + "----------------------------"; 
      for (int i = 0; i < airticketObjs.length; i++) {
         output += "\n\n" + airticketObjs[i].toString();
      }
      return output + "\n";   
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public String generateReportByFlightNum() {
      AirTicket[] a = Arrays.copyOf(airticketObjs, airticketObjs.length);
      Arrays.sort(a);
      String output = "--------------------------------------\n"
         + "Air Ticket Report (by Flight Number)\n"
         + "--------------------------------------";
      for (int i = 0; i < airticketObjs.length; i++) {
         output += "\n\n" + a[i].toString();
      }
      return output + "\n"; 
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public String generateReportByItinerary() {
      AirTicket[] a = Arrays.copyOf(airticketObjs, airticketObjs.length);
      Arrays.sort(a, new ItineraryComparator());
      String output = "--------------------------------------\n"
         + "Air Ticket Report (by Itinerary)\n"
         + "--------------------------------------";
      for (int i = 0; i < airticketObjs.length; i++) {
         output += "\n\n" + a[i].toString();
      }
      return output + "\n";   
   }
  
}