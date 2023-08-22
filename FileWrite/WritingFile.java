import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
public class WritingFile {
    public static void main(String args[]) {
        Scanner object = new Scanner(System.in);
        String filepath = "output.txt";
        System.out.println("Enter Sentence you want to write");
        String text = object.nextLine();

        try (FileWriter writer = new FileWriter(filepath)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

