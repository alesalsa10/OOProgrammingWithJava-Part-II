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

public class Person {
    private String name;
    private List<String> phoneNumbers;
    private List<String> address;
    
    public Person(String name){
        this.name = name;
        this.phoneNumbers = new ArrayList<String>();
        this.address = new ArrayList<String>();
    }
    
    public void addPhoneNumber(String phoneNumber){
        phoneNumbers.add(phoneNumber);
    }
    
    public void addAddress(String street, String city){
        this.address.add(street + city);
    }
    
    public String getName(){
        return this.name;
    }
    
    public List<String> getNumber(){
        return this.phoneNumbers;
    }
    
    public List<String> getAddress(){
        return this.address;
    }
    
    public void removeInfo(){
        phoneNumbers.clear();
        address.clear();
    }
}
