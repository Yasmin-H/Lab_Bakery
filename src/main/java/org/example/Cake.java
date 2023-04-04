package org.example;

import interfaces.IBake;

public abstract class Cake implements IBake {

    protected String name;
    protected String baseFlavour;


    public Cake(String name, String baseFlavour){
        this.name = name;
        this.baseFlavour = baseFlavour;
    }



    public abstract String bakingTime();
    };

//    public String bakingTime(int time){
//        return "It takes " + time + " minutes to bake!";
//    }





