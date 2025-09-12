import java.util.Scanner;

public class J57_Q35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonacci Series");
        System.out.print("Please enter the number up to which series has to be printed: ");
        int num = input.nextInt();
        System.out.println("Here is the Fibonacci Series:");
        printFibonacci(num);
    }

    public static void printFibonacci(int num1) {
        if (num1 < 0) return;
        System.out.print("0 ");
        if (num1 == 0) return;
        System.out.println("1 ");

        int first = 0, second = 1;
        while (first + second <= num1) {
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }
    }
}