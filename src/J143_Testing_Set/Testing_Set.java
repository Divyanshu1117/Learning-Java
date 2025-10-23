package J143_Testing_Set;

import java.util.HashSet;
import java.util.Set;

public class Testing_Set {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Divyanshu"));
        System.out.println(names.add("Lovish"));
        System.out.println(names.add("Lakshay"));
        Utility_1.print(names);

        System.out.println(names.add("Divyanshu"));
        System.out.println(names.size());
        Utility_1.print(names);

        System.out.println(names.contains("Divyanshu"));
        System.out.println(names.remove("Divyanshu"));
        Utility_1.print(names);
        System.out.println(names.remove("Divyanshu"));
    }
}