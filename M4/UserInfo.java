 /**
  * Create a program that writting class.
  * Activity 4.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version September 12th, 2021.
  */
public class UserInfo { 
   /**
    * Create and test the UserInfo class.
    * Print two users information.
    * @param args Command line arguments (not used).
    */
   // instance variables
   private String firstName;
   private String lastName;
   private String location;
   private int age;
   private int status;
   // constant
   private static final int OFFLINE = 0, ONLINE = 1;
   // construction
   /**
   * Comment for function.
   * @param firstNameIn **firstname**
   * @param lastNameIn **lastname** 
   */
   public UserInfo(String firstNameIn, String lastNameIn) {  
      firstName = firstNameIn;
      lastName = lastNameIn;
      location = "Not specified";
      age = 0;
      status = OFFLINE;
   }
   // methods
   /**
   * Comment for function.
   * @return **return**
   */
   public String toString() {
      String output = "Name: " + firstName + " "
         + lastName + "\n";
      output += "Location: " + location + "\n";
      output += "Age: " + age + "\n";
      output += "Status: ";
      if (status == OFFLINE) {
         output += "Offline";
      }
      else {
         output += "Online";
      }
      return output;
   }
    /**
   * Comment for function.
   * @param locationIn **location**
   */
   public void setLocation(String locationIn) {
      location = locationIn;
   }
    /**
   * Comment for function.
   * @param ageIn **age**
   * @return **return**
   */
   public boolean setAge(int ageIn) {
      boolean isSet = false;
      if (ageIn > 0) {
         age = ageIn;
         isSet = true;
      }
      return isSet;     
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public int getAge() {
      return age;                        
   }
   /**
   * Comment for function.
   * @return **return**
   */
   public String getLocation() {
      return location;
   }
   /**
   * Comment for function.
   */
   public void logOff() {
      status = OFFLINE;
   }
   /**
   * Comment for function.
   */
   public void logOn() {
      status = ONLINE;
   }
}