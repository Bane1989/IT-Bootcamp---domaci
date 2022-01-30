public class Broj {

    private String kodDrzave;
    private String pozivniBroj;
    private String broj;
    private boolean fiksniBroj;
//    ima vrednost true ako je broj fiksni, a false ako je broj mobilni


    public Broj(String kodDrzave, String pozivniBroj, String broj, boolean fiksniBroj) throws Exception {


        try {
            proveriBroj(kodDrzave, pozivniBroj, broj);

        } catch(Exception e) {
            throw e;
        }

        this.kodDrzave = kodDrzave;
        this.pozivniBroj = pozivniBroj;
        this.broj = broj;
        this.fiksniBroj = fiksniBroj;
    }

    public String getKodDrzave() {
        return kodDrzave;
    }

    public void setKodDrzave(String kodDrzave) throws Exception{
        proveriBroj(kodDrzave, pozivniBroj, broj);
        this.kodDrzave = kodDrzave;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public void setPozivniBroj(String pozivniBroj) throws Exception {
        proveriBroj(kodDrzave, pozivniBroj, broj);
        this.pozivniBroj = pozivniBroj;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) throws Exception{
        proveriBroj(kodDrzave, pozivniBroj, broj);
        this.broj = broj;
    }

    public boolean isFiksniBroj() {
        return fiksniBroj;
    }

    public void setFiksniBroj(boolean fiksniBroj) {
        this.fiksniBroj = fiksniBroj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("+").append(kodDrzave).append(" ").append(pozivniBroj).append(" ").append(broj);

        return sb.toString();
    }

    private static boolean proveriDaLiStringSadrziSamoNumerike(String string) {
        boolean sadrzi = false;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                sadrzi = true;
            }
        }

        return sadrzi;
    }

    private static boolean proveriBroj(String kodDrzave, String pozivniBroj, String broj) throws Exception{
        boolean validan = false;
        if (kodDrzave != null && kodDrzave.length() == 2 && proveriDaLiStringSadrziSamoNumerike(kodDrzave) &&
        pozivniBroj != null && pozivniBroj.length() == 1 && proveriDaLiStringSadrziSamoNumerike(pozivniBroj) &&
        broj != null && broj.length() > 6 && broj.length() <= 7 && proveriDaLiStringSadrziSamoNumerike(broj)) {
            validan = true;
        } else {
            Exception greska = new Exception("Greska!");
            throw greska;
        }
        return validan;
    }

}
