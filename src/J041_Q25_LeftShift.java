import java.util.Scanner;

public class J041_Q25_LeftShift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to showcase of Left Shift Operator");
        System.out.print("Please enter your number: ");
        int num = input.nextInt();

        int result = num << 1;
        System.out.println("Your result is: " + result);
    }
}