package J173_Functional_Programming.filterandreduce;

import java.util.List;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Orange", "Pear", "Strawberry");
        System.out.println(fruits.size());
        System.out.println("\nPrinting Fruits Normally:-");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

//        System.out.println("\nPrinting Fruits using streams:-");
//        fruits.stream().forEach(new Consumer<String>() {
//
//            @Override
//            public void accept(String fruit) {
//                System.out.println(fruit);
//            }
//        });

        System.out.println("\nPrinting Fruits using filter:-");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e"))
                .forEach(fruit -> System.out.println(fruit));
    }
}