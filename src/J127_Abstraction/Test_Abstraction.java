package J127_Abstraction;

public class Test_Abstraction {
    public static void main(String[] args) {
//        Vehicle veh = new Vehicle(2);
        Car car = new Car();
        car.commute();
        car.makeStartSound();
    }
}