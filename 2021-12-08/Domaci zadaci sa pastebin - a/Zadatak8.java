package QAJavaZadaciZaVezbanje;

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {

//        8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
//        "Dobrodosao u {x}. razred, {ime} {prezime}",
//                pod pretpostavkom da je trenutna godina 2021.
//        Pretpostavimo da ima 12 razreda. A ako korisnik nije djak ispisati jednu odgovarajucu
//        poruku od:
//        "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite ime: ");
        String ime = sc.nextLine();
        System.out.print("Unesite prezime: ");
        String prezime = sc.nextLine();
        System.out.print("Unesite godinu rodjenja: ");
        int godinaRodjenja = sc.nextInt();
        int razred = 2021 - godinaRodjenja - 6;

        if(razred < 1) {
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje.");
        }
        else if(razred > 12) {
            System.out.println(ime + " " + prezime + " je zavrsio/la skolu.");
        }
        else {
            System.out.println("Dobrodoosao u " + razred + " razred " + ime + " " + prezime + ".");
        }
    }
}
