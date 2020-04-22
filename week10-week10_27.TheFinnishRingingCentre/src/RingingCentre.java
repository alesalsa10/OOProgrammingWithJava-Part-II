/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alesa
 */
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class RingingCentre {
    private Map<Bird, List<String>> observationPlace;
    
    public RingingCentre(){
        this.observationPlace = new HashMap<Bird, List<String>>();
    }
    
    public void observe(Bird bird, String place){
        
        if (!this.observationPlace.containsKey(bird)){
            this.observationPlace.put(bird, new ArrayList<String>());
            this.observationPlace.get(bird).add(place);
        } else{
            this.observationPlace.get(bird).add(place);
        }
    }
    
    public void observations(Bird bird){
        if (!this.observationPlace.containsKey(bird)){
            System.out.println(bird + " observations: 0");
        } else{
            System.out.println(bird + " observations: " + this.observationPlace.get(bird).size());
        }
        if (this.observationPlace.get(bird) != null){
            for (String s: this.observationPlace.get(bird)){
                System.out.println(s);
            }
        }
    }
}
