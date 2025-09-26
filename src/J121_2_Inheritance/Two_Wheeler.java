package J121_2_Inheritance;

import J121_1_Inheritance.Vehicle;

public class Two_Wheeler extends Vehicle {
    public Two_Wheeler() {
        setNumberOfTires(2);
        numberOfTires = 4;
    }

    public void balance() {
        System.out.println("I am balancing on two tires");
    }
}