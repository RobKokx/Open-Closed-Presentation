package org.example;

public class Main {
    public static void main(String[] args) {
        Dierentuin dierentuin = new Dierentuin();
        dierentuin.dierentuinZonderOC(dierentuin.leeuw.naam);
        dierentuin.dierentuinMetOC(dierentuin.leeuw);

        dierentuin.dierentuinZonderOC(dierentuin.olifant.naam);
        dierentuin.dierentuinMetOC(dierentuin.olifant);

        dierentuin.dierentuinZonderOC(dierentuin.duif.naam);
        dierentuin.dierentuinMetOC(dierentuin.duif);
    }
}