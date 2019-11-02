package pappas_p2;

import java.io.IOException;

public class Application
{
    public static void main(String[] args) throws IOException
    {
        DuplicateCounter use = new DuplicateCounter();
        use.count("problem2.txt");
        use.write("unique_words_counts.txt");
    }
}