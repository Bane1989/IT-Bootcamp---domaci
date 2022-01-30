package JavaTest1;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        //Napisati program koji racuna potrosnju goriva
        //Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
        //Motor trosi 5 litara goriva na 100 kilometara,
        //Automobil trosi 7 litara na 100 kilometara,
        //Kombi trosi 11 litara na 100km,
        //Kamion trosi 15 litara na 100km
        //Nakon sto korisnik unese tip vozila treba pokrenuti ostatak programa kroz switch

        Scanner sc = new Scanner(System.in);
        System.out.println("Molim vas unesite tip vozila: ");
        String tipVozila = sc.next();
        System.out.println("Molim vas unesite distancu u kilometrima: ");
        double distanca = sc.nextDouble();
        int potrosnjaGorivaNa100km = 0;
        double potrosnjaGoriva = 0;


        switch(tipVozila) {
            case "Motor":
                potrosnjaGorivaNa100km = 5;
                potrosnjaGoriva = (potrosnjaGorivaNa100km / 100.0) * distanca;
                System.out.println(tipVozila + " na " + distanca + " potrosi " + potrosnjaGoriva + " litara goriva.");
                break;
            case "Automobil":
                potrosnjaGorivaNa100km = 7;
                potrosnjaGoriva = (potrosnjaGorivaNa100km / 100.0) * distanca;
                System.out.println(tipVozila + " na " + distanca + " potrosi " + potrosnjaGoriva + " litara goriva.");
                break;
            case "Kombi":
                potrosnjaGorivaNa100km = 11;
                potrosnjaGoriva = (potrosnjaGorivaNa100km / 100.0) * distanca;
                System.out.println(tipVozila + " na " + distanca + " potrosi " + potrosnjaGoriva + " litara goriva.");
                break;
            case "Kamion":
                potrosnjaGorivaNa100km = 15;
                potrosnjaGoriva = (potrosnjaGorivaNa100km / 100.0) * distanca;
                System.out.println(tipVozila + " na " + distanca + " potrosi " + potrosnjaGoriva + " litara goriva.");
                break;
            default:
                System.out.println("Uneli ste pogresan tip vozila");
        }
    }

}
