package org.example;

import interfaces.IFilling;

public class cupCake extends Cake implements IFilling {


    protected String toppings;
    protected boolean hasFilling;

    public cupCake(String name, String baseFlavour, String toppings, boolean hasFilling){
        super(name, baseFlavour);
        this.toppings = toppings;
        this.hasFilling = hasFilling;
    }

    public String peelCase(){
        return "case has been peeled!";
    }



    public String bakingTime() {
        return "Around 15 - 20 min";
    }


    @Override
    public String hasFilling(String filling) {
        return "it has " + filling;
    }
}
