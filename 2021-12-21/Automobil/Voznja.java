package Domaci_21_12;

import java.util.Scanner;

public class Voznja {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite marku automobila: ");
        String prviAutomobilMarka = sc.next();

        System.out.println("Unesite model automobila: ");
        String prviAutomobilModel = sc.next();

        System.out.println("Unesite serijski broj automobila: ");
        int prviAutomobilSerijskiBroj = sc.nextInt();

        AutomobilDomaci prviAutomobil = new AutomobilDomaci(prviAutomobilMarka, prviAutomobilModel, prviAutomobilSerijskiBroj);

        System.out.println("Unesite marku automobila: ");
        String drugiAutomobilMarka = sc.next();

        System.out.println("Unesite model automobila: ");
        String drugiAutomobilModel = sc.next();

        System.out.println("Unesite serijski broj automobila: ");
        int drugiAutomobilSerijskiBroj = sc.nextInt();

        System.out.println("Unesit ime vlasnika automobila: ");
        String ime1 = sc.next();

        System.out.println("Unesit preziime vlasnika automobila: ");
        String prezime1 = sc.next();

        Osoba vlasnik1 = new Osoba(ime1, prezime1);

        AutomobilDomaci drugiAutomobil = new AutomobilDomaci(drugiAutomobilMarka, drugiAutomobilModel, drugiAutomobilSerijskiBroj, vlasnik1);

        System.out.println(prviAutomobil);
        System.out.println(drugiAutomobil);

    }
}
