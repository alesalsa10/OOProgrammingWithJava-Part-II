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

public class PhoneBook {
    //contains people information
    private List<Person> people;
    
    
    public PhoneBook(){
        this.people = new ArrayList<Person>();
    }
    
    
    public void addPerson(String name){
        people.add(new Person(name));
    }
    
    
    public void addNumber(String number, String name){
        for (Person person: people){
            if (person.getName().equals(name)){
                person.addPhoneNumber(number);
            }
        }
    }
    
    public void addAddress(String street, String city, String name){
        for (Person person: people){
            if (person.getName().equals(name)){
                person.addAddress(street, city);
            }
        }
    }
    
    public void searchAllInfo(String name){
        List<String> address = new ArrayList<String>();
        
        for (Person person: people){
            if (person.getName().equals(name)){
                address = person.getAddress();
                String listString = "";
                
                for (int i = 0; i < address.size(); i ++){
                    listString = address.get(i);
                }
                System.out.println(listString.trim());
                break;
            } else if (address.isEmpty()){
                System.out.println("address unknown");
            }
        }
        searchByName(name);
    }
    
    public void searchByName(String name){
        List<String> numbers = new ArrayList<String>();
        
        for (Person person: people){
            if (person.getName().equals(name)){
                numbers = person.getNumber();
                String listString = "";
                
                for (int i = 0; i < numbers.size(); i++){
                    listString += numbers.get(i) + "\n";
                }
                System.out.println(listString.trim());
                break;
            } else {
                System.out.println("not found");
            }
        }
    }
    
    public void searchByNumber(String number){
        
        for (Person person: people){
            if (person.getNumber().contains(number)){
                System.out.println(person.getName());
                break;
            } else  {
                System.out.println("not found");
            }
        }
    }
    
    public void removePerson(String name){
        for (Person person: people){
            if (person.getName().equals(name)){
                person.removeInfo();
            }
        }
    }
    
}
