package J141_Testing_List;

import java.util.ArrayList;
import java.util.List;

public class Test_List {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
//        List<String> strList = new ArrayList<String>();

        strList.add("Divyanshu");
        strList.add("Lovish");
//        strList.add(54);

        strList.add(1, "Vashishth");
        strList.remove(0);

        if (strList.contains("Vashishth")) {
            System.out.println("Vashishth Exists");
            System.out.println(strList.indexOf("Vashishth"));
        }

        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        for (String str : strList) {
            System.out.println(str);
        }
//        System.out.println(strList.get(0));
    }
}