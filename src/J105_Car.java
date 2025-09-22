public class J105_Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String Company;

    public J105_Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        Company = company;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("J105_Car{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", Company='").append(Company).append('\'');
        sb.append('}');
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        return "J105_Car{" +
//                "noOfWheels=" + noOfWheels +
//                ", noOfDoors=" + noOfDoors +
//                ", maxSpeed=" + maxSpeed +
//                ", name='" + name + '\'' +
//                ", modelNumber='" + modelNumber + '\'' +
//                ", Company='" + Company + '\'' +
//                '}';
//    }
//    @Override
//    public String toString() {
//        return "My Car name is: " + name;
//    }

    public static void main(String[] args) {
        J105_Car swift = new J105_Car(4, 4, 120, "Swift", "SW896", "Maruti");
        System.out.println(swift);
    }
}