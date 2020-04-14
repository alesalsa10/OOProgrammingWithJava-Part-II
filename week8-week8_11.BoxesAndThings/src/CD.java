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

public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int publishingYear;
    private double weight;
    private List<CD> cds;
    
    public CD(String artist, String title, int publishingYear){
        this.artist = artist;
        this.title = title;
        this.publishingYear = publishingYear;
        this.weight = 0.1;
        this.cds = new ArrayList<CD>();
    }
    
    public String toString(){
        return artist + ": " + title + " (" + publishingYear + ")";
    }
        
    @Override
    public double weight(){
        return 0.1;
    }
}
