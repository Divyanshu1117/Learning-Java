public class J75_2_Class_Object_Driver {

    static int minAgeForDriving = 18;
    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }

    public static void main(String[] args) {
        J75_1_Class_Object_Car myCar = new J75_1_Class_Object_Car();
//        Wherever I find the word new, I should understand that object creation is happening there.
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(3);
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

        J75_1_Class_Object_Car swift = new J75_1_Class_Object_Car();
//        swift.addFuel(6);
        swift.start().drive();
        System.out.println(swift.color);
//        J75_1_Class_Object_Car startedCar = swift.start();
//        swift.drive();

//        J75_2_Class_Object_Driver myDriver = new J75_2_Class_Object_Driver();
//        myDriver.dateOfLicense = "1/Jan/2024";
//        System.out.println(minAgeForDriving);
//        System.out.println(J75_2_Class_Object_Driver.minAgeForDriving);
    }
}