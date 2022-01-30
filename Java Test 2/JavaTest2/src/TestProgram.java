import javax.lang.model.type.ArrayType;

public class TestProgram {
    public static void main(String[] args) {


        try {
            Broj prviBroj = new Broj("31", "65", "6133316", false);
            Broj drugiBroj = new Broj("381", "60", "7360009", false);

            Korisnik prviKorisnik = new Korisnik("Branko", "Stankovic", prviBroj);
            Korisnik drugiKorisnik = new Korisnik("Milena", "Moracanin", drugiBroj);

            prviKorisnik.posaljiPoruku(drugiBroj, "Hej Milena");
            drugiKorisnik.posaljiPoruku(prviBroj, "Hej Branko");
            prviKorisnik.posaljiPoruku(drugiBroj,"Kako si?");

            drugiKorisnik.pozovi(prviBroj, 120);
            prviKorisnik.pozovi(drugiBroj, 15);

            System.out.println(prviKorisnik);
            System.out.println(drugiKorisnik);

            System.out.println(prviKorisnik.cenaSvihUsluga());
            System.out.println(drugiKorisnik.cenaSvihUsluga());
        } catch (Exception a) {
            System.out.println(a.getMessage());
        }


//        Napisati test program (main metodu), u kojoj je potrebno
//                - napraviti 2 broja
//                - i dva korisnika sa tim brojevima
//                - zatim korinisci jedan drugom treba da salju neke poruke
//        i obavljaju neke pozive (min 3 poruke i 2 poziva)
//        - zatim treba ispisati oba korisnika
//        - zatim treba ispisati kolika je cena svih usluga za svakog korisnika.
    }
}
