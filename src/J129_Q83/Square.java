package J129_Q83;

public class Square extends Shape {
    private final double sideInCms;

    public Square(double sideInCms) {
        this.sideInCms = sideInCms;
    }

    public double getSideInCms() {
        return sideInCms;
    }

    @Override
    public double calculateArea() {
//        return (sideInCms * sideInCms);
        return Math.pow(sideInCms, 2);
    }
}