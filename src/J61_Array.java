public class J61_Array {
    public static void main(String[] args) {
//        int[] myArr = new int[5];
//        myArr[0] = 98;
//        myArr[1] = 65;
//        myArr[2] = 43;
//        myArr[3] = 65;
//        myArr[4] = 34;
        int[] myArr = {98, 65, 43, 65, 34};
//        int index = 2;
//        System.out.println(myArr[0]);
//        System.out.println(myArr[1]);
//        System.out.println(myArr[index]);
//        System.out.println(myArr[3]);
//        System.out.println(myArr[4]);
//        System.out.println(myArr[5]); // Show Error:- ArrayIndexOutOfBoundsException

//        Array Traversal
        int index = 0;
//        while (index < 5) {
        while (index < myArr.length) {
            System.out.println(myArr[index]);
            index++;
        }
        String[] strArr = new String[4];
        strArr[0] = "My String";
        String[] newStrArr = {"first", "second", "third"};
        System.out.println(newStrArr.length);
    }
}