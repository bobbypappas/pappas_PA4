package pappas_p2;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCounter {

    private Map <String, Integer> wordCounter = new HashMap<>();

    public void count(String dataFile) throws IOException
    {
        FileInputStream newFile;
        newFile = new FileInputStream(dataFile);
        Scanner scnr = new Scanner(newFile);

        while (scnr.hasNextLine()) {
            String words = scnr.next();
            if (!wordCounter.containsKey(words)) {
                wordCounter.put(words, 1);
            } else {
                int counter = wordCounter.get(words);
                wordCounter.put(words, counter + 1);
            }
        }
        newFile.close();
        scnr.close();
        //System.out.println(wordCounter);
    }

    public void write (String outputFile) throws IOException
    {
        FileWriter writer = new FileWriter(outputFile);
        for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
            writer.write(entry.getKey()+": " + entry.getValue() + "\n");
        }
        writer.close();
    }
}