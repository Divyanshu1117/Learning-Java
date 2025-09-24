package J117_Getter_Setter;

public class J117_1_Car {
    private String color; // public
    private String model; // public
    private double fuelLevel;
    private long costOfPurchase; //

    public J117_1_Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.equals("Yellow")) {
            System.out.println("Are you crazy? Don’t use yellow color in the car.");
        } else {
            this.color = color;
        }
    }

    public String getModel() {
        return model;
    }
}