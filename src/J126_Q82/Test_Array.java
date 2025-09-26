package J126_Q82;

public class Test_Array {
    public static void main(String[] args) {
        Array_Operations.Statistics statistics = new Array_Operations.Statistics(new int[]{1, 3, 5, 9});
        System.out.println(statistics.mean());   // 4.5
        System.out.println(statistics.median()); // 4.0
    }
}