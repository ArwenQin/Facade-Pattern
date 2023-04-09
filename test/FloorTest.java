import static org.junit.Assert.assertEquals;

import building.Floor;
import building.Floor1;
import building.Floor2;
import building.Floor3;
import building.Floor4;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for Floor classes.
 */
public class FloorTest {
  private Floor f1;
  private Floor f2;
  private Floor f3;
  private Floor f4;

  /**
   * We Set up some objects of type Floor. And test that the constructors work as expected.
   */
  @Before public void setUp() {
    f1 = new Floor1();
    f2 = new Floor2();
    f3 = new Floor3();
    f4 = new Floor4();

  }

  /**
   * We test that the turnOnLights method works as expected.
   */
  @Test public void testTurnOnLights() {
    assertEquals("Floor 1 lights turned on!\n", f1.turnOnLights());
    assertEquals("Floor 2 lights turned on!\n", f2.turnOnLights());
    assertEquals("Floor 3 lights turned on!\n", f3.turnOnLights());
    assertEquals("Floor 4 lights turned on!\n", f4.turnOnLights());
  }

  /**
   * We test that the turnOffLights method works as expected.
   */
  @Test public void testTurnOffLights() {
    assertEquals("Floor 1 lights turned off!\n", f1.turnOffLights());
    assertEquals("Floor 2 lights turned off!\n", f2.turnOffLights());
    assertEquals("Floor 3 lights turned off!\n", f3.turnOffLights());
    assertEquals("Floor 4 lights turned off!\n", f4.turnOffLights());
  }

  /**
   * We test that the turnOnAirConditioner method works as expected.
   */
  @Test public void testTurnOnAirConditioner() {
    assertEquals("Floor 1 air conditioner turned on!\n", f1.turnOnAirConditioner());
    assertEquals("Floor 2 air conditioner turned on!\n", f2.turnOnAirConditioner());
    assertEquals("Floor 3 air conditioner turned on!\n", f3.turnOnAirConditioner());
    assertEquals("Floor 4 air conditioner turned on!\n", f4.turnOnAirConditioner());
  }

  /**
   * We test that the turnOffAirConditioner method works as expected.
   */
  @Test public void testTurnOffAirConditioner() {
    assertEquals("Floor 1 air conditioner turned off!\n", f1.turnOffAirConditioner());
    assertEquals("Floor 2 air conditioner turned off!\n", f2.turnOffAirConditioner());
    assertEquals("Floor 3 air conditioner turned off!\n", f3.turnOffAirConditioner());
    assertEquals("Floor 4 air conditioner turned off!\n", f4.turnOffAirConditioner());
  }

  /**
   * We test that the turnOnPrinter method works as expected.
   */
  @Test public void testTurnOnPrinter() {
    assertEquals("Floor 1 printer turned on!\n", f1.turnOnPrinter());
    assertEquals("Floor 2 printer turned on!\n", f2.turnOnPrinter());
    assertEquals("Floor 3 printer turned on!\n", f3.turnOnPrinter());
    assertEquals("Floor 4 printer turned on!\n", f4.turnOnPrinter());
  }

  /**
   * We test that the turnOffPrinter method works as expected.
   */
  @Test public void testTurnOffPrinter() {
    assertEquals("Floor 1 printer turned off!\n", f1.turnOffPrinter());
    assertEquals("Floor 2 printer turned off!\n", f2.turnOffPrinter());
    assertEquals("Floor 3 printer turned off!\n", f3.turnOffPrinter());
    assertEquals("Floor 4 printer turned off!\n", f4.turnOffPrinter());
  }
}