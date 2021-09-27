import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;



public class BikeTest {
    Bike b;

    @Before
    public void setUp() throws Exception {
        b = new Bike();
    }

    // TESTS IMPLEMENTED METHODS FOR DRIVEABLE INTERFACE

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(35, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        b.upgradeSpeed();
        assertEquals(40, b.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        b.downgradeSpeed();
        assertEquals(30, b.getMaxSpeed());
    }

    // TESTS IMPLEMENTED METHOD FOR TRADEABLE INTERFACE

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(50, b.getPrice());
    }

}