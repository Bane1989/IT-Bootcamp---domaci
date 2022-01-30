package Grad_22_12;

import Automobil_21_12.Automobil;
import Domaci_21_12.Osoba;

public class TestPutovanje {
    public static void main(String[] args) {

        Grad destinacija1 = new Grad("Raska" , "Srbija");
        Osoba vodjaPuta1 = new Osoba("Mitar", "Miric");
        Automobil automobil1 = new Automobil("Fiat", 2007, 222450);

        Grad destinacija2 = new Grad("Moskva" , "Rusija");
        Osoba vodjaPuta2 = new Osoba("Dragi", "Tomic");
        Automobil automobil2 = new Automobil("Skoda", 2015, 121500);


        Putovanje prvo = new Putovanje(destinacija1, vodjaPuta1, automobil1, 250);
        Putovanje drugo = new Putovanje(destinacija2, vodjaPuta2, automobil2, 2223);

        Osoba osoba1 = new Osoba("Dragan", "Draganovic");
        Osoba osoba2 = new Osoba("Milan", "Milanovic");
        Osoba osoba3 = new Osoba("Jovan", "Jovanovic");

        System.out.println(prvo);
        double brzina1 = 110;
        System.out.println("Ako vozimo " + brzina1 + " km/h, potrebno je " + prvo.prosecnaBrzina(brzina1) + " sati da se stigne na destinaciju.");
        System.out.println("******************************************");
        prvo.prijava(osoba1);
        prvo.prijava(osoba2);
        prvo.prijava(osoba3);
        prvo.odjava(osoba2);
        System.out.println(prvo);


        System.out.println("*************************");

        System.out.println(drugo);
        double brzina2 = 105;
        System.out.println("Ako vozimo " + brzina2 + " km/h, potrebno je " + drugo.prosecnaBrzina(brzina2) + " sati da se stigne na destinaciju.");
    }
}
