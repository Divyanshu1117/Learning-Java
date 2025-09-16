public class J75_1_Class_Object_Car {
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeat;

    J75_1_Class_Object_Car() {
        noOfWheels = 4;
        color = "Black";
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeat = 5;
    }

    public J75_1_Class_Object_Car start() {
        if (currentFuelInLiters == 0) {
            System.out.println("Car is out of fuel, can not start");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refuel");
        } else {
            System.out.println("Car is driving...bruhhh...");
        }
        return this;
    }

    public void drive() {
        currentFuelInLiters--;
        System.out.println("Car is driving");
    }

//    public void addFuel(float fuel) {
//        currentFuelInLiters += fuel;
//    }

    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }
}