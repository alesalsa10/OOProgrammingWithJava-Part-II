/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author alesa
 */
import java.util.Set;
import java.util.HashSet;

public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> words;
    private int repeatedNumber;
    
    public PersonalDuplicateRemover(){
        this.words = new HashSet<String>();
        this.repeatedNumber = 0;
    }
    
    public void add(String characterString){
        //since it is a set it will not add duplicates
        if (words.contains(characterString)){
            repeatedNumber ++;
        }
        words.add(characterString);
    }
    
    public int getNumberOfDetectedDuplicates(){
        return repeatedNumber;
       
    }
    
    public Set<String> getUniqueCharacterStrings(){
        return this.words;
    }
    
    public void empty(){
        this.words.clear();
        repeatedNumber = 0;
    }
    
}
