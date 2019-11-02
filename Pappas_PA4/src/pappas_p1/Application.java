package pappas_p1;

import java.io.IOException;

public class Application
{
    public static void main(String[] args) throws IOException
    {
        DuplicateRemover use = new DuplicateRemover();
        use.remove("problem1.txt");
        use.write("unique_words.txt");
    }
}