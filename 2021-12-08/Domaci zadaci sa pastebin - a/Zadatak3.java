package QAJavaZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//       3. Za unet pozitivan ceo broj n, ispisati sve brojeve od
//        i zakljucno sa 0 do i zakljucno sa n.

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite pozitivan ceo broj: ");
        int n = sc.nextInt();


        if(n < 0) {
            System.out.println("Greska! Niste uneli pozitivan broj.");
            System.out.print("Unesite pozitivan ceo broj: ");
            n = sc.nextInt();
        }

            for(int i = 0; i <= n; i++) {
                System.out.println(i);
            }
    }
}
