package building;

/**
 * This class implements Facade. It organizes the methods/operations in sub-systems and provides
 * simplified methods to Client.
 */
public class FacadeImpl implements Facade {
  private Floor f1;
  private Floor f2;
  private Floor f3;
  private Floor f4;

  /**
   * Constructs a FacadeImpl object.
   */
  public FacadeImpl() {
    f1 = new Floor1();
    f2 = new Floor2();
    f3 = new Floor3();
    f4 = new Floor4();
  }

  @Override public String turnOnAllLights() {
    return f1.turnOnLights() + f2.turnOnLights() + f3.turnOnLights() + f4.turnOnLights();
  }

  @Override public String turnOnAllAirConditioners() {
    return f1.turnOnAirConditioner() + f2.turnOnAirConditioner() + f3.turnOnAirConditioner()
        + f4.turnOnAirConditioner();
  }

  @Override public String turnOffAllPrinters() {
    return f1.turnOffPrinter() + f2.turnOffPrinter() + f3.turnOffPrinter() + f4.turnOffPrinter();
  }

  @Override public String turnOnAllBuilding() {
    return f1.turnOnLights() + f1.turnOnAirConditioner() + f1.turnOnPrinter() + f2.turnOnLights()
        + f2.turnOnAirConditioner() + f2.turnOnPrinter() + f3.turnOnLights()
        + f3.turnOnAirConditioner() + f3.turnOnPrinter() + f4.turnOnLights()
        + f4.turnOnAirConditioner() + f4.turnOnPrinter();
  }

  @Override public String turnOnFloor1() {
    return f1.turnOnLights() + f1.turnOnAirConditioner() + f1.turnOnPrinter();
  }
}
