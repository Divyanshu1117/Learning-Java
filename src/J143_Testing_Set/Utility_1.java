package J143_Testing_Set;

import java.util.Collection;

public class Utility_1 {
    public static <E> void print(Collection<E> collection) {
        System.out.print("Collection is: ");
        for (E coll : collection) {
            System.out.printf("%s ", coll);
        }
        System.out.println();
    }
}