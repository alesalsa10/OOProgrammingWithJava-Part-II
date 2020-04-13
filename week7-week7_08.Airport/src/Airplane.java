/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alesa
 */
public class Airplane {
    private String id;
    private Integer capacity;
    
    public Airplane(String id, int capacity){
        this.id = id;
        this.capacity = capacity;
    }
    
    public String toString(){
        return id + "(" + capacity + " ppl)";
    }
    
    public String getAirplaneId(){
        return this.id;
    }
}
