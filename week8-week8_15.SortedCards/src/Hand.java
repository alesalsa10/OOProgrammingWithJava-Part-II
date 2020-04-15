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
import java.util.Collections;

//this class represent the player hand set of cards
public class Hand implements Comparable<Hand>{
    private List<Card> cards;
    
    public Hand () {
        this.cards = new ArrayList<Card>();
    }
    
    public void add (Card card) {
        cards.add(card);
    }
    
    public void print() {
        for (Card card: cards){
            System.out.println(card);
        }
    }
    
    public void sort(){
        //sorts the hand in ascending order, user compareTo method created in card
        Collections.sort(cards);
    }
    
    public int getSum(){
        int sum = 0;
        for (Card card: cards) {
            sum += card.getValue();
        }
        return sum;
    }
    
    @Override
    public int compareTo(Hand other) {
        //has to compare based on the sum of all the values in hand
        return this.getSum() - other.getSum();
    }
    public void sortAgainstSuit(){
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
}
