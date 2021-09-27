public class Car implements Drivable{
        private int maxSpeed;
        public Car(){
        this.maxSpeed = 100;}
        @Override
        public void upgradeSpeed() {
        this.maxSpeed = 2 * this.maxSpeed;
    }

        @Override
        public void downgradeSpeed () {
        this.maxSpeed--;
    }

        @Override
        public int getMaxSpeed () {
        return this.maxSpeed;
    }

    }
