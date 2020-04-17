/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author alesa
 */
import java.util.Set;
import java.util.Map;   
import java.util.HashMap;
import java.util.HashSet;

public class PersonalMultipleEntryDictionary implements MultipleEntryDictionary{
    private Map<String, Set<String>> translations;
    
    public PersonalMultipleEntryDictionary(){
        this.translations = new HashMap<String, Set<String>>();
    }
    
    @Override
    public void add(String word, String entry){
        //word and translation are the parameters
        //when first adding a word, we have to first create an empry set
        if (!this.translations.containsKey(word)){
            this.translations.put(word, new HashSet<String>());
        }
        //now we Get the key, and add the value Entry to hashset
        this.translations.get(word).add(entry);
    }
    
    @Override
    public Set<String> translate(String word){
        if (!this.translations.containsKey(word)){
            return null;
        } else {
            return this.translations.get(word);
        }
    }
    
    @Override
    public void remove(String word){
        this.translations.remove(word);
    }
}
