package org.example;

public class Leeuw extends Dier{

    String naam;

    public Leeuw(String naam){
        this.naam = naam;
    }
    @Override
    void maakGeluid() {
        System.out.println("ROAR!");
    }
}
