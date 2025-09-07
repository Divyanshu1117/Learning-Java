import java.util.Scanner;

public class J32_Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd Even Calculator");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("Your Number is an even number");
        } else {
            System.out.println("Your number is a odd number");
        }
    }
}