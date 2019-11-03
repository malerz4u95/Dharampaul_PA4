
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.HashMap;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Map;

public class DuplicateCounter {
   // instance variable using map for wordCounter
    Map<String, Integer> wordCounter = new HashMap<String, Integer> ();
        //instance method for count using dataFile
        public void count(String dataFile) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(dataFile));//Read Data from datafile
            //place to string
            String one = bufferedReader.readLine();

            // while loop to count words
            while(one != null)
            {
                String temp[] = one.split(" ");
                for(String s:temp)
                {
                    if (!wordCounter.containsKey(s))
                    {
                        wordCounter.put(s, 1);
                    }
                    else
                    {
                        int count = wordCounter.get(s);
                        wordCounter.put(s, count + 1);
                    }
                }
                one = bufferedReader.readLine();
            }
        }
        //instance method for write
        public void write(String outputFile) throws FileNotFoundException {
            PrintWriter printWriter = new PrintWriter(outputFile);
            for (Map.Entry<String, Integer> entry : wordCounter.entrySet()) {
                printWriter.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }