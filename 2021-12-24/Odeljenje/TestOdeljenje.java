package Domaci_24_12_saPastebina;

import java.util.ArrayList;

public class TestOdeljenje {

    public static void main(String[] args) {

        ArrayList<Integer> niz1 = new ArrayList<>();
        niz1.add(5);
        niz1.add(2);
        niz1.add(5);
        niz1.add(4);
        niz1.add(4);
        niz1.add(4);

        ArrayList<Integer> niz2 = new ArrayList<>();
        niz2.add(5);
        niz2.add(5);
        niz2.add(5);
        niz2.add(5);
        niz2.add(5);
        niz2.add(5);

        ArrayList<Integer> niz3 = new ArrayList<>();
        niz3.add(4);
        niz3.add(4);
        niz3.add(4);
        niz3.add(4);
        niz3.add(4);
        niz3.add(4);

        Ucenik prvi = new Ucenik("Branko", "Stankovic", niz1);
        Ucenik drugi = new Ucenik("Marko", "Pejic", niz2);
        Ucenik treci = new Ucenik("Natasa", "Djricic", niz3);

        Odeljenje prvo = new Odeljenje("Prvo 1");


    }
}
