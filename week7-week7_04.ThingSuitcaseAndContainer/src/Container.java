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

public class Container {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Container(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }
    
    public void addSuitcase (Suitcase suitcase){
        if (this.maxWeight - totalWeight() >= suitcase.totalWeight()){
            //if maxweight - weight of all suitcases combined is more than
            //weight of suitcase to be added then it is added
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString(){
        return this.suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }
    
    public int totalWeight(){
        int weight = 0;
        
        for (Suitcase suitcase: this.suitcases){
            weight += suitcase.totalWeight();
        }
        return weight;
    }
    public void printThings(){
        for (Suitcase suitcase: this.suitcases){
            suitcase.printThings();
        }
    }
}
