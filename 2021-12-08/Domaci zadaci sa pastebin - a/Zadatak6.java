package QAJavaZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

//        6. Ispisati proizvod prvih n celih brojeva [1, n].

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ceo broj: ");
        int n = sc.nextInt();
        int rezultat = 1;

        for(int i = 1; i <=n; i++) {
            rezultat *= i;
        }
        System.out.println(rezultat);
    }
}
