import java.util.Scanner;

public class J31_Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Number Checker \n");
        System.out.println("Please Enter Your Number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("Your Number is positive: ");
        } else if (num == 0) {
            System.out.println("Your number is zero ");
        } else {
            System.out.println("Your number is negative");
        }
    }
}