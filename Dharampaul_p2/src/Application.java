import java.io.IOException;
import java.io.FileNotFoundException;

public class Application {
    public static void main(String[] args) throws IOException {
        DuplicateCounter dc = new DuplicateCounter();
        dc.count("problem2.txt");// in IntellJ had to use Dharampaul_p2\src\problem2.txt changed it to problem2.txt to keep it compatible with your programs.
        dc.write("unique_word_counts.txt");
        System.out.println("Open unique_word_counts.text to see counts of words");
    }
}