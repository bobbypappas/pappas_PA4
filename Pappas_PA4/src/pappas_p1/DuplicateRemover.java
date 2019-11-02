package pappas_p1;

import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.FileWriter;

public class DuplicateRemover
{

    private Set <String> uniqueWords;

    public void remove (String dataFile) throws FileNotFoundException
    {

        FileInputStream newFile = null;
        newFile = new FileInputStream(dataFile);
        uniqueWords = new HashSet<>();
        Scanner scnr = new Scanner(newFile);

        while (scnr.hasNextLine())
        {
            String words = scnr.next();
            uniqueWords.add(words);
        }
        scnr.close();
    }

    public void write (String outputFile) throws IOException
    {
        String dataToWrite;
        File file = new File(outputFile);
        FileWriter writer = null;
        writer = new FileWriter(file);
        Iterator iterator = uniqueWords.iterator();
        if (!file.exists())
            file.createNewFile();

        while (iterator.hasNext())
        {
            dataToWrite = (String) iterator.next();
            writer.write(dataToWrite + "\n");
        }
        writer.close();
        //System.out.println("")
    }
}

