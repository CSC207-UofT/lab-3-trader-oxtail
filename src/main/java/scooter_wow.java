/* A public class Scooter that implements the Drivable and Tradable interfaces
* */
public class scooter_wow implements Drivable, Tradable {
    private int maxSpeed;

    public scooter_wow() { this.maxSpeed = 5; }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed+=2;
    }

    @Override
    public void downgradeSpeed() { this.maxSpeed-=2; }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() { return 10000; }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")"
    }
}
