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

public class BlackHoleBox extends Box{
    // anything can be added to it but nothinh can be found
    private List<Thing> things = new ArrayList<Thing>();
    
    public BlackHoleBox(){
    
    }
    
    @Override
    public void add(Thing thing){
        things.add(thing);
    }
    
    @Override
    public boolean isInTheBox(Thing thing){
        return false;
    }
}
