package com.frodo.strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingManager {

    //List of items
    List<Item> items;

    private PaymentStrategy strategy;

    public ShoppingManager(PaymentStrategy strategy) {
        System.out.println("Creating shopping manager with strategy: "+strategy.toString());
        this.strategy = strategy;
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPris();
        }
        return sum;
    }


    // Payment method of shopping cart requires payment algorithm as argument
    // and doesn’t store it anywhere as instance variable.
    public void pay(){
        int amount = calculateTotal();
        strategy.excute(amount);
    }

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
}
