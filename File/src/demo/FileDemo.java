package demo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileDemo {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\Admin\\Downloads\\file.txt");
            System.out.println("file co ton tai ko " + f.exists());
            if (!f.exists()) {
                f.createNewFile();
                Writer writer = new FileWriter(f, true);
                writer.write("Hôm nay học đọc ghi file\n");
                writer.close();
            }
            System.out.println(f.getAbsolutePath());
            File dir = new File("data");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
