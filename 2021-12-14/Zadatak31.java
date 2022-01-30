package DomaciCetrnaestiDecembar;

import java.util.Scanner;

public class Zadatak31 {
    public static void main(String[] args) {

//        31. Napisati funkciju koja racuna proizvod 3 broja.
//                Hint kako citati ove zadatke:
//        - ... racuna proizvod 3 broja = proseldjuje joj se 3 broja (imace 3 argumenta)
//                - funkciju koja racuna = vraca odgovarajuci podatak (nece biti void nego nesto konkretno)

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj: ");
        int prvi = sc.nextInt();
        System.out.print("Unesite broj: ");
        int drugi = sc.nextInt();
        System.out.print("Unesite broj: ");
        int treci = sc.nextInt();

        System.out.println(proizvodTriBroja(prvi, drugi, treci));

    }

    public static int proizvodTriBroja(int x, int y, int z) {
        int proizvod = x * y * z;
        return proizvod;
    }
}
