package demo;

import java.io.*;
import java.util.ArrayList;

public class WriteStudentFile {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(25, "Huy"));
        list.add(new Student(25, "Duy"));
        list.add(new Student(30, "WanBi"));

        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:/Module2/BinaryFile/src/demo/students.dat"))) {
            oos.writeObject(list);
            System.out.println("✅ Ghi file thành công!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
