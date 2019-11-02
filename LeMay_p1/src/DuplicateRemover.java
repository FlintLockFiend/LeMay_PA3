import java.io.*;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Scanner;

public class DuplicateRemover {
    private static String uniqueWords = "";

    public static void remove(Path dataFile)
    {
        try
        {
            HashSet<String> words = new HashSet<String>();
            FileReader input = new FileReader(String.valueOf(dataFile));
            Scanner scnr = new Scanner(input);
            while(scnr.hasNext())
            {
                words.add(scnr.next());
            }
            uniqueWords = words.toString();
            uniqueWords = uniqueWords.replace("[", "");
            uniqueWords = uniqueWords.replace("]", "");
            uniqueWords = uniqueWords.replace(",", "");
        }
        catch(IOException ex)
        {
            System.out.println("Error: file name not found or the file is missing");
            ex.printStackTrace();
        }
    }

    public static void write(Path outputFile) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter(String.valueOf(outputFile), "UTF-8");
        writer.println(uniqueWords);
        writer.close();

    }
}
