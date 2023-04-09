import static org.junit.Assert.assertEquals;

import building.FacadeImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the Facade.
 */
public class FacadeTest {
  private FacadeImpl facade;

  /**
   * We Set up one object of type Facade. And test that the constructor works as expected.
   */
  @Before public void setUp() {
    facade = new FacadeImpl();
  }

  /**
   * We test that the turnOnAllLights method works as expected.
   */
  @Test public void testTurnOnAllLights() {
    assertEquals("Floor 1 lights turned on!\n" + "Floor 2 lights turned on!\n"
        + "Floor 3 lights turned on!\n" + "Floor 4 lights turned on!\n", facade.turnOnAllLights());
  }

  /**
   * We test that the turnAllAirConditioners method works as expected.
   */
  @Test public void testTurnOnAllAirConditioners() {
    assertEquals("Floor 1 air conditioner turned on!\n" + "Floor 2 air conditioner turned on!\n"
            + "Floor 3 air conditioner turned on!\n" + "Floor 4 air conditioner turned on!\n",
        facade.turnOnAllAirConditioners());
  }

  /**
   * We test that the turnOffAllPrinters method works as expected.
   */
  @Test public void testTurnOffAllPrinters() {
    assertEquals("Floor 1 printer turned off!\n" + "Floor 2 printer turned off!\n"
            + "Floor 3 printer turned off!\n" + "Floor 4 printer turned off!\n",
        facade.turnOffAllPrinters());
  }

  /**
   * We test that the turnOnAllBuilding method works as expected.
   */
  @Test public void testTurnOnAllBuilding() {
    assertEquals("Floor 1 lights turned on!\n" + "Floor 1 air conditioner turned on!\n"
            + "Floor 1 printer turned on!\n" + "Floor 2 lights turned on!\n"
            + "Floor 2 air conditioner turned on!\n" + "Floor 2 printer turned on!\n"
            + "Floor 3 lights turned on!\n" + "Floor 3 air conditioner turned on!\n"
            + "Floor 3 printer turned on!\n" + "Floor 4 lights turned on!\n"
            + "Floor 4 air conditioner turned on!\n" + "Floor 4 printer turned on!\n",
        facade.turnOnAllBuilding());
  }

  /**
   * We test that the turnOnFloor1 method works as expected.
   */
  @Test public void testTurnOnFloor1() {
    assertEquals("Floor 1 lights turned on!\n" + "Floor 1 air conditioner turned on!\n"
        + "Floor 1 printer turned on!\n", facade.turnOnFloor1());
  }
}