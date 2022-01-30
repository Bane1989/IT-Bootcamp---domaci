package DomaciCetrnaestiDecembar;

import java.util.Scanner;

public class Zadatak27 {
    public static void main(String[] args) {

//        27. Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz.
//                Ispisati svaki drugi element tog niza
//        Primer: [1, 2, 3, 4, 5] -> 1 3 5
//        27* Napraviti funkciju koja ispisuje svaki drugi element zadatog niza.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko ce niz imati clanova: ");
        int brojClanova = sc.nextInt();

        int[] niz = new int[brojClanova];

        for(int i = 0; i < niz.length; i++) {
            System.out.print("Unesite broj: ");
            niz[i] = sc.nextInt();
        }

        svakiDrugi(niz);
    }
    public static void svakiDrugi( int[] y) {
        for(int i = 0; i < y.length; i+=2) {
            System.out.println(y[i]);
        }
    }

}
