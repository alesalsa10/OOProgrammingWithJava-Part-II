/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alesa
 */
public class Flight {
    private String depart;
    private String dest;
    private Airplane airplane;
    
    public Flight(Airplane airplane , String depart, String dest ){
        this.depart = depart;
        this.dest = dest;
        this.airplane = airplane;
    }
    
    public String toString(){
        //prints flight info
        return  this.airplane + " (" + this.depart + "-" + this.dest + ")";
    }
    
    public String departDest(){
        return this.depart + "-" + this.dest;
    }
}
