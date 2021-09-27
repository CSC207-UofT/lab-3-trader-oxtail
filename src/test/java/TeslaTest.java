import org.junit.*;

import static org.junit.Assert.*;

public class TeslaTest {
    Tesla t;

    @Before
    public void setUp() throws Exception {
        t = new Tesla();
    }

    @Test(timeout = 50)
        public void TestGetMaxSpeed() {
            assertEquals(10, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        t.upgradeSpeed();
        assertEquals(11, t.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        t.downgradeSpeed();
        assertEquals(9, t.getMaxSpeed());
    }
}
