package QAJavaZadaciZaVezbanjeSaPasteBina;

import java.util.Scanner;

public class Zadatak41 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //        41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.

        System.out.println("Prosecna vrednost niza je " + prosecnaVrednostNiza(kreiranjeNiza()));;

    }

    //Funkcija u kojoj kreiramo niz nad kojim cemo operisati
    public static double[] kreiranjeNiza () {
        System.out.println("Unesite koliko clanova ce imati niz: ");
        double[] niz = new double[sc.nextInt()];

        for (int i = 0; i < niz.length; i++ ){
            System.out.println("Unesite " + (i + 1) + ". broj: ");
            niz[i] = sc.nextDouble();
        }
        return niz;
    }

    //Funkcija koja izracunava prosecnu vrednost niza nad kojim operisemo
    public static double prosecnaVrednostNiza (double[] nizKojiProveravamo) {
        double prosecnaVrednost = 0;
        for (int i = 0; i < nizKojiProveravamo.length; i++) {
            prosecnaVrednost += nizKojiProveravamo[i];
        }
        prosecnaVrednost /= nizKojiProveravamo.length;
        return prosecnaVrednost;
    }
}
