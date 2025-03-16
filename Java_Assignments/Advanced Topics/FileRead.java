//File I/O Operation: Reading Data from a Text File

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt"); // File path
            Scanner input = new Scanner(file);

            System.out.println("File Contents:");
            while (input.hasNextLine()) {
                String data = input.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
