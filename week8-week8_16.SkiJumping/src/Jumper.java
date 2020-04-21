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
import java.util.StringJoiner;

public class Jumper implements Comparable<Jumper> {
    private String name;
    private int points;
    private List<Integer> jumpLenghts;
    
    public Jumper(String name, int points){
        this.name = name;
        this.points = 0;
        this.jumpLenghts = new ArrayList<Integer>();
    }
    
    public String toString(){
        return this.name + " (" + this.points + ")";
    }
    
    public int jump(){
        int jumpLength = new Random().nextInt((120 - 60) + 1) + 60;
        this.jumpLenghts.add(jumpLength);
        return jumpLength;
    }
    
    public void setPoints(int value){
        this.points += value;
    }
    public String getName(){
        return this.name;
    }
    public String printLenght(){
        return "" + jump();
    }
    
    public int getPoints(){
        return this.points;
    }
    
    public void printAllLenghts(){
        String listString = "";
        
        for (int i = 0; i < this.jumpLenghts.size()-1;i++){
            listString += this.jumpLenghts.get(i) + "m, ";
        }
        listString = listString.replaceAll(", $", "");
        System.out.println("jump lenghts: " + listString);
    }
    
    @Override
    public int compareTo(Jumper other){
        return this.getPoints() - other.getPoints();
    }
}
