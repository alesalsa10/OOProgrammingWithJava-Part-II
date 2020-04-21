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
import java.util.Collections;

public class Rating {
    private List<Jumper> jumpers;
    
    public Rating(){
        this.jumpers = new ArrayList<Jumper>();
    }
    
    public void addJumper(String name, int points){
        jumpers.add(new Jumper(name, points));
    }
    
    public List<Integer> allPoints(){
        //5 random numbers btw 10 and 20
        
        List<Integer> points = new ArrayList<Integer>();
        
        while (points.size()< 5){
            points.add(new Random().nextInt((20 - 10) + 1)+ 10);    
            }
        Collections.sort(points);
        return points;
        }
    
    public void setPoints(){
        //lowest and highest rating will be dropped
        
        List<Integer> toBeCounted = allPoints();
        toBeCounted.remove(0);
        toBeCounted.remove(3);
        
        int sum = 0;
        for (int i: toBeCounted){
            sum += i;
        }
        
        for (Jumper jumper: jumpers){
                jumper.setPoints(sum + jumper.jump());//this will return an integer btw 60 and 120
        }
    }
    
    public void printAllJumpers(){
        Collections.sort(jumpers);
        for (int i = 1; i <=  jumpers.size(); i++){
            System.out.println(i + ". " + jumpers.get(i-1));
        }
    }
    
    public void printRoundResults(){
        Collections.sort(jumpers);
        for (Jumper jumper: jumpers){
            System.out.println("   " + jumper.getName());
            System.out.println("      " + "length: " + jumper.printLenght());
            System.out.println("      " + "judge votes: " + allPoints());
        }
    }
    
    public void printFinalResults(){
        Collections.sort(jumpers, Collections.reverseOrder());
        
        int i = 1;    
        for (Jumper jumper: jumpers){
                System.out.println(i++ + " " + jumper.toString());
                jumper.printAllLenghts();
            }
        }
    }

       
