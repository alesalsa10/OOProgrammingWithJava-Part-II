/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

/**
 *
 * @author alesa
 */
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ContainerHistory {
    private List<Double> history = new ArrayList<Double>();
    
    public ContainerHistory(){
        //creates empty ContainerHistory object
    }
    public void add(double situation){
        history.add(situation);
    }
    
    public void reset(){
        history.clear();
    }
    
    public String toString(){
        return history.toString();
    }
    
    public double maxValue(){
        if (history.isEmpty()){
            return 0.0;
        }
        return Collections.max(history);
    }
    
    public double minValue(){
        if (history.isEmpty()){
            return 0.0;
        }
        return Collections.min(history);
    }
    
    public double average(){
        if (history.isEmpty()){
            return 0.0;
        }
        double average = 0;
        double sum = 0;
        
        for (Double i: history){
            sum += i;
        }
        average = sum / (double) history.size();
        return average;
    }
    
    public double greatestFluctuation() {
        if (history.isEmpty()) {
            return 0;
        }
 
        double biggest = 0;
 
        for (int i = 0; i < history.size() - 1; i++) {
            double previousChange = Math.abs(history.get(i) - history.get(i + 1));
            if (previousChange > biggest) {
                biggest = previousChange;
            }
        }
 
        return biggest;
    }
    
    public double variance(){
        if (history.isEmpty() || history.size() == 1){
            return 0.0;
        }
        double variance = 0;
        for (double i: history){
            variance += Math.pow(i - average(), 2);
        }
        return variance / (history.size()-1);
    }
}
