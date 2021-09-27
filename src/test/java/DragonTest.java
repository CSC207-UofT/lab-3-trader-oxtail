import org.junit.*;

import static org.junit.Assert.*;


public class DragonTest {
    Dragon boy;

    @Before
    public void setUp() throws Exception {
        boy = new Dragon();
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, boy.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        boy.upgradeSpeed();
        assertEquals(2, boy.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        boy.downgradeSpeed();
        assertEquals(0, boy.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, boy.getPrice());
    }
}
