package QAJavaZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//        5. Za unet pozitivan ceo broj n, ispisati sve brojeve
//        od i zakljucno sa -14 do i zakljucno sa 2n.

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite pozitivan ceo broj: ");
        int n = sc.nextInt();

        if(n < 0) {
            System.out.println("Greska! Niste uneli pozitivan broj.");
            System.out.print("Unesite pozitivan ceo broj: ");
            n = sc.nextInt();
        }

        for(int i = -14; i <= 2 * n; i++) {
            System.out.println(i);
        }
    }
}
