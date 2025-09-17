public class J77_Q51_Course {
    static int maxCapacity = 100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;

    J77_Q51_Course(String courseName) {
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int capacity) {
        J77_Q51_Course.maxCapacity = capacity;
    }

    void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
            System.out.println(studentName + " enrolled in " + courseName);
        } else {
            System.out.println("Course is full, cannot enroll " + studentName);
        }
    }

    void unenrollStudent(String studentName) {
        boolean found = false;
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                found = true;
                enrolledStudents[i] = enrolledStudents[enrollments - 1];
                enrolledStudents[enrollments - 1] = null;
                enrollments--;
                System.out.println(studentName + " unenrolled from " + courseName);
                break;
            }
        }
        if (!found) {
            System.out.println(studentName + " not found in " + courseName);
        }
    }

    public static void main(String[] args) {
        J77_Q51_Course course = new J77_Q51_Course("Java Programming");

        course.enrollStudent("DV");
        course.enrollStudent("Lovish");
        course.enrollStudent("Ankit");

        course.unenrollStudent("Lovish");

        course.unenrollStudent("Shubham");

        System.out.println("Total enrollments in " + course.courseName + " = " + course.enrollments);
    }
}

//public class J77_Q51_Course {
//    static int maxCapacity = 100;
//    String courseName;
//    int enrollments;
//    String[] enrolledStudents;
//
//    J77_Q51_Course(String courseName) {
//        this.courseName = courseName;
//        this.enrollments = 0;
//        this.enrolledStudents = new String[maxCapacity];
//    }
//
//    static void setMaxCapacity(int maxCapacity) {
//        J77_Q51_Course.maxCapacity = maxCapacity;
//    }
//
//    void enrollStudent(String studentName) {
//        enrolledStudents[enrollments] = studentName;
//        enrollments++;
//    }
//
//    void unenrollStudent(String studentName) {
//        System.out.println("Student removed");
//        enrollments--;
//    }
//}