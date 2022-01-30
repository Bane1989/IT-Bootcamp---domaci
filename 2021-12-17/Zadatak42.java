package QAJavaZadaciZaVezbanjeSaPasteBina;

import java.util.Scanner;

public class Zadatak42 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //        42. Napisati funkciju koja proverava da li u nizu niski imena postoji "Marija" ili "Petar".

        kojaImenaProveravamo(kreiranjeNiza());
        
    }


    //Funkcija u kojoj kreiramo niz nad kojim cemo operisati
    public static String[] kreiranjeNiza () {
        System.out.println("Unesite koliko clanova ce imati niz: ");
        String[] niz = new String[sc.nextInt()];

        for (int i = 0; i < niz.length; i++ ){
            System.out.println("Unesite " + (i + 1) + ". ime: ");
            niz[i] = sc.next();
        }
        return niz;
    }
    //Funkcija u kojoj unosimo imena za koja proveravamo da li se nalaze u nizu nad kojim operisemo
    public static void kojaImenaProveravamo (String[] nizKojiOperisemo) {
        String ime;
        int i = 0;

        while(i < 2) {
            System.out.println("Unesite " + (i + 1) + ". ime koje proveravate: ");
            ime = sc.next();
            daLiImaImena(nizKojiOperisemo, ime);
            i++;
        }
        System.out.println("Kraj programa.");
    }

    //Funkcija koja proverava da li se uneta imena nalaze u nizu nad kojim operisemo
    public static void daLiImaImena (String[] nizKojiOperisemo, String imeKojeProveravamo) {
        for (int i = 0; i < nizKojiOperisemo.length; i++) {
            if (nizKojiOperisemo[i].equalsIgnoreCase(imeKojeProveravamo)){
                System.out.println(imeKojeProveravamo + " se nalazi u nizu imena.\n");
                break;
            }
            else {
                System.out.println(imeKojeProveravamo + " se ne nalazi u nizu imena.\n");
                break;
            }
        }
    }
}
