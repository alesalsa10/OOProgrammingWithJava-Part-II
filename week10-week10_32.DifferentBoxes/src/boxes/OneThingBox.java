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

public class OneThingBox extends Box {
    private List<Thing> boxWithOne = new ArrayList<Thing>();
    
    public OneThingBox(){
    
    }
    
    @Override
    public void add(Thing thing){
        if (boxWithOne.isEmpty()){
            boxWithOne.add(thing);
        }
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        return boxWithOne.contains(thing);
    }
}
