package building;

/**

 * This class represents a client for testing the facade implementation of a building's appliances.
 */
public class Client {
  public static void main(String[] args) {
    FacadeImpl facade = new FacadeImpl();
    try {
      System.out.println(facade.turnOnAllBuilding());
    } catch (IllegalStateException ex) {
      System.err.println(ex.getMessage());
    }
  }
}
