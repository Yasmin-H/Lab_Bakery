package org.example;

public class tieredCake extends Cake{

    protected int tiers;
    protected boolean decorations;


    public tieredCake(String name, String baseFlavour, int tiers, boolean decorations) {
        super(name, baseFlavour);
        this.tiers = tiers;
        this.decorations = decorations;
    }

    @Override
    public String bakingTime() {
        return "Bake the cake for 45-50 min";
    }
}
