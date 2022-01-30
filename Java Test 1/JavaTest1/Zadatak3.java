package JavaTest1;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        //Napisite program koji, koristeci WHILE petlju, racuna zbir unetih brojeva
        // (svi brojevi su tipa int), sve dok korisnik ne unese 0
        //Primer ispisa resenja:
        //Molim vas unesite 1. broj
        //4
        //Trenutni zbir je 4
        //Molim vas unesite 2. broj
        //5
        //Trenutni zbir je 9
        //Molim vas unesite 3. broj
        //0
        //Uneli ste 0 Kraj programa

        Scanner sc = new Scanner(System.in);

        int broj =sc.nextInt();
         int zbir = 0;
         while (broj != 0) {
             zbir += sc.nextInt();
            System.out.println("Trenutni zbir je " + zbir);
        }

    }
}
