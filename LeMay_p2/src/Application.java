import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
Create an instance method called count that takes a single parameter called dataFile
(representing the path to a text file) and uses a Map of Strings to count how many times each word occurs in dataFile.
The counts should be stored in an instance variable called wordCounter.
Create an instance method called write that takes a single parameter called outputFile
(representing the path to a text file) and writes the contents of wordCounter to the file pointed to by outputFile.
 */
public class Application {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Path dataFile = Paths.get("problem2.txt");
        Path outputFile = Paths.get("unique_word_count.txt");

        DuplicateCounter.count(dataFile);
        DuplicateCounter.write(outputFile);
    }
}
