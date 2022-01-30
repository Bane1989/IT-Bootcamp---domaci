package QAJavaZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {

//        7. Napraviti program koji za unet mesec i dan ispisuje odgovarajuci horoskopski znak.

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite dan: ");
        int dan = sc.nextInt();
        System.out.print("Unesite mesec: ");
        int mesec = sc.nextInt();

        if((dan >= 21 && mesec == 3) || (dan <= 20 && mesec == 4)){
            System.out.println("Vas hroskopski znak je Ovan");
        }
        else if((dan >= 21 && mesec == 4) || (dan <= 21 && mesec == 5)){
            System.out.println("Vas horoskopski znak je Bik");
        }
        else if((dan >= 22 && mesec == 5) || (dan <= 21 && mesec == 6)) {
            System.out.println("Vas horoskopski znak je Blizanac");
        }
        else if((dan >= 22 && mesec == 6) || (dan <= 22 && mesec == 7)) {
            System.out.println("Vas horoskopski znak je Rak");
        }
        else if((dan >= 23 && mesec == 7) || (dan <= 22 && mesec == 8)) {
            System.out.println("Vas horoskopski znak je Lav");
        }
        else if((dan >= 23 && mesec == 8) || (dan <= 22 && mesec == 9)) {
            System.out.println("Vas horoskopski znak je Devica");
        }
        else if((dan >= 23 && mesec == 9) || (dan <= 23 && mesec == 10)) {
            System.out.println("Vas horoskopski znak je Vaga");
        }
        else if((dan >= 24 && mesec == 10) || (dan <= 22 && mesec == 11)) {
            System.out.println("Vas horoskopski znak je Skorpija");
        }
        else if((dan >= 23 && mesec == 11) || (dan <= 21 && mesec == 12)) {
            System.out.println("Vas horoskopski znak je Strelac");
        }
        else if((dan >= 22 && mesec == 12) || (dan <= 20 && mesec == 1)) {
            System.out.println("Vas horoskposki znak je Jarac");
        }
        else if((dan >= 21 && mesec == 1) || (dan <= 19 && mesec == 2)) {
            System.out.println("Vas horoskopski znak je Vodolija");
        }
        else if((dan >= 20 && mesec == 2) || (dan <= 20 && mesec == 3)) {
            System.out.println("Vas horoskopski znak je Ribe");
        }
    }
}
