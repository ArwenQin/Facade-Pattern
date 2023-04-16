package building;

import java.util.HashMap;
import java.util.Map;

/**
 * Abstract Class implements Floor.
 */
public abstract class AbstractFloor implements Floor {
  private final int floorNumber;
  private final Map<FloorAppliance, Boolean> applianceStates;

  /**
   * Constructs an abstract floor with the given floor number.
   *
   * @param floorNumber the floor number of this floor.
   */
  protected AbstractFloor(int floorNumber) {
    this.floorNumber = floorNumber;
    applianceStates = new HashMap<>();
    for (FloorAppliance appliance : FloorAppliance.values()) {
      applianceStates.put(appliance, false);
    }
  }

  @Override public String turnOnLights() {
    if (applianceStates.get(FloorAppliance.LIGHTS)) {
      return String.format("Floor %d lights are already on!\n", floorNumber);
    }

    applianceStates.put(FloorAppliance.LIGHTS, true);
    return String.format("Floor %d lights turned on!\n", floorNumber);
  }

  @Override public String turnOffLights() {
    if (!applianceStates.get(FloorAppliance.LIGHTS)) {
      return String.format("Floor %d lights are already off!\n", floorNumber);
    }

    applianceStates.put(FloorAppliance.LIGHTS, false);
    return String.format("Floor %d lights turned off!\n", floorNumber);
  }

  @Override public String turnOnAirConditioner() {
    if (applianceStates.get(FloorAppliance.AIR_CONDITIONER)) {
      return String.format("Floor %d air conditioner is already on!\n", floorNumber);
    }

    applianceStates.put(FloorAppliance.AIR_CONDITIONER, true);
    return String.format("Floor %d air conditioner turned on!\n", floorNumber);
  }

  @Override public String turnOffAirConditioner() {
    if (!applianceStates.get(FloorAppliance.AIR_CONDITIONER)) {
      return String.format("Floor %d air conditioner is already off!\n", floorNumber);
    }

    applianceStates.put(FloorAppliance.AIR_CONDITIONER, false);
    return String.format("Floor %d air conditioner turned off!\n", floorNumber);
  }

  @Override public String turnOnPrinter() {
    if (applianceStates.get(FloorAppliance.PRINTER)) {
      return String.format("Floor %d printer is already on!\n", floorNumber);
    }

    applianceStates.put(FloorAppliance.PRINTER, true);
    return String.format("Floor %d printer turned on!\n", floorNumber);
  }

  @Override public String turnOffPrinter() {
    if (!applianceStates.get(FloorAppliance.PRINTER)) {
      return String.format("Floor %d printer is already off!\n", floorNumber);
    }

    applianceStates.put(FloorAppliance.PRINTER, false);
    return String.format("Floor %d printer turned off!\n", floorNumber);
  }
}
