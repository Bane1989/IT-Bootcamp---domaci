package DomaciOsmiDecembar;

import java.util.Scanner;

public class SumaIntervala {
    public static void main(String[] args) {

//        2.[Suma intervala] Korisnik unosi cele brojeve m i n sa
//        konzole, m <= n. Ispisati sumu brojeva [m, n].

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ceo broj m: ");
        int m = sc.nextInt();
        System.out.print("Unesite ceo broj n: ");
        int n = sc.nextInt();
        int sumaIntervala = 0;

        if(m > n) {
            System.out.println("Greska! Mora biti da je m <= n.");
            System.out.print("Unesite ceo broj m: ");
            m = sc.nextInt();
            System.out.print("Unesite ceo broj n: ");
            n = sc.nextInt();
        }

        for(int i = m; i <= n; i++) {
            sumaIntervala += i;
            if(m == n) {
                sumaIntervala = i;
            }
        }
        System.out.println(sumaIntervala);
    }
}
