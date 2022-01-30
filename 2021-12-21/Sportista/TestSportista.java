package Domaci_21_12;

public class TestSportista {
    public static void main(String[] args) {
        Sportista prvi = new Sportista("Sinisa Mihailovic", "Fudbal", "Crvena Zvezda", 7);
        Sportista drugi = new Sportista("Dejan Stankovic", "Fudbal", "Crvena Zvezda", 5);
        Sportista treci = new Sportista("Dejan Tomasevic", "Kosarka", "Crvena Zvezda", 14);

        System.out.println("Prvi sportista je " + prvi.getImeIPrezime() + ", njegov sport je " + prvi.getSportKojimSeBavi());
        System.out.println("Drugi sportista je " + drugi.getImeIPrezime() + ", njegov sport je " + drugi.getSportKojimSeBavi());
        System.out.println("Treci sportista je " + treci.getImeIPrezime() + ", njegov sport je " + treci.getSportKojimSeBavi());

        System.out.println(prvi.getKlubZaKojiIgra());

        prvi.setKlubZaKojiIgra("Lacio");

        System.out.println(prvi.getKlubZaKojiIgra());



    }
}
