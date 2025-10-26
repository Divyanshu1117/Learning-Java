package J153_Enums;

public class Testing_Enum {
    public static void main(String[] args) {
        Traffic_Light color = Traffic_Light.RED;
        color = Traffic_Light.GREEN;
        Grade grade = Grade.valueOf("D");
        for (Grade value : Grade.values()) {
            System.out.println(value);
        }
    }
}