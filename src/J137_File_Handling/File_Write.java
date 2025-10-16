package J137_File_Handling;

import java.io.FileWriter;
import java.io.IOException;

public class File_Write {
    public static void main(String[] args) {
        String fileName = "java-course.txt";
//        FileWriter writer = null;
        try (FileWriter writer = new FileWriter(fileName)) {
//            writer = new FileWriter(fileName);
            writer.write("This is the best Java Course.\n");
            for (int i = 0; i < 10000; i++) {
                writer.write('*');
            }
            writer.flush();
            System.out.println("File Written Successfully");
        } catch (IOException exception) {
            System.out.printf("Exception occurred %s \n", exception.getMessage());
        }
//        finally {
//            if (writer != null) {
//                writer.close();
//            }
//        }
    }
}