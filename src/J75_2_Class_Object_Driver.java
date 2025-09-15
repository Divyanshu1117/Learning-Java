public class J75_2_Class_Object_Driver {

    public static void main(String[] args) {
        J75_1_Class_Object_Car myCar = new J75_1_Class_Object_Car();
//        Wherever I find the word new, I should understand that object creation is happening there.”
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        myCar.drive();
        myCar.addFuel(3);
        myCar.drive();
        System.out.println(myCar.getCurrentFuelLevel());
    }
}