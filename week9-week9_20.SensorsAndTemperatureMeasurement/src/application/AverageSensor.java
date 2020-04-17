/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author alesa
 */
import java.util.List;
import java.util.ArrayList;

public class AverageSensor implements Sensor{
    private List<Sensor> sensors;
    private List<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<Sensor>();
        this.readings = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor additional){
        sensors.add(additional);
    }
    
    public boolean isOn(){
        for (Sensor sensor: sensors){
            if (!sensor.isOn()){
                return false;
            }
        }
        return true;
    }
    public void on(){
        //when average sensor is one all sensors have to be on
        for (Sensor sensor: sensors){
            sensor.on();
        }
    }
    
    public void off(){
        for (Sensor sensor: sensors){
            sensor.off();
        }
    }
    
    
    public int measure(){
        //average of all the readings
        if (!this.isOn() || this.sensors.isEmpty()){
            throw new IllegalStateException();
        } else{
            int sum = 0;
            int average = 0;
            
            for (Sensor sensor: sensors){
                sum += sensor.measure();
            }
            average = sum / sensors.size();
            readings.add(average);
            
            return average;
        }
    }
    public List<Integer> readings(){
        return this.readings;
    }
}
