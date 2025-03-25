package org.example.dieren;

public class Duif extends Dier{

    private final String naam;

    public Duif(String naam){
        this.naam = naam;
    }

    @Override
    public void maakGeluid() {
        System.out.println("ROEKOE ROEKOE");
    }

    public String getNaam() {return naam;}
}
