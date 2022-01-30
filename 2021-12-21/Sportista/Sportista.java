package Domaci_21_12;

public class Sportista {
    private String imeIPrezime;
    private String sportKojimSeBavi;
    private String klubZaKojiIgra;
    private int brojNaDresu;

    public Sportista(String imeIPrezime, String sportKojimSeBavi, String klubZaKojiIgra, int brojNaDresu) {
        this.imeIPrezime = imeIPrezime;
        this.sportKojimSeBavi = sportKojimSeBavi;
        this.klubZaKojiIgra = klubZaKojiIgra;
        this.brojNaDresu = brojNaDresu;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getSportKojimSeBavi() {
        return sportKojimSeBavi;
    }

    public String getKlubZaKojiIgra() {
        return klubZaKojiIgra;
    }

    public void setKlubZaKojiIgra(String klubZaKojiIgra) {
        this.klubZaKojiIgra = klubZaKojiIgra;
    }

    public int getBrojNaDresu() {
        return brojNaDresu;
    }
}
