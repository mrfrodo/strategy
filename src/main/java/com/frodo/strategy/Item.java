package com.frodo.strategy;

public class Item {

    private String code;
    private int pris;

    public Item(String upc, int cost){
        this.code =upc;
        this.pris =cost;
    }

    public String getCode() {
        return code;
    }

    public int getPris() {
        return pris;
    }
}
