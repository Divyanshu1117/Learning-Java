package J115_and_J116_2_in.DivyanshuCoding;

import J117_Getter_Setter.J117_1_Car;

public class J117_2_Getter_Test {
    public static void main(String[] args) {
        J117_1_Car car = new J117_1_Car("Red", "Maruti", 3, 60000);
        car.setColor("Blue");
        System.out.printf("%s %s", car.getColor(), car.getModel());
    }
}