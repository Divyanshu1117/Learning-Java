import java.util.Scanner;

public class J84_Q55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping station:\n");
        System.out.print("Enter value of a: ");
        int a = input.nextInt();
        System.out.print("Enter value of b: ");
        int b = input.nextInt();
        int temp;
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        temp = (true) ? a : b;   // temp = a
        a = (true) ? b : a;      // a = b
        b = (true) ? temp : b;   // b = temp
        System.out.println("After Swap: a = " + a + ", b = " + b);
        input.close();
    }
}