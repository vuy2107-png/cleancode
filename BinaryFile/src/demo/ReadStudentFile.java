package demo;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadBinaryFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Downloads\\students.dat")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
