package building;

/**
 * This interface represents a facade for controlling a building's appliances. It provides methods
 * for turning on and off various appliances for a single floor, all floors, or the entire
 * building.
 */
public interface Facade {
  /**
   * Turns on all lights in the building.
   *
   * @return a message indicating the success or failure of the operation.
   */
  String turnOnAllLights();

  /**
   * Turns on all air conditioners in the building.
   *
   * @return a message indicating the success or failure of the operation.
   */
  String turnOnAllAirConditioners();

  /**
   * Turns off all printers in the building.
   *
   * @return a message indicating the success or failure of the operation.
   */
  String turnOffAllPrinters();

  /**
   * Turns on all appliances in the building.
   *
   * @return a message indicating the success or failure of the operation.
   */
  String turnOnAllBuilding();

  /**
   * Turns on all appliances on a single floor of the building.
   *
   * @param floorNumber the number of the floor to turn on the appliances for.
   * @return a message indicating the success or failure of the operation.
   */
  String turnOnFloor(int floorNumber);

  /**
   * Turns off all appliances on a single floor of the building.
   *
   * @param floorNumber the number of the floor to turn off the appliances for.
   * @return a message indicating the success or failure of the operation.
   */
  String turnOffFloor(int floorNumber);
}
