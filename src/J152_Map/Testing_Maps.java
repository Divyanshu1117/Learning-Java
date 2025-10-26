package J152_Map;

import java.util.HashMap;
import java.util.Map;

public class Testing_Maps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Divyanshu", 34);
        map.put("Lovish", 100);
        map.put("Ram", 100);
        map.put("Sohan", 0);
        System.out.println(map.size());
        System.out.println(map.get("Divyanshu"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("Geeta"));
        System.out.println(map.remove("Sohan"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));
        }
    }
}