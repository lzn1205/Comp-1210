/**
  * Create a program that writting class.
  * Project 6.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version October 2nd, 2021.
  */
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
/** import 3 class to support the project. */
public class DecagonalPrismListMenuApp {
   /**
   * Comment for function.
   * @throws IOException **throws**
   * @param args - not used.
   */
   public static void main(String[] args) throws IOException {
   
      String listName = "*** no list name assigned ***";
      
      ArrayList<DecagonalPrism> listOutput = new ArrayList<DecagonalPrism>();
      
      DecagonalPrismList fullList 
         = new DecagonalPrismList(listName, listOutput);
         
      Scanner userInput = new Scanner(System.in);
      
      String input = "";
      
      System.out.print("DecagonalPrism List System Menu"
         + "\nR - Read File and Create DecagonalPrism List"
         + "\nP - Print DecagonalPrism List"
         + "\nS - Print Summary"
         + "\nA - Add DecagonalPrism"
         + "\nD - Delete DecagonalPrism"
         + "\nF - Find DecagonalPrism"
         + "\nE - Edit DecagonalPrism"
         + "\nQ - Quit\n"); 
           
      do {
         System.out.print("Enter Code [R, P, S, A, D, F, E, or Q]: ");
         
         input = userInput.nextLine();
         if (input.length() == 0) {
            continue;
         }
         
         input = input.toUpperCase();
         char option = input.charAt(0);
         
         switch (option) {
         
            case 'R':
            
               System.out.print("\tFile name: ");
              
               listName = userInput.nextLine();
               
               fullList = fullList.readFile(listName);
               
               System.out.print("\tFile read in " 
                  + "and DecagonalPrism List created\n\n");
                  
               break;
            
            case 'P':
            
               System.out.print("\n" + fullList.getName() + "\n\n" 
                  + fullList.toString());
                  
               break;
            
            case 'S':
            
               System.out.println("\n" + fullList.summaryInfo() + "\n");
               
               break;
            
            case 'A':
            
               System.out.print("\tLabel: ");
               String label = userInput.nextLine();
               System.out.print("\tEdge: ");
               double edge = Double.parseDouble(userInput.nextLine());
               System.out.print("\tHeight: ");
               double height = Double.parseDouble(userInput.nextLine());
               
               System.out.print("\t*** DecagonalPrism added ***\n\n");
               fullList.addDecagonalPrism(label, edge, height);
               
               break;
            
            case 'D':
            
               System.out.print("\tLabel: ");
               label = userInput.nextLine();  
                
               if (fullList.deleteDecagonalPrism(label) != null) {
                  System.out.print("\t\"" + label.substring(0, 1).toUpperCase() 
                     + label.substring(1) + "\" deleted\n\n");
               }
               
               else {
                  System.out.print("\t\"" + label + "\" not found\n\n");
               }
               
               break;
            
            case 'F':
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               
               if (fullList.findDecagonalPrism(label) != null) {
                  System.out.print(
                     fullList.findDecagonalPrism(label).toString());
               }
               
               else {
                  System.out.print("\t\"" + label + "\" not found\n\n");
               } 
               
               break;
            
            case 'E':
            
               System.out.print("\tLabel: ");
               label = userInput.nextLine();
               System.out.print("\tEdge: ");
               edge = Double.parseDouble(userInput.nextLine());
               System.out.print("\tHeight: ");
               height = Double.parseDouble(userInput.nextLine());
               
               if (fullList.findDecagonalPrism(label) != null) {
                  fullList.editDecagonalPrism(label, edge, height);
                  System.out.println("\t\"" + label 
                     + "\" successfully edited\n");
               }
               
               else {
                  System.out.println("\t\"" + label + "\" not found\n");
               }
               
               break;
            
            case 'Q':
            
               break; 
            
            default:
            
               System.out.print("\t*** invalid code ***\n\n");
               
               break;       
         } 
               
      } while (!input.equalsIgnoreCase("Q"));
      
   }
   
}