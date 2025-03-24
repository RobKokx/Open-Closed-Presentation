package org.example;

public class Olifant extends Dier{

    String naam;

    public Olifant(String naam){
        this.naam = naam;
    }

    @Override
    void maakGeluid() {
        System.out.println("TOOT!");
    }
}
