package org.example.dieren;

public class Leeuw extends Dier{

    private final String naam;

    public Leeuw(String naam){
        this.naam = naam;
    }
    @Override
    public void maakGeluid() {
        System.out.println("ROAR!");
    }

    public String getNaam() {return naam;}

}
