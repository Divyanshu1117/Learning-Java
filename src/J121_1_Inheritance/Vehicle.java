package J121_1_Inheritance;

public class Vehicle {
    //      int numberOfTires;
//    private int numberOfTires;
    protected int numberOfTires;

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    @Override
    public String toString(){
        return "Vehicle no of tires: " + numberOfTires;
    }

    public void commute() {
        System.out.printf("I am going from place A to place B using %d tires\n", numberOfTires);
    }
}