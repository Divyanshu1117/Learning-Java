package J121_1_Inheritance;

import J121_2_Inheritance.Two_Wheeler;

public class Inheritance_Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.commute();
        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

        Two_Wheeler two = new Two_Wheeler();
        two.commute();
        two.balance();

        Motor_Cycle motor = new Motor_Cycle();
        motor.commute();
        motor.balance();
        motor.start();
    }
}