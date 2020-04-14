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

public class Book implements ToBeStored{
    private String writer;
    private String name;
    private double weight;
    private List<Book> books;
    
    public Book(String writer, String name, double weight){
        this.writer = writer;
        this.name = name;
        this.weight = weight;
        this.books = new ArrayList<Book>();
    }
    
    public String toString(){
        return writer + ": " + name; 
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
}
