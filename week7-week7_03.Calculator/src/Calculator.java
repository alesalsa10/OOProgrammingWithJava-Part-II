/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alesa
 */
public class Calculator {
    private Reader reader;
    private int stats;
    
    public Calculator(){
        this.reader = new Reader();
        this.stats = 0;
    }
    
    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
                this.stats++;
            } else if (command.equals("difference")) {
                difference();
                this.stats++;
            } else if (command.equals("product")) {
                product();
                this.stats++;
            }
        }

        statistics();
    }
    
    private void sum(){         //private because only calculator has access to them
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        
        System.out.println("Sum of the values " + (value1 + value2));
    }
    
    private void difference(){         
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        
        System.out.println("Difference of the values " + (value1 - value2));
    }
    private void product(){         
        System.out.println("value1: ");
        int value1 = reader.readInteger();
        
        System.out.println("value2: ");
        int value2 = reader.readInteger();
        
        System.out.println("Product of the values " + (value1 * value2));
}
    
    private void statistics(){
        System.out.println("Calculations done " + this.stats);
    }
}
