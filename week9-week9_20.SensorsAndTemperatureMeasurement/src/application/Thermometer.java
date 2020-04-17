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
import java.util.Random;

public class Thermometer implements Sensor{
    private Random random;
    private boolean thermometer;
    
    public Thermometer(){
        this.random = new Random();
        this.thermometer = false; //it starts false 
    }
    
    public boolean isOn(){
        return thermometer;
    }
    
    public int measure(){
        if (isOn()) {
            return random.nextInt((30 - -30) + 1) + -30;
        } else {
            throw new IllegalStateException();
        }
    }
    
    public void on(){
        thermometer = true;
    }
    
    public void off(){
        thermometer = false;
    }
}
