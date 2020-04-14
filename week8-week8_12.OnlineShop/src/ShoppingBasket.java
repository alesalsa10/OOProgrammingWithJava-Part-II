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

public class ShoppingBasket {
    private Map<String, Purchase> purchases;
    
    public ShoppingBasket(){
        this.purchases = new HashMap<String, Purchase>();
    }
    
    public void add (String product, int price) {
        if (purchases.containsKey(product)) {
            purchases.get(product).increaseAmount();
        } else {
            purchases.put(product, new Purchase(product, 1, price));
        }
    }
    
    public int price(){
        int totalPrice = 0;
        for (Purchase purchase: this.purchases.values()) {
            totalPrice += purchase.price();
        }
        return totalPrice;
    }
    
    public void print() {
        for (Purchase purchase: purchases.values()) {
            System.out.println(purchase);
        }
    }
}
