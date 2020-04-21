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

public class UserInterface {
    private Scanner reader = new Scanner(System.in); 
    private Rating rating = new Rating();
    
    public UserInterface(){
    }
    
    public void start(){
        int counter = 0;
        
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

        while(true){
            System.out.println("Participant name: ");
            String name = reader.nextLine();
            
            if(name.equals("")){
                break;
            }
            rating.addJumper(name, 0);
        }
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        
        while (true){
            System.out.println("");
            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            String input = reader.nextLine();
            
            if (input.equals("jump")){
                System.out.println("Round " + counter++);
                System.out.println("Jumping order: ");
                rating.printAllJumpers();
                
                System.out.println("Results of round: " + counter);
                rating.setPoints();
                rating.printRoundResults();
            } else  {
                System.out.println("Thanks");
                break;
            }
        }
        rating.printFinalResults()
    }
}
