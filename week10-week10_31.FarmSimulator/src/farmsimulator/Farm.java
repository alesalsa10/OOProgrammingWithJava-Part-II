/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author alesa
 */
import java.util.List;
import java.util.ArrayList;

public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private List<Cow> cows;
    
    public Farm(String owner, Barn barn){
        this.owner = owner;
        this.barn = barn;
        this.cows = new ArrayList<Cow>();
    }
    
    public void addCow(Cow cow){
        cows.add(cow);
    }
    
    @Override
    public void liveHour(){
        for (Cow cow: cows){
            cow.liveHour();
        }
    }
    
    public String getOwner(){
        return owner;
    }
    
    public void manageCows(){
    //calls barn's method takeCareOf
    barn.takeCareOf(cows);
    }
    
    public String toString(){
        
        String s = "";
        s += "Farm owner: " + owner + "\n";
        s += "Barn bulk count: " + barn + "\n";
        
        if (cows.isEmpty()){
            s += "No cows." + "\n";
        }
        else{
            s += "Animals: " + "\n";
            for (Cow cow: cows){
                s += "\t" + cow + "\n";
            }
        
        }
        return s.trim();
    }
    public void installMilkingRobot(MilkingRobot robot){
        barn.installMilkingRobot(robot);
    }
}
