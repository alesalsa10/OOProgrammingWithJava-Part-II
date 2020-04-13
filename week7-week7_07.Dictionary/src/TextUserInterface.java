/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alesa
 */
import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;
    
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        this.reader = reader;
        this.dictionary = dictionary;
    }
    
    public void start(){
        System.out.println("Statements: ");
        System.out.println("\t add - adds a word pair to the dictionary");
        System.out.println("\t translate - asks a word and prints its translation");
        System.out.println("\t  quit - quits the text user interface ");
        
        while (true){
            System.out.println("Statement: ");
            String answer = reader.nextLine();
            
            if (answer.equals("quit")){
                System.out.println("Cheers!");
                break;
            } else if (answer.equals("add")){
                System.out.println("In Finnish: ");
                String finish = reader.nextLine();
                
                System.out.println("Translation: ");
                String english = reader.nextLine();
                
                this.dictionary.add(finish, english);
            }else{
                System.out.println("Give a word: ");
                String toBeTranslated = reader.nextLine();
                
                String translation = this.dictionary.translate(toBeTranslated);
                System.out.println("Translation: " + translation);
            }
        }
    }
}
