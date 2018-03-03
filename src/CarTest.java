import org.junit.Test;
import org.junit.Before;

import java.util.Set;
import java.util.concurrent.locks.Condition;

import static org.junit.Assert.*;

/**
 * Tests for Car
 */
public class CarTest {
    private static final double TOL = 1.0e-12;
    private Car testCar;
    private static final double TANK_CAPACITY = 50.0;
    public static final double fuel = 50.0;


    // YOU DO NOT NEED TO TEST GETTER AND SETTER METHODS DIRECTLY

    @Before
    public void setUp() {
        testCar = new Car();
    }

    @Test
    public void testConstructor() {
        assertEquals(TANK_CAPACITY, testCar.getFuel(), TOL);
        assertEquals("working", testCar.getCondition());
        assertEquals(0, testCar.getTotalDistanceTravelled());
    }

    @Test
    public void testBroken(){
        assertEquals("broken", testCar.getCondition());
        assertEquals(fuel, testCar.getFuel());
        assertEquals(1000, testCar.getTotalDistanceTravelled());

    }

    @Test
    public void testGetDistanceUntilEmpty() {
        assertEquals(TOL, testCar.getFuel(),TANK_CAPACITY);
    }

    @Test
    public void testDrive() {
        testCar.setFuel((int) fuel - 20);
    }

    @Test
    public void testAddGasToTank() {
    }

    @Test
    public void testRepair() {
        assertEquals(TANK_CAPACITY, testCar.getFuel(), TOL);
        assertEquals("working", testCar.getCondition());
        assertEquals(2, testCar.getTotalDistanceTravelled());
    }

    //TODO: CREATE TESTS FOR YOUR OWN METHODS
}