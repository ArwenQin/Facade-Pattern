package building;

/**
 * Represents a single floor in the building. Every floor can turn on/off its electronic appliances.
 * We return a String to mock the functionality of turning on/off an electronic appliance.
 */
public interface Floor {

  /**
   * Turns on the lights in this floor.
   *
   * @return a String, confirms the lights are turned on
   */
  String turnOnLights();

  /**
   * Turns off the lights in this floor.
   *
   * @return a String, confirms the lights are turned off
   */
  String turnOffLights();

  /**
   * Turns on the air conditioner in this floor.
   *
   * @return a String, confirms the air conditioner is turned on
   */
  String turnOnAirConditioner();

  /**
   * Turns off the air conditioner in this floor.
   *
   * @return a String, confirms the air conditioner is turned off
   */
  String turnOffAirConditioner();

  /**
   * Turns on the printer in this floor.
   *
   * @return a String, confirms the printer is turned on
   */
  String turnOnPrinter();

  /**
   * Turns off the printer in this floor.
   *
   * @return a String, confirms the printer is turned off
   */
  String turnOffPrinter();

}
