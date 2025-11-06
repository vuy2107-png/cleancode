package dome;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Admin\\Downloads\\IOtextfile.txt";
        File file = new File(fileName);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
