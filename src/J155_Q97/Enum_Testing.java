package J155_Q97;

public class Enum_Testing {
    public static void main(String[] args) {
        System.out.println("Printing all the days of the week");
        for (Day day : Day.values()) {
            System.out.printf("%s : %s\n", day, day.getType());
        }
    }
}