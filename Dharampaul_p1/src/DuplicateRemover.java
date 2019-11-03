import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class DuplicateRemover {
    //create instance variable uniqueWords use Sets so in cannot contain duplicates
    private Set<String> uniqueWords;

    //instance method remove
    public void remove(String dataFile) throws FileNotFoundException {

        uniqueWords = new HashSet<>();//creates hashtable for storage of words
        Scanner in = new Scanner(new File(dataFile));//scan  in files

        String temp;//string to hold word
        //for loop to remove duplicates
        while (in.hasNext()) {
            temp = in.next();
            uniqueWords.add(temp);
        }
        in.close();
    }

    //instance method write
    public void write(String outputFile) throws IOException {
        File file;
        FileWriter fileWriter = null;

        file = new File(outputFile);
        if (file.exists()) { //writes to existing file
            fileWriter = new FileWriter(file, false);
            Iterator itr = uniqueWords.iterator();

            while (itr.hasNext()) {
                String str = (String) itr.next();
                fileWriter.write(str + "\n");
            }
            fileWriter.close();
            System.out.println("Open unique_words.txt to find all the words without duplicates.");
        }
        else { //creates new file if their is no file
            fileWriter = new FileWriter(file);
            Iterator itr = uniqueWords.iterator();//use to traverse words one by one. The uniqueWords make sure it has no doubles.

            while (itr.hasNext()) {//This writes it to file
                String str = (String) itr.next();
                fileWriter.write(str + "\n");
            }
            fileWriter.close();
            System.out.println("Open unique_words.txt to find all the words without duplicates.");
        }


    }
}


