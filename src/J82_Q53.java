import java.util.Scanner;

public class J82_Q53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Odd or Even\n");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();
        String result = num % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your number is: " + result);
    }
}