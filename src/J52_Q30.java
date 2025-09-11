import java.util.Scanner;

public class J52_Q30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Sum Of Digits");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of Digits is: " + sum);
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
//            sum = sum + (num % 10);
            sum += num % 10;
//            num = num / 10;
            num /= 10;
        }
        return sum;
    }
}