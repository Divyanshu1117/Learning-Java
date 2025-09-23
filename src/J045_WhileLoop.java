import java.util.Scanner;

public class J045_WhileLoop {
    public static void main(String[] args) {
//        int num = 1; // Initialization
//        while (num <= 10) { // Condition
//            System.out.println(num); // Actual Work
//            num = num + 1; // Updating The Condition
//        }

//        int count = 500;
//        while (count >= 200) {
//            System.out.println(count);
//            count -= 1
//            count = count - 1;
//        }

        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            int inp = input.nextInt();
            System.out.println("Number is: " + inp);
//            i++;
            i = i + 1;
        }
    }
}