package building;

/**
 * The interface defines the methods that need to be implemented by all concrete floor classes.
 */
public interface Floor {
  /**
   * Turns on the lights on the floor.
   *
   * @return a message indicating the success or failure of the operation.
   */
  String turnOnLights();

  /**
   * Turns off the lights on the floor.
   *
   * @return a message indicating the success or failure of the operation.
   */
  String turnOffLights();

  /**
   * Turns on the air conditioner on the floor.
   *
   * @return a message indicating the success or failure of the operation.
   */
  String turnOnAirConditioner();

  /**
   * Turns off the air conditioner on the floor.
   *
   * @return a message indicating the success or failure of the operation.
   */
  String turnOffAirConditioner();

  /**
   * Turns on the printer on the floor.
   *
   * @return a message indicating the success or failure of the operation.
   */
  String turnOnPrinter();

  /**
   * Turns off the printer on the floor.
   *
   * @return a message indicating the success or failure of the operation.
   */
  String turnOffPrinter();
}
