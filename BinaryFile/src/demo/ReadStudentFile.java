package demo;

import java.io.*;
import java.util.ArrayList;

public class ReadStudentFile {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("D:/Module2/BinaryFile/src/demo/students.dat"))) {

            ArrayList<Student> students = (ArrayList<Student>) ois.readObject();
            for (Student s : students) {
                System.out.println(s);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
