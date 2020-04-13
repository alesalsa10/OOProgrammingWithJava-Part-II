/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alesa
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class Airport {
    ArrayList<Airplane> airplanes;
    ArrayList<Flight> flights;
    Map<Airplane, ArrayList<Flight>> airport;
    
    
    public Airport(){
        this.airplanes = new ArrayList<Airplane>();
        this.airport = new HashMap<Airplane, ArrayList<Flight>>();
        this.flights = new ArrayList<Flight>();
    }
    
    public void addAirplane(String id, int capacity){
        airplanes.add(new Airplane (id, capacity));
    }
    
    public void printAirplanes(){
        for (Airplane airplane: airplanes){
            System.out.println(airplane);
        }
    }
    
    public void printOnePlane(String id){
        for (Airplane airplane: airplanes){
            if (airplane.getAirplaneId().equals(id)){
                System.out.println(airplane);
            }
        }
    }
    
    public void addFlight(String depart, String dest, String airplaneId){
        for (Airplane airplane: airplanes){
            if (airplane.getAirplaneId().equals(airplaneId)){
                flights.add(new Flight (airplane, dest, depart));
                airport.put(airplane, flights);
            }
        }
    }
    
    public void printFlights(){
        for (Flight flight: flights){
            System.out.println(flight);
        }
    }
    
    public void printFlightsPerPlane(String airplaneId){
        for (Map.Entry<Airplane, ArrayList<Flight>> entry: airport.entrySet()){
            
            Airplane key = entry.getKey();
            List<Airplane> keys = new ArrayList<Airplane>();
            if (key.getAirplaneId().equals(airplaneId)){
                keys.add(key);
            }
            
            ArrayList<Flight> flightInfo = entry.getValue();     
            
            for (Airplane airplane: keys){  //needed so it only runs once
                for (Flight flight: flightInfo){
                    if (flight.toString().contains(airplaneId)){
                        System.out.println(flight.departDest());
                    }
                }
            }
        }
    }
}

