package org.example;

public class trayBake extends Cake {

    protected String sizeOfPortions;
    protected boolean healthier;


    public trayBake(String name, String baseFlavour, String sizeOfPortions, boolean healthier) {
        super(name, baseFlavour);
        this.sizeOfPortions = sizeOfPortions;
        this.healthier = healthier;
    }




    public String sliceUp(){
        return "they have been sliced!";
    }

    public String sliceUp(String message){
        return "it has been in " + message;
    }

    @Override
    public String bakingTime() {
        return "bake for around 25 - 30min";
    }


//    ^^ method overload
}
