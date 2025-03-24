package org.example;

public class Dierentuin {
    Leeuw leeuw = new Leeuw("leeuw");
    Olifant olifant = new Olifant("olifant");
    Duif duif = new Duif("Duif");

    public void dierentuinZonderOC(String dier){
         switch(dier) {
             case "leeuw":
                 leeuw.maakGeluid();
                 break;
             case "olifant":
                 olifant.maakGeluid();
                 break;
                 //Hier moet je nu voor elk dier een switch case maken
         }
    }

    public void dierentuinMetOC(Dier dier) {
        dier.maakGeluid();
    }

}
