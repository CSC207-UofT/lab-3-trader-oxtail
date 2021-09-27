/* A Bike class that implements the Tradable and Driveable interfaces.
 */
public class Bike implements Drivable, Tradable{
    private int maxSpeed;

    public Bike(){this.maxSpeed = 35;}

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 5;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 5;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }


}



