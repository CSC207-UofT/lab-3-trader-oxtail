/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;


public class scooter_wowTest {
    scooter_wow s;

    @Before
    public void setUp() throws Exception {
        s = new scooter_wow();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        s.upgradeSpeed();
        assertEquals(7, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        s.downgradeSpeed();
        assertEquals(3, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10000, s.getPrice());
    }

}