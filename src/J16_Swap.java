import java.util.Scanner;
public class J16_Swap {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Swapping station:");
        System.out.print("Enter value of A: ");
        int a = input.nextInt();
        System.out.print("Enter value of B: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("Swapping done...");
        System.out.println("Value of A is: " + a);
        System.out.println("Value of A is: " + b);
    }
}