package J184_Q114;

import java.util.List;

public class Testing_Sorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("Divyanshu", 100),
                new Employee("Shubham", 120),
                new Employee("Ram", 120),
                new Employee("Sham", 170),
                new Employee("Mohan", 150));

        employees.stream()
//                .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .sorted((emp1, emp2) -> emp1.getSalary() - emp2.getSalary())
                .forEach(System.out::println);
    }
}