package org.example;

import org.example.dieren.Dier;
import org.example.dieren.Duif;
import org.example.dieren.Leeuw;
import org.example.dieren.Olifant;

public class Dierentuin {
    Leeuw leeuw = new Leeuw("leeuw");
    Olifant olifant = new Olifant("olifant");
    Duif duif = new Duif("Duif");

    public void dierentuinZonderOC(String dier){
         switch(dier) {
             case "leeuw":
                 System.out.println("ROAR!");
                 break;
             case "olifant":
                 System.out.println("TOOT!");
                 break;
             default:
                 System.out.println("Je zal toch echt zelf een switchCase moeten maken oen.");
                 //Hier moet je nu voor elk dier een switch case maken
         }
    }

    public void dierentuinMetOC(Dier dier) {
        dier.maakGeluid();
    }

}
