package J128_Interface;

public class Car extends Vehicle {
    private int noOfDoors;

    public Car() {
        super(4);
    }

    @Override
    public void getSetGo() {
        System.out.println("Going To Place...");
    }

    @Override
    public void makeStartSound() {
        System.out.println("Vroommm......");
    }
}