package org.example;

public class Duif extends Dier{

    String naam;

    public Duif(String naam){
        this.naam = naam;
    }

    @Override
    void maakGeluid() {
        System.out.println("ROEKOE ROEKOE");
    }
}
