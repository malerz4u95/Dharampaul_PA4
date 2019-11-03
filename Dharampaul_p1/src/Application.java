import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException{
        DuplicateRemover dr = new DuplicateRemover();

        dr.remove("Dharampaul_p1/src/problem1.txt");
        dr.write("unique_words.txt");

    }
}