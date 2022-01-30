package DomaciOsmiDecembar;

import java.util.Scanner;

public class DupliFaktorijel {
    public static void main(String[] args) {

//        1.[Dupli faktorijel] Napisati program koji racuna dupli faktorijel unetog
//        broja n. Dupli faktorijel broja n je:
//        n!! = n * (n-2) * (n-4) * ... * (2 ili 1)

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ceo broj: ");
        int n = sc.nextInt();
        int dupliFaktorijel = n;

        for(int i = 2; i < n; i+=2) {
            dupliFaktorijel *= (n - i);
        }
        System.out.println("n!! = " + dupliFaktorijel);
    }
}
