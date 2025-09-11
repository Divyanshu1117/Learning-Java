import java.util.Scanner;

public class J51_Q29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Factorial");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial is:" + fact);
    }

    public static long factorial(int num) {
        if (num < 2) {
            return 1;
        }
        long fact = 1;
        int i = 2;
        while (i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }
}