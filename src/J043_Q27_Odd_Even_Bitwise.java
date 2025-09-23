import java.util.Scanner;

public class J043_Q27_Odd_Even_Bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd/Even Calculator");
        System.out.println("Please enter your number: ");
        int num = input.nextInt();

        if ((num & 1) == 1) {
            System.out.println("Your number is odd");
        } else {
            System.out.println("Your number is even");
        }
    }
}