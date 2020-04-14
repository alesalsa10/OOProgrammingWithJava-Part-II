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
import java.util.Set;
import java.util.HashSet;

public class Storehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;
    
    public Storehouse(){
        this.productPrice = new HashMap<String, Integer>();
        this.productStock = new HashMap<String, Integer>();
    }
    
    
    public void addProduct(String product, int price, int stock){
        this.productPrice.put(product, price);
        this.productStock.put(product, stock);
    }
    
    public int price(String product){
        for (String item: this.productPrice.keySet()){
            if (item.equals(product)){
                return this.productPrice.get(item);
            }
        }
        return -99;
    }
    
    public int stock(String product){
        if (this.productStock.containsKey(product)){
            return this.productStock.get(product);
        }
        return 0;
    }
    
    public boolean take(String product) {
        int stockCount = 0;
        
        if (this.productStock.containsKey(product)){
            stockCount = this.productStock.get(product);
            if (stockCount > 0) {
                stockCount--;
                this.productStock.replace(product, stockCount);
                return true;
            }
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> names = new HashSet<String>();
        for (String productName: this.productStock.keySet()){
            names.add(productName);
        }
        return names;
    }
}

