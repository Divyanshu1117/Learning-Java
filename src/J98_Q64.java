import java.util.Scanner;

public class J98_Q64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to finding occurrences");
        int[] nums = J64_Part1_ArrayUtility.inputArray();
        System.out.print("Now, enter the number you want to search: ");
        int element = input.nextInt();
        int occ = countOccurrences(nums, element);
        System.out.println("Your element was not found: " + occ + " times. ");
    }

    public static int countOccurrences(int[] nums, int element) {
        int occ = 0;
        for (int num : nums) {
            if (num == element) {
                occ++;
            }
        }
        return occ;
    }
}