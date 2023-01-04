import java.util.Scanner;
/** Create a program that accepts a raw time measurement in seconds
    and then prints out all days, hours, minites and second.
  * Project 2.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version August 30th, 2021.
  */
public class TimeInSeconds {
   /** A method using Scanner class to input raw time in seconds.
      * Input raw time in seconds.
      * Find the variable result based on Input.
      * Print detail information, including days, hours, minites, and second.
      * @param args Command line arguments – not used.
      */
   public static void main(String[] args) {
      //Create an instance of Scanner class
      Scanner timeInput = new Scanner(System.in);
      int time = 0;
      //Input raw time in seconds
      System.out.print("Enter the raw time in seconds: ");
      time = timeInput.nextInt();
      //Create information each part to assign number
      int initialTime, days, hours, minutes, seconds = 0;
      //Condition fails
      if (time < 0) {
         System.out.print("*** Time must be non-negative. ***\n");
      }
      //Condition accepts
      else {
         //assign time for initialTime for later on purpose
         initialTime = time;
         System.out.print("\nTime by combined days, hours" 
            + ", minutes, seconds:");
         //assign time for days for later on purpose
         days = time / 86400;
         System.out.print("\n\tdays: " + days);
         time %= 86400;
         //assign time for hours for later on purpose
         hours = time / 3600;
         System.out.print("\n\thours: " + hours);
         time %= 3600;
         //assign time for minutes for later on purpose
         minutes = time / 60;
         System.out.print("\n\tminutes: " + minutes);
         time %= 60;
         //assign time for seconds for later on purpose
         seconds = time;
         System.out.print("\n\tseconds: " + seconds + "\n\n"); 
         //print final answer
         System.out.print(initialTime + " seconds = " + days + " days, " 
            + hours + " hours, " + minutes + " minutes, " 
            + seconds + " seconds");
      }
   }
}

