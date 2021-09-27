public class Bike implements Drivable, Tradable{
    private int maxispeed;

    public Bike(){this.maxispeed = 35;}

    @Override
    public void upgradeSpeed() {
        this.maxispeed = this.maxispeed + 5;
    }

    @Override
    public void downgradeSpeed() {
        this.maxispeed = this.maxispeed - 5;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxispeed;
    }

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxispeed +")";
    }


}



