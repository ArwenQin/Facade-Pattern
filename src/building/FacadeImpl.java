package building;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a facade implementation for controlling a building's appliances. It
 * provides methods for turning on and off various appliances for a single floor, all floors, or the
 * entire building.
 */
public class FacadeImpl implements Facade {
  private final Map<Integer, Floor> floors;

  /**
   * Constructs a new FacadeImpl object. Initializes a map of floors with the associated Floor
   * objects.
   */
  public FacadeImpl() {
    floors = new HashMap<>();
    floors.put(1, new Floor1());
    floors.put(2, new Floor2());
    floors.put(3, new Floor3());
    floors.put(4, new Floor4());
  }

  @Override public String turnOnFloor(int floorNumber) {
    checkFloorNumber(floorNumber);
    return turnOnAllAppliancesForFloor(floorNumber);
  }

  @Override public String turnOffFloor(int floorNumber) {
    checkFloorNumber(floorNumber);
    return turnOffAllAppliancesForFloor(floorNumber);
  }

  private void checkFloorNumber(int floorNumber) {
    if (floorNumber < 1 || floorNumber > 4) {
      throw new IllegalArgumentException("Invalid floor number: " + floorNumber);
    }
  }

  private Floor getFloor(int floorNumber) {
    return floors.get(floorNumber);
  }

  @Override public String turnOnAllLights() {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 4; i++) {
      sb.append(turnOnFloor(i));
    }
    return sb.toString();
  }

  @Override public String turnOnAllAirConditioners() {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 4; i++) {
      sb.append(getFloor(i).turnOnAirConditioner());
    }
    return sb.toString();
  }

  @Override public String turnOffAllPrinters() {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 4; i++) {
      sb.append(getFloor(i).turnOffPrinter());
    }
    return sb.toString();
  }

  @Override public String turnOnAllBuilding() {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= 4; i++) {
      sb.append(turnOnFloor(i));
    }
    return sb.toString();
  }

  /**
   * Helper method to turn on all appliances for a given floor.
   *
   * @param floorNumber the number of the floor to turn on the appliances for.
   * @return a message indicating the success or failure of the operation.
   */
  private String turnOnAllAppliancesForFloor(int floorNumber) {
    Floor floor = getFloor(floorNumber);
    StringBuilder sb = new StringBuilder();
    sb.append(floor.turnOnLights());
    sb.append(floor.turnOnAirConditioner());
    sb.append(floor.turnOnPrinter());
    return sb.toString();
  }

  /**
   * Helper method to turn off all appliances for a given floor.
   *
   * @param floorNumber the number of the floor to turn off the appliances for.
   * @return a message indicating the success or failure of the operation.
   */
  private String turnOffAllAppliancesForFloor(int floorNumber) {
    Floor floor = getFloor(floorNumber);
    StringBuilder sb = new StringBuilder();
    sb.append(floor.turnOffLights());
    sb.append(floor.turnOffAirConditioner());
    sb.append(floor.turnOffPrinter());
    return sb.toString();
  }
}

