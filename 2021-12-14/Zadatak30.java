package DomaciCetrnaestiDecembar;

import java.util.Scanner;

public class Zadatak30 {
    public static void main(String[] args) {

//        30. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
//         Izracunati proizvod elemenata tog niza.
//                Primer: [2, 4] -> 8
//        30* Napisati funkciju koja racuna proizvod elemenata zadatog niza.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko ce niz imati clanova: ");
        int brojClanova = sc.nextInt();

        int[] niz = new int[brojClanova];

        for(int i = 0; i < niz.length; i++) {
            System.out.print("Unesite broj: ");
            niz[i] = sc.nextInt();
        }
        System.out.println(proizvodElemenata(niz));
    }

    public static int proizvodElemenata (int[] x) {
        int proizvod = 1;
        for(int i = 0; i < x.length; i++) {
            proizvod *= x[i];
        }
        return proizvod;
    }
}
