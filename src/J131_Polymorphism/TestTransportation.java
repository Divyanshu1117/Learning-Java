package J131_Polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
//        Vehicle v = new Vehicle();
        Plane p = new Plane();

//        castTest(v);
        castTest(c);
        castTest(p);

        Vehicle vCar = new Car();
//        Car cVehicle = (Car) new Vehicle();

        Object ref = new Car();
//        Object ref = new Vehicle();
    }

    private static void castTest(Vehicle veh) {
//        Car cVehicle = (Car) veh;
//        ((Car) veh).noOfDoors();
//        veh.noOfDoors();
//        cVehicle.start();
//        cVehicle.noOfDoors();

        veh.start();

//        if (veh instanceof Car){
//
//        }
    }
}