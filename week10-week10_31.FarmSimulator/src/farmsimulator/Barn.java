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
import java.util.Collection;
import java.lang.IllegalStateException;

public class Barn {
    private BulkTank tank;
    private MilkingRobot robot;
    
    public Barn(BulkTank tank){
        this.tank = tank;
    }
    
    public BulkTank getBulkTank(){
        //returns the barns tank
        return tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot){
        //install milking robot
        robot = milkingRobot;
        robot.setBulkTank(tank);
    }
    
    public void takeCareOf(Cow cow ) throws IllegalStateException{
        //milks cow with robot, if robot not install thorws IllegalStateException
        if (robot == null){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        robot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows) throws IllegalStateException{
        //milks cows thorws IllegalStateException if robot not installed
        if (robot == null){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
        for (Cow cow: cows){
            robot.milk(cow);
        }
    }
    
    @Override
    public String toString() {
        return Math.ceil(tank.getVolume()) + "/" + Math.ceil(tank.getCapacity());
    }
}
