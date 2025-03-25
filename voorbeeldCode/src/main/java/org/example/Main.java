package org.example;

public class Main {
    public static void main(String[] args) {
        Dierentuin dierentuin = new Dierentuin();

        dierentuin.dierentuinZonderOC(dierentuin.leeuw.getNaam());
        dierentuin.dierentuinMetOC(dierentuin.leeuw);

        dierentuin.dierentuinZonderOC(dierentuin.olifant.getNaam());
        dierentuin.dierentuinMetOC(dierentuin.olifant);

        dierentuin.dierentuinZonderOC(dierentuin.duif.getNaam());
        dierentuin.dierentuinMetOC(dierentuin.duif);
    }
}