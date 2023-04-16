package building;

import java.util.Scanner;

/**
 * This class represents a client for testing the facade implementation of a building's appliances.
 */
public class Client {
  public static void main(String[] args) {
    FacadeImpl facade = new FacadeImpl();
    Scanner scanner = new Scanner(System.in);
    String command;

    while (true) {
      System.out.println("Enter a command (ON, OFF, EXIT): ");
      command = scanner.nextLine().toUpperCase();

      try {
        switch (command) {
          case "ON":
          case "OFF":
            System.out.println("Enter the floor number: ");
            int floorNumber = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            boolean turnOn = "ON".equals(command);
            System.out.println(facade.turnOnFloor(floorNumber));
            break;
          case "EXIT":
            System.out.println("Exiting...");
            scanner.close();
            System.exit(0);
            break;
          default:
            System.out.println("Invalid command, please try again.");
        }
      } catch (IllegalStateException ex) {
        System.err.println(ex.getMessage());
      }
    }
  }
}
