package building;

/**
 * This is the Facade class, which can call various methods in Floor classes to manage the building.
 * We didn't list all the possible operations here, but just some examples.
 */

public interface Facade {

  /**
   * Turns on all lights in the building.
   *
   * @return a String, confirms all lights in the building are turned on
   */
  String turnOnAllLights();

  /**
   * Turns on all air conditioners in the building.
   *
   * @return a String, confirms all air conditioners in the building are turned on
   */
  String turnOnAllAirConditioners();

  /**
   * Turns off all printers in the building.
   *
   * @return a String, confirms all printers in the building are turned off
   */
  String turnOffAllPrinters();

  /**
   * Turns on all electronic appliances in the building.
   *
   * @return a String, confirms all electronic appliances in the building are turned on
   */
  String turnOnAllBuilding();

  /**
   * Turns on all electronic appliances in floor 1.
   *
   * @return a String, confirms all electronic appliances in floor 1 are turned on
   */
  String turnOnFloor1();
}
