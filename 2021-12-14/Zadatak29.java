package DomaciCetrnaestiDecembar;

import java.util.Scanner;

public class Zadatak29 {
    public static void main(String[] args) {

//        29. -//-. Ispisati svaki treci element u obrnutom redosledu.
//                Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2
//        29* Napraviti funkciju koja ispisuje svaki treci element niza u obrnutom redosledu.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko ce niz imati clanova: ");
        int brojClanova = sc.nextInt();

        int[] niz = new int[brojClanova];

        for(int i = 0; i < niz.length; i++) {
            System.out.print("Unesite broj: ");
            niz[i] = sc.nextInt();
        }
        svakiTreciUnazad(niz);
    }

    public static void svakiTreciUnazad(int[] x) {
        for(int i = x.length; i > 0; i-=3) {
            System.out.println(x[i-1]);
        }
    }
}
