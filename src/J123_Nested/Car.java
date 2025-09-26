package J123_Nested;

public class Car {
    private int noOfDoors;

    void repair() {
        Tire t = new Tire();
    }

    protected class Tire {
        private double width;
        private double pressure;
        private String material;

        public void inflate() {
            noOfDoors = 4;
        }
    }
}