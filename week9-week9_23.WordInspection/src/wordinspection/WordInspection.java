/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordinspection;

/**
 *
 * @author alesa
 */
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuffer;
import java.util.Arrays;

public class WordInspection {
    private File file;
    
    public WordInspection(File file){
        this.file = file;
    }
    
    public int wordCount() throws FileNotFoundException{
        //only 1 word per line
        Scanner r = new Scanner(file);
        int wordNumber = 0;
        while (r.hasNextLine()){
            wordNumber ++;
            r.nextLine();
        }
        return wordNumber;
    }
    
    public List<String> wordsContainingZ()throws FileNotFoundException{
        Scanner r = new Scanner(file);
        List<String> zWords = new ArrayList<String>();
        while (r.hasNextLine()){
            String line = r.nextLine();
            if (line.contains("z")){
                zWords.add(line);
            }
        }
        return zWords;
    }
    
    public List<String> wordsEndingInL() throws FileNotFoundException{
        Scanner r = new Scanner(file);
        List<String> lWords = new ArrayList<String>();
        while (r.hasNextLine()){
            String line = r.nextLine();
            if (line.endsWith("l")){
                lWords.add(line);
            }
        }
        return lWords;
    }
    
    public List<String> palindromes()throws FileNotFoundException{
        Scanner r = new Scanner(file);
        List<String> palindromes = new ArrayList<String>();
        while (r.hasNextLine()){
            String line = r.nextLine();
            StringBuffer s = new StringBuffer(line).reverse();
            String reverse = s.toString();
            
            if (line.equals(reverse)){
                palindromes.add(line);
            }
        }
        return palindromes;
    }
    
    public List<String> wordsWhichContainAllVowels() throws FileNotFoundException{
        Scanner r = new Scanner(file);
        List<String> allVowels = new ArrayList<String>();
        String[] vowels = {"a","e","i","o","u"};
        
        while(r.hasNextLine()){
            String line = r.nextLine();
            if (line.contains("a") & line.contains("e") & line.contains("i") &line.contains("o") & line.contains("u")
                    & line.contains("y") & line.contains("ä") & line.contains("ö")){
                allVowels.add(line);
            }
        }
        return allVowels;
    }
}
