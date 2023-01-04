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
import java.util.NoSuchElementException;
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
         String line = inFile.nextLine();
         Scanner lineScan = new Scanner(line);
         lineScan.useDelimiter(",");
         /**char element = lineScan.next().charAt(0); 
         String a = element + "";*/       
         while (lineScan.hasNext()) {
            String flightNum;
            Itinerary tripData;
            AirTicket airTicket;
            char element = lineScan.next().toUpperCase().charAt(0); 
            String a = element + "";
            try {
               switch (element) {
            
                  case 'N':                  
                     flightNum = lineScan.next().trim();
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
                     flightNum = lineScan.next().trim();
                     tripData = new Itinerary(lineScan.next(), lineScan.next(), 
                        lineScan.next(), lineScan.next(), 
                        Integer.parseInt(lineScan.next()));
                     airTicket = new Economy(flightNum, tripData, 
                        Double.parseDouble(lineScan.next()), 
                        Double.parseDouble(lineScan.next()));
                  
                     addAirTicket(airTicket);
                     break;
               
                  case 'B':
                     flightNum = lineScan.next().trim();
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
                     flightNum = lineScan.next().trim();
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
                     if (lineScan.hasNext()) {
                        lineScan.nextLine();
                     }
                      
                     throw new InvalidCategoryException(a);   
               }
            }
            
            catch (InvalidCategoryException e) {
               String result = e + " in: " + line;
               addInvalidRecord(result);
            }
            
            catch (NumberFormatException e) {
               String result = e + " in: " + line;
               addInvalidRecord(result);
            }
            
            catch (NoSuchElementException e) {
               String result = e + " in: " + line;
               addInvalidRecord(result);
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
   /**
   * Comment for function.
   * @return **return**
   */
   public AirTicket[] getTickets() {
      return airticketObjs;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public String[] getInvalidInput() {
      return invalidRecords;
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public String generateReportForInvalidInput() {
      String output = "--------------------------------------\n"
         + "Air Ticket Report for Invalid Input\n"
         + "--------------------------------------"; 
      for (int i = 0; i < invalidRecords.length; i++) {
         output += "\n" + invalidRecords[i];  
      } 
      return output + "\n";  
   }
   
}
