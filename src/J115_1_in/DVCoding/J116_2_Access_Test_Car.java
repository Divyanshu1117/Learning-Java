package J115_1_in.DVCoding;

public class J116_2_Access_Test_Car {
    public static void main(String[] args) {
        J116_1_Car_Public car = new J116_1_Car_Public();
        car.color = "Red";
        car.model = "Swift";
        System.out.println(car);
        car.costOfPurchase = 100000;
        J116_1_Car_Public newCar = new J116_1_Car_Public("Black", "Maruti", 1, 70000);
        System.out.println(newCar);
        J117_Default def = new J117_Default();
    }
}