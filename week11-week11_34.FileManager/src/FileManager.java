
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {

    public List<String> read(String file) throws FileNotFoundException {
        //retuns the lines of the parameter file in an arraylist
        //each file line being a string contained by the arraylist
        List<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(new File(file));
        
        while(reader.hasNextLine()){
            words.add(reader.nextLine());
        }
        reader.close();
        return words;
        
    }

    public void save(String file, String text) throws IOException {
        //write second argument into file of the first
        FileWriter writer = new FileWriter(file);
        writer.write(text);
        writer.close();
    }

    public void save(String file, List<String> texts) throws IOException {
        //write the string of second argumanet into the file of the first
        FileWriter writer = new FileWriter(file);
        
        for (String i: texts){
            writer.write(i + "\n");
        }
        writer.close();
    }
}
