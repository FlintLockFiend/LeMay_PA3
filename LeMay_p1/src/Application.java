/*
Create a utility class called DuplicateRemover.
Create an instance method called remove that takes a single parameter called dataFile (representing the path to a text file)
and uses a Set of Strings to eliminate duplicate words from dataFile. The unique words should be stored in an instance variable
called uniqueWords. Create an instance method called write that takes a single parameter called outputFile
(representing the path to a text file) and writes the words contained in uniqueWords to the file pointed to by outputFile.
The output file should be overwritten if it already exists, and created if it does not exist.

Create a separate class called Application that contains a main method which illustrates the use of DuplicateRemover by
calling both the remove and write methods.
 */

//read from problem1.txt
//write to unique_words.txt

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Application {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Path dataFile = Paths.get("problem1.txt");
        Path outputFile = Paths.get("unique_words.txt");

        DuplicateRemover.remove(dataFile);
        DuplicateRemover.write(outputFile);

    }
}
