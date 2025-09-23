import java.util.Scanner;

public class J013_Q5 {
    public static void main(String[] args) {
        System.out.print("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to DV Coding");
    }
}