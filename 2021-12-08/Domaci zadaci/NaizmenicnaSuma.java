package DomaciOsmiDecembar;

import java.util.Scanner;

public class NaizmenicnaSuma {
    public static void main(String[] args) {

//        3.[Naizmenicna suma] Korisnik unosi vrednost broja n (int) sa konzole.
//        Na standardni izlaz ispisati resenje izraza:
//        1 - 2 + 3 - .... (+/-) n.

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite pozitivan ceo broj: ");
        int n = sc.nextInt();
        int naizmenicnaSuma = 0;

        if(n < 0) {
            System.out.println("Greska! Niste uneli pozitivan broj.");
            System.out.print("Unesite pozitivan ceo broj: ");
            n = sc.nextInt();
        }

        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                naizmenicnaSuma += i;
            }
            else if(i % 2 == 0) {
                naizmenicnaSuma -= i;
            }
        }
        System.out.println(naizmenicnaSuma);

    }
}
