/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

/**
 *
 * @author alesa
 */
import java.io.File;
import java.util.Scanner;

public class Analysis {
    private File file;
    
    public Analysis(File file) throws Exception{
        this.file = file;
    }
    
    public int lines() throws Exception{
        Scanner reader = new Scanner(file);
        int numberOfLines = 0;
        while (reader.hasNextLine()){
            numberOfLines += 1;
            reader.nextLine();
        }
        return numberOfLines;
    }
    
    public int characters()throws Exception{
        Scanner scanner = new Scanner(file);
        String allText = "";
        
        while (scanner.hasNextLine()){
            allText += scanner.nextLine();
            allText += "\n";
        }
        return allText.length();
    }
}
