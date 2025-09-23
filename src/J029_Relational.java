import java.util.Scanner;

public class J029_Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Driving License Portal: ");
        System.out.println("Please Enter your Age: ");
        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You, are eligible to drive.");
        } else {
            System.out.println("Dear, go for a bicycle ride.");
        }
    }
}