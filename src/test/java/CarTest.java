import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Car c;

    @Before
    public void setUp() throws Exception {
        c = new Car();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(200, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(99, c.getMaxSpeed());
    }

}
