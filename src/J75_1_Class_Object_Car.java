public class J75_1_Class_Object_Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeat;

    static {
        noOfCarsSold = 0;
        System.out.println("I am in Static Block");
    }

    {
        noOfCarsSold++;
        System.out.println("I am in Init Block");
    }

    J75_1_Class_Object_Car() {
        this("Black");
        currentFuelInLiters = 5;
//        noOfWheels = 4;
//        this.color = "Black";
//        maxSpeed = 150;
//        currentFuelInLiters = 2;
//        noOfSeat = 5;
    }

    J75_1_Class_Object_Car(String color) {
        noOfWheels = 4;
        this.color = color;
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

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("I am in Finalize");
//    }
}