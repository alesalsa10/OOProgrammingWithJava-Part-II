/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author alesa
 */
import java.util.List;
import java.util.ArrayList;

public class Box implements Thing{
    private int maximumCapacity;
    private List<Thing> boxContent;
    
    public Box(int maximumCapacity){
        this.maximumCapacity = maximumCapacity;
        this.boxContent = new ArrayList<Thing>();
    }
    
    public boolean addThing(Thing thing){
        if (this.maximumCapacity - thing.getVolume()>= getVolume()){
            boxContent.add(thing);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public int getVolume(){
        int volume = 0;
        for (Thing thing: boxContent){
            volume += thing.getVolume();
        }
        return volume;
    }
}
