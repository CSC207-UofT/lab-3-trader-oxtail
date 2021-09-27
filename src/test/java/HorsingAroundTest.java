/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class HorsingAroundTest {
    HorsingAround h;

    @Before
    public void setUp() throws Exception {
        h = new HorsingAround();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Neigh!", h.sound());
    }


    public void TestUpgradeSpeed() {
        h.upgradeSpeed();
        assertEquals(2, h.getMaxSpeed());
    }
}
