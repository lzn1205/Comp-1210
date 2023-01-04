import java.util.Scanner;
/**
  * Create a program that displays the age Statistics.
  * Activity 2.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version August 28th, 2021.
  */
public class AgeStatistics {
   /** A method using Scanner class to print some statistic.
     * Prints name, age, and gender one time.
     * Prints age in minutes and centuries one time.
     * Prints max heart rate one time.
     * @param args Command line arguments – not used.
     */
   public static void main(String[] args) {   
      //create an instance of Scanner class
      Scanner userInput = new Scanner(System.in);
      String name = "";
      int ageInYears = 0;
      int gender = 0;
      double maxHeartRate = 0;
      //Prompt the user for their name:
      System.out.print("Enter your name: ");
      name = userInput.nextLine();
      //Prompt the user for their age:
      System.out.print("Enter your age in years: ");
      ageInYears = userInput.nextInt();
      //Promt the user for their gender: 
      System.out.print("Enter your gender (1 for female and 0 for male): ");
      gender = userInput.nextInt();
      //convert age:
      System.out.print("\tYour age in minutes is "
         + ageInYears * 525600 + " minutes.");
      System.out.print("\n\tYour age in centuries is "
         + (double) ageInYears / 100 + " centuries.");
      //display max heart rate
      System.out.print("\nYour max heart rate is ");
      //calculate female MHR
      if (gender == 1) 
      {
         maxHeartRate = 209 - (0.7 * ageInYears);
      }
      //calculate male MHR
      else if (gender == 0) 
      {
         maxHeartRate = 214 - (0.8 * ageInYears);
      }
      System.out.print(maxHeartRate + " beats per minute.");     
   }
}
