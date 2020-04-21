/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alesa
 */
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Jumper implements Comparable<Jumper> {
    private String name;
    private int points;
    private List<Integer> jumpLenghts;
    private int jumpLen;
    
    public Jumper(String name, int points){
        this.name = name;
        this.points = 0;
        this.jumpLenghts = new ArrayList<Integer>();
        this.jumpLen = 0;
    }
    
    public String toString(){
        return this.name + " (" + this.points + ")";
    }
    
    public int jump(){
        this.jumpLen = new Random().nextInt((120 - 60) + 1) + 60;
        this.jumpLenghts.add(this.jumpLen);
        return jumpLen;
    }
    
    public void setPoints(int value){
        this.points += value;
    }
    public String getName(){
        return this.name;
    }
    public String printLenght(){
        return "" + this.jumpLen;
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public void printAllLenghts(){
        String listString = "";
        
        for (int i = 0; i < this.jumpLenghts.size();i++){
            listString += this.jumpLenghts.get(i) + " m, ";
        }
        listString = listString.replaceAll(", $", "");
        System.out.println("jump lenghts: " + listString);
    }
    
    @Override
    public int compareTo(Jumper other){
        return this.getPoints() - other.getPoints();
    }
}
