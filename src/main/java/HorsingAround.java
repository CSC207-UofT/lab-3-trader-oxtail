/* A sample class that implements the given interfaces.
 */
public class HorsingAround implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public HorsingAround() {
        this.maxSpeed = 1;
    }

    @Override
    public String sound() {
        return "Neigh!";
    }

    @Override
    public int upgradeSpeed(int num) {
        if (this.maxSpeed == 0) {
            this.maxSpeed += num;
            return this.maxSpeed;
        } else {
            return this.maxSpeed * upgradeSpeed(this.maxSpeed*num - 1);
        }
    }

    @Override
    public void upgradeSpeed() {

    }

    @Override
    public void downgradeSpeed() {

    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
