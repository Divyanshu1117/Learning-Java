package J144_Testing_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Testing_Collection {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(2);
        numList.add(8);
        numList.add(-76);

        Utility_2.print(numList);
        Collections.sort(numList);
        Utility_2.print(numList);

        Collections.reverse(numList);
        Utility_2.print(numList);

        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
        unmodifiable.add(87);
    }
}