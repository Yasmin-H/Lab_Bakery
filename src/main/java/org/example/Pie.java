package org.example;

import interfaces.IBake;

public class Pie implements IBake {


    private String name;
    private String type;




    public Pie(String name, String type){
        this.name = name;
        this.type = type;

    }

    @Override
    public String bakingTime() {
        return "bake 60 -70 minute until golden brown";
    }
}
