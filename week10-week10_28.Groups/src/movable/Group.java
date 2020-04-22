/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;

/**
 *
 * @author alesa
 */
import java.util.List;
import java.util.ArrayList;
import java.lang.StringBuffer;

public class Group implements Movable{
    private List<Movable> things;
    
    public Group(){
        this.things = new ArrayList<Movable>();
    }
    
    @Override
    public String toString(){
        
        //like a string but it can be modified
        StringBuffer result = new StringBuffer();
        
        for (Movable m: things){
            result.append(m.toString()).append("\n");
        }
        return result.toString().trim();
    }
    
    public void addToGroup(Movable movable){
        //adds new objects which implement the interface movable
        things.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        for (Movable m: things){
            m.move(dx, dy);
        }
    }
}
