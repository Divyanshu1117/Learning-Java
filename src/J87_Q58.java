import java.util.Scanner;

public class J87_Q58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Calculator\n");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Now, enter the operation: ");
        String operation = input.next();

        int result = switch (operation) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> -1;
        };
        System.out.println("Your answer is: " + result);
    }
}