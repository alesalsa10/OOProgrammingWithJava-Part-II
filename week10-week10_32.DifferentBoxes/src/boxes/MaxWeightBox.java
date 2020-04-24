/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author alesa
 */
import java.util.List;
import java.util.ArrayList;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private List<Thing> things = new ArrayList<Thing>();
    
    public MaxWeightBox(int maxWeight){
        this.maxWeight = maxWeight;
    }
    
    @Override
    public void add(Thing thing) {
        int weightBox = 0;
        for (Thing t : things) {
            weightBox += t.getWeight();
        }
        if (weightBox + thing.getWeight() <= maxWeight) {
            things.add(thing);
        }
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        for (Thing t: things){
            if (t.equals(thing)){
                return true;
            }
        }
        return false;
    }
    
    //could also use a simpler way
    //return things.contains(thing)
}
