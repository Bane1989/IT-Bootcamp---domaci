package QAJavaZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        4. Za unet negativan ceo broj n, ispisati sve brojeve
//        od i zakljucno sa n do i zakljucno sa 0.

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite negativan ceo broj: ");
        int n = sc.nextInt();

        if(n > 0) {
            System.out.println("Greska! Niste uneli negativan broj.");
            System.out.print("Unesite negativan ceo broj: ");
            n = sc.nextInt();
        }
            for(int i = n; i <= 0; i++) {
                System.out.println(i);
            }
    }
}
