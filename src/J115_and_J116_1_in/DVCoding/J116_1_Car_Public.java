package J115_and_J116_1_in.DVCoding;

public class J116_1_Car_Public {
    public String color;
    public String model;
    private double fuelLevel;
    long costOfPurchase;
//    private long costOfPurchase;

    public J116_1_Car_Public() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("J115_1_in.DVCoding.J116_1_Car_Public{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", costOfPurchase=").append(costOfPurchase);
        sb.append('}');
        return sb.toString();
    }

    public J116_1_Car_Public(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }
}