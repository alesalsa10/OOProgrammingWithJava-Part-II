/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alesa
 */
import java.util.List;
import java.util.ArrayList;

public class Box implements ToBeStored{
    private double maxWeight;
    private List<ToBeStored> boxContent; 
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
        this.boxContent = new ArrayList<ToBeStored>();
    }
    
    public void add(ToBeStored item){
        if((this.maxWeight - this.weight()) >= item.weight())
            this.boxContent.add(item);
    }
    
    
    @Override
    public double weight(){
        double totalWeight = 0.0;
        
        for (ToBeStored thing: boxContent){
            totalWeight += thing.weight();
        }
        return totalWeight;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.boxContent.size() + " things, total weight " + weight() + " kg";
    }
}
