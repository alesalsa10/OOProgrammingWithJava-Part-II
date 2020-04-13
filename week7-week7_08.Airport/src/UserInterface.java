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
    private Scanner reader;
    private Airport airport;
    
    public UserInterface(Scanner scanner, Airport airport){
        this.reader = scanner;
        this.airport = new Airport();
    }
    
    public void start(){
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        
        while (true){
            System.out.println("Choose operation: ");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            
            String chosenOp = reader.nextLine();
            
            if (chosenOp.equals("1")){
                System.out.println("Give plane ID: ");
                String planeId = reader.nextLine();
                
                System.out.println("Give plane capacity: ");
                int capacity = Integer.valueOf(reader.nextLine());
                
                airport.addAirplane(planeId, capacity);
            } else if (chosenOp.equals("2")){
                System.out.println("Give plane ID: ");
                String planeID = reader.nextLine();
                
                System.out.println("Give departure airport code: ");
                String depart = reader.nextLine();
                
                System.out.println("Give destination airport code: ");
                String dest = reader.nextLine();
                
                airport.addFlight(depart, dest, planeID);
            } else {
                break;
            }
        }
        System.out.println("Flight service: ");
        System.out.println("------------");
        System.out.println("");
        
        while (true){
            System.out.println("Choose operation: ");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[4] Print all flights for a plane: ");
            System.out.println("[x] Quit");
            
            String choice = reader.nextLine();
            
            if (choice.equals("1")){
                airport.printAirplanes();
            } else if (choice.equals("2")){
                airport.printFlights();
            } else if (choice.equals("3")){
                System.out.println("Give plane ID: ");
                String planeId = reader.nextLine();
                
                airport.printOnePlane(planeId);
            } else if (choice.equals("4")){
                System.out.println("Give the plane ID");
                String plane = reader.nextLine();
                
                airport.printFlightsPerPlane(plane);
            } else {
                break;
            }
        }
    }
}
