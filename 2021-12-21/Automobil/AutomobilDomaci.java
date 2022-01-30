package Domaci_21_12;

public class AutomobilDomaci {

    private String marka;
    private String model;
    private int serijskiBroj;
    private Osoba vlasnik;

    public AutomobilDomaci(String marka, String model, int serijskiBroj) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
    }

    public AutomobilDomaci(String marka, String model, int serijskiBroj, Osoba vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = vlasnik;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Marka automobila je ");
        sb.append(marka);
        sb.append("\n");
        sb.append("Model automobila je ");
        sb.append(model);
        sb.append("\n");
        sb.append("Serijski broj automobila je");
        sb.append(serijskiBroj);
        sb.append("\n");
        if (vlasnik == null) {
            sb.append("Automobil nema vlasnika.");
        }
        else {
            sb.append("Vlasnik ovog automobila je ");
            sb.append(vlasnik);
            sb.append("\n");
        }
        return sb.toString();


//        String stringKojiVracamo;
//        stringKojiVracamo = "Marka automobila je " + marka + "\n";
//        stringKojiVracamo += "Model automobila je " + model + "\n";
//        stringKojiVracamo += "Serijski broj automobila je" + serijskiBroj + "\n";
//        if (vlasnik == null) {
//            stringKojiVracamo += "Automobil nema vlasnika.";
//        }
//        else {
//            stringKojiVracamo += "Vlasnik ovog automobila je " + vlasnik + "\n";
//        }
//        return stringKojiVracamo;
    }

}
