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

public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.maxWeight = maxWeight;
        this.things = new ArrayList<Thing>();
    }
    
    public void addThing(Thing thing){
        if (this.maxWeight - totalWeight() >= thing.getWeight()){
            this.things.add(thing);
        }
    }
    
    public String toString(){
     if (this.things.size() == 0){
         return  "empty (0 kg)";
     }else if (this.things.size() == 1){
         return this.things.size() + " thing " + "(" + totalWeight() + " kg)";
     }else{
         return this.things.size() + " things " + "(" + totalWeight() + " kg)";
     }
    }
    
    public int totalWeight(){
        int weight = 0;
        for (Thing thing: this.things){
            weight += thing.getWeight();
        }
        return weight;
    }
    
    public void printThings(){
        for (Thing thing: this.things){
            System.out.println(thing);
        }
    }
    
    public Thing heaviestThing(){
        int heaviestWeight = 0;
        Thing heaviest = new Thing("", 0);
        
        if (this.things.isEmpty()){
            return null;
        }
        for(Thing thing: this.things){
            if (thing.getWeight()> heaviestWeight){
                heaviestWeight = thing.getWeight();
                heaviest = thing;
            }
        }
        return heaviest;
    }
}
