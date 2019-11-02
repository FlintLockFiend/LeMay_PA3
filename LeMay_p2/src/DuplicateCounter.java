import java.io.*;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter {
    public static HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();

    public static void count(Path dataFile) throws FileNotFoundException
    {
        try
        {
            String temp;
            FileReader input = new FileReader(String.valueOf(dataFile));
            Scanner scnr = new Scanner(input);

            while (scnr.hasNext())
            {
                temp = scnr.next();
                if(wordCounter.containsKey(temp))
                {

                    wordCounter.put(temp, wordCounter.get(temp) + 1);
                }
                else
                {
                    wordCounter.putIfAbsent(temp, 1);
                }
            }
        }
        catch(IOException ex)
        {
            System.out.println("Error: file name not found or the file is missing");
            ex.printStackTrace();
        }
    }
    public static void write(Path outputFile) throws FileNotFoundException, UnsupportedEncodingException
    {
        PrintWriter writer = new PrintWriter(String.valueOf(outputFile), "UTF-8");
        writer.println(wordCounter);
        writer.close();
    }
}
