public class J089_For_Each_Loop {
    public static void main(String[] args) {
        String[] names = new String[]{"Ram", "Shyam", "Mohan", "Sohan", "Sita", "Geeta"};
//        printArray(names);
        printArrayForEach(names);
    }

    //    public static void printArray(String[] names) {
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//    }
    static void printArrayForEach(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }
}