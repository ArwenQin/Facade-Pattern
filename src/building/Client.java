package building;

/**
 * This class represents the Client, which is the only class used by the user. It can access the simplified methods provided by the Facade class.
 */

public class Client {
  public static void main(String[] args) {
    FacadeImpl f1 = new FacadeImpl();
    f1.turnOffAllPrinters();
    f1.turnOnAllAirConditioners();
    f1.turnOnFloor1();
    f1.turnOnAllLights();
    System.out.println(f1.turnOnAllBuilding());
  }
}
