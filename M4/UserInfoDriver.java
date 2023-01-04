/**
  * Create a program that writting class.
  * Activity 4.
  * @author Long Nguyen - COMP 1210 - D01.
  * @version September 12th, 2021.
  */
public class UserInfoDriver {
   /**
   * Create UserInfoDriver class with main method.
   * Create a project file and generate UML class diagram for the program.
   * Print two users information.
   * @param args Command line arguments (not used).
   */
   public static void main(String[] args) {
      UserInfo user1 = new UserInfo("Pat", "Doe");
      System.out.println("\n" + user1);
      user1.setLocation("Auburn");
      user1.setAge(19);
      user1.logOn();
      System.out.println("\n" + user1);  
      
      UserInfo user2 = new UserInfo("Sam", "Jones");
      System.out.println("\n" + user2);
      user2.setLocation("Atlanta");
      user2.setAge(21);
      user2.logOn();
      System.out.println("\n" + user2);
   }
}