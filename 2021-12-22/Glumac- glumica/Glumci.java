package Glumci_22_12;

public class Glumci {
    private String ime;
    private String prezime;
    private char pol;
    private int godine;
    private double ocena;
    private boolean daLiJeIzSrbije;

    public Glumci(String ime, String prezime, char pol, int godine, double ocena, boolean daLiJeIzSrbije) {
        this.ime = ime;
        this.prezime = prezime;
        switch (pol) {
            case 'm':
            case 'M':
            case 'f':
            case 'F':
                this.pol = pol;
                break;
            default:
                System.out.println("Greska! Uneli ste nepostojeci pol. Pol se oznacava sa M/m ili F/f.");
                break;
        }

//        if (pol == 'm' || pol == 'M' || pol == 'f' || pol == 'F' ) {
//            this.pol = pol;
//        } else {
//            System.out.println("Greska! Uneli ste nepostojeci pol. Pol se oznacava sa M/m ili F/f.");
//        }
        if(godine < 12) {
            System.out.println("Morate biti stariji od 12 godina da bi ste ucestvovali u anketi.");
        } else {
            this.godine = godine;
        }
        if (ocena < 1) {
            System.out.println("Greska! Nije moguce dodeliti glumcu ocenu manju od 1.");

        } else if (ocena > 10) {
            System.out.println("Greska! Nije moguce dodeliti glumcu ocenu vecu od 10.");
        } else {
            this.ocena = ocena;
        }
        this. daLiJeIzSrbije = daLiJeIzSrbije;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public char getPol() {
        return pol;
    }

    public void setPol(char pol) {
        if (pol == 'm' || pol == 'M' || pol == 'f' || pol == 'F' ) {
            this.pol = pol;
        } else {
            System.out.println("Greska! Uneli ste nepostojeci pol. Pol se oznacava sa M/m ili F/f.");
        }
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        if(godine < 12) {
            System.out.println("Morate biti stariji od 12 godina da bi ste ucestvovali u anketi.");
        } else {
            this.godine = godine;
        }
    }

    public double getOcena() {
        return ocena;
    }

    public void setOcena(double ocena) {
        if (ocena < 1) {
            System.out.println("Greska! Nije moguce dodeliti glumcu ocenu manju od 1.");
        } else if (ocena > 10) {
            System.out.println("Greska! Nije moguce dodeliti glumcu ocenu vecu od 10.");
        } else {
            this.ocena = ocena;
        }
    }

    public boolean isDaLiJeIzSrbije() {
        return daLiJeIzSrbije;
    }

    public void setDaLiJeIzSrbije(boolean daLiJeIzSrbije) {
        this.daLiJeIzSrbije = daLiJeIzSrbije;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (pol == 'M' || pol == 'm') {
            sb.append("Ime i prezime glumca je ");
        } else {
            sb.append("Ime i prezime glumice je ");
        }
        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
        sb.append(", ");
        if (pol == 'M' || pol == 'm') {
            sb.append("muskarac je u pitanju, ");
        } else {
            sb.append("osoba je zenskog pola, ");
        }
        sb.append("starosti ");
        sb.append(godine);
        sb.append(". godina. ");
        sb.append("Ocena koju dodeljujem je ");
        sb.append(ocena);
        sb.append(" iako ");
        if (daLiJeIzSrbije == true) {
            sb.append("je iz Srbije.");
        } else {
            sb.append("nije iz Srbije");
        }
        return sb.toString();
    }
}
