package building;

/**
 * Abstract Class implements Floor.
 */
public class AbstractFloor implements Floor {
  protected int floorNumber;

  @Override public String turnOnLights() {

    return String.format("Floor %d lights turned on!\n", floorNumber);

  }

  @Override public String turnOffLights() {

    return String.format("Floor %d lights turned off!\n", floorNumber);
  }

  @Override public String turnOnAirConditioner() {

    return String.format("Floor %d air conditioner turned on!\n", floorNumber);

  }

  @Override public String turnOffAirConditioner() {

    return String.format("Floor %d air conditioner turned off!\n", floorNumber);
  }

  @Override public String turnOnPrinter() {

    return String.format("Floor %d printer turned on!\n", floorNumber);

  }

  @Override public String turnOffPrinter() {

    return String.format("Floor %d printer turned off!\n", floorNumber);
  }

}
