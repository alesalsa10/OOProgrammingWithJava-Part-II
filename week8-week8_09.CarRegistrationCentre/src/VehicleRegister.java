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
import java.util.ArrayList;

public class VehicleRegister {
    private Map<RegistrationPlate, String> owners;
    
    public VehicleRegister(){
        this.owners = new HashMap<RegistrationPlate, String>();
    }
    
    public boolean add(RegistrationPlate plate, String owner){
        if (!owners.containsKey(plate)){
            owners.put(plate, owner);
            return true;
        } else{
            return false;
        }    
    }
    
    public String get (RegistrationPlate plate){
        return owners.get(plate);  //gets value of associated with plate, returns null if
                            //no value is found
    }
    
    public boolean delete(RegistrationPlate plate){
        if (!owners.containsKey(plate)){
            return false;
        }
        owners.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates(){
        for (RegistrationPlate plate: owners.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> ownerNames = new ArrayList<String>();
        for (String owner: owners.values()){
            if (!ownerNames.contains(owner)){
                ownerNames.add(owner);
            }
        }
        for (String own: ownerNames){
            System.out.println(own);
        }
    }
}
