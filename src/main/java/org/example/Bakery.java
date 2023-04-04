package org.example;

import interfaces.IBake;

import java.util.ArrayList;

public class Bakery {


    private ArrayList<IBake> cakes; // used the interface IBake instead of Cake class

    public Bakery(){
        this.cakes = new ArrayList<>();
    }

    public int countCakes(){
        return this.cakes.size();
    }

    public void addCake(IBake cakes){
        this.cakes.add(cakes);
    }



}
