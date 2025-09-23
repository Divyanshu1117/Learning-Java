import java.util.Scanner;

public class J053_Q32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to LCM");
        System.out.print("Please Enter Your Number: ");
        int first = input.nextInt();
        System.out.print("Please enter your number: ");
        int second = input.nextInt();
        int lcm = lcm(first, second);
        System.out.println("LCM of the two numbers is: " + lcm);
    }

    public static int lcm(int first, int second) {
        int i = 1;
        while (true) {
            int factor = first * i;
            if (factor % second == 0) {
                return factor;
            }
            i++;
        }
    }
}