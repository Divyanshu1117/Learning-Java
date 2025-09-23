import java.util.Scanner;

public class J068_Q44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Array Deletion\n");
        int[] numArr = J064_Part1_ArrayUtility.inputArray();
        System.out.print("Now, enter then number you want to delete: ");
        int numToDelete = input.nextInt();
        int[] newArr = deleteNumber(numArr, numToDelete);
        System.out.println("Here is your new array:");
        J064_Part1_ArrayUtility.displayArray(newArr);
    }

    public static int[] deleteNumber(int[] numArr, int numToDelete) {
        int occ = J065_Q41.noOfOccurrences(numArr, numToDelete);
        if (occ == 0) {
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];
        int i = 0, j = 0;
        while (i < numArr.length) {
            if (numArr[i] != numToDelete) {
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}