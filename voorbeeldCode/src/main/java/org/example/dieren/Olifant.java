package org.example.dieren;

public class Olifant extends Dier{

    private final String naam;

    public Olifant(String naam){
        this.naam = naam;
    }

    @Override
    public void maakGeluid() {
        System.out.println("TOOT!");
    }

    public String getNaam() {return naam;}

}
