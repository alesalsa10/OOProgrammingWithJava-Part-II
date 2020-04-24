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
import java.lang.IllegalStateException;

public class MilkingRobot {
    
    private BulkTank tank;
    
    public MilkingRobot(){
        //creates new milking robot
    }
    
    public BulkTank getBulkTank(){
        //returns connectd bulk tank, or null if tank is not installed
        if (tank == null){
            return null;
        }
        return tank;
    }
    
    public void setBulkTank(BulkTank tank){
        //installs tank to milking robot
        this.tank = tank;
    }
    
    public void milk(Milkable milkable) throws IllegalStateException{
        //milks cow and fills tank, returns IllegalStateException if no tank added
        if (tank == null){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        tank.addToTank(milkable.milk());
    }
}
