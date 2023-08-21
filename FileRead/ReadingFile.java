import java.util.Scanner;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class ReadingFile {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\anshu\\OneDrive\\Desktop\\programming\\NewJava\\input.txt";
        int count = countOccurences(filepath, "Java");
        System.out.println("Total occurence of 'Java': " + count);

    }

    private static int countOccurences(String filepath, String targetWord) {
        int count = 0;


        try {
            File file = new File(filepath);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

            scanner.close();
            return count;
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found: "+filepath);

        }
        return count;

    }
}




