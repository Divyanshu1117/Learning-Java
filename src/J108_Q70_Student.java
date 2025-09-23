public class J108_Q70_Student {
    String name;
    int age;
    String rollNumber;
    String house;

    public J108_Q70_Student(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details:{name:" + name + ", age:" + age + ", roll Number:" + rollNumber + ", House:" + house + " }";
    }

    public static void main(String[] args) {
        J108_Q70_Student stu = new J108_Q70_Student("Divyanshu", 15, "8", "Orange");
        System.out.println(stu);
    }
}