import java.util.Scanner;

public class J049_Q28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Multiplication World\n");
        System.out.print("Please Enter Your Number: ");
        int num = input.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num) {
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }
}