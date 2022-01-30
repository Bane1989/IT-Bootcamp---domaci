package Domaci_24_12_saPastebina;

import com.sun.source.tree.IfTree;

import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }

    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        this.dnevnik = new ArrayList<Ucenik>();
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }

//    Napisati metod upisiUcenika(Ucenik u) koja dodaje ucenika {u} u dnevnik.

    public void upisiUcenika(Ucenik u) {
        dnevnik.add(u);
    }

//    Napisati metod upisiUcenika(Ucenik u, int redniBroj) koji dodaje ucenika {u} u
//    dnevnik na redni broj {redniBroj}

    public void upisiUcenika(Ucenik ucenik, int index) {
        dnevnik.add(index, ucenik);
    }

//    Napisati metod ispisiUcenika(Ucenik u) koja brise ucenika {u} iz dnevnika.

    public void ispisiUcenika(Ucenik ucenik) {
        dnevnik.remove(ucenik);
    }

//    Napisati metod ispisiUcenika(int i) koja brise ucenika na poziciji {i} u dnevniku.

    public void ispisiUcenika(int index) {
        dnevnik.remove(index);
    }

//    Napisati metod pogledajOcene(Ucenik u) koja ispisuje sve ocene ucenika {u}.

    public void pogledajOcene(Ucenik ucenik) {
        for (Ucenik u : dnevnik) {
            System.out.println(u.ocene);
            System.out.println("\n");
        }
    }

//    Napisati metod pogledajOcene(int i) koja ispisuje sve ocene ucenika na poziciji {i} u dnevniku.

    public void pogledajOcene(int index) {
        Ucenik u = dnevnik.get(index);
        for (Integer ocene : u.ocene) {
            System.out.println(ocene);
        }
    }

//    Napisati metod prosecnaOcena(Ucenik u) koja ispisuje prosecnu ocenu ucenika {u}.

    public void prosecnaOcena(Ucenik ucenik) {
        double zbir = 0;
        for (Integer u : ucenik.ocene) {
            zbir += u;
        }
        System.out.println("Prosecna ocena je " + zbir / ucenik.ocene.size());
    }

//    Napisati metod prosecnaOcena(int i) koja ispisuje prosecnu ocenu ucenika na poziciji {i} u dnevniku.

    public void prosecnaOcena(int index) {
        double zbir = 0;
        for (Integer u : dnevnik.get(index).ocene) {
            zbir += u;
        }
        System.out.println("Prosecna ocena je " + zbir / dnevnik.get(index).ocene.size());
    }

//    Napisati metod prosecnaOcenaOdeljenja() koja vraca prosecnu ocenu celog odeljenja
//    (0, ako nema ucenika u odeljenju).

    public double prosecnaOcenaOdeljenja() {
        double prosekCelogOdeljenja = 0;
        double prosekUcenika;
        if (dnevnik.size() == 0) {
            prosekCelogOdeljenja = 0;
        } else {
            for (Ucenik u : dnevnik) {
                prosekUcenika = u.prosek(u.ocene);
                prosekCelogOdeljenja += prosekUcenika / dnevnik.size();
            }
        }

        return prosekCelogOdeljenja;
    }

//    Napisati metod opisnaOcena(Ucenik u) koja ispisuje:

    public void opisnaOcena(Ucenik ucenik) {
        ArrayList<Integer> nizOcena = ucenik.ocene;
        double prosekOcena = ucenik.prosek(ucenik.ocene);
        if (ucenik.ocene.contains(1)) {
            System.out.println("Nedovoljan");
        } else if (prosekOcena >= 4.5) {
            System.out.println("Odlican");
        } else if (prosekOcena >= 3.5) {
            System.out.println("Vrlo dobar");
        } else if (prosekOcena >= 2.5) {
            System.out.println("dobar");
        } else if (prosekOcena >= 2.0) {
            System.out.println("Dovoljan");
        }
    }

//    Napisati metod izlistajDnevnik() koja vraca String oblika:
//    {ime} i {prezime} ima ocene:
//    {ocene}


    public String izlistajDnevnik() {
        StringBuilder sb = new StringBuilder();

        for (Ucenik u : dnevnik) {
            sb.append(u.getIme());
            sb.append(" i ");
            sb.append(u.getPrezime());
            sb.append(" ima ocene:");
            sb.append("\n");
            for (Integer ocena : u.ocene) {
                sb.append(ocena);
                sb.append("\n");
            }
        }

        return sb.toString();
    }

//    Napisati metod String velicinaOdeljenja() koja vraca odgovarajucu poruku:

    public String velicinaOdeljenja() {
        StringBuilder sb = new StringBuilder();
        if (dnevnik.size() >= 25) {
            sb.append("Veliko odeljenje");
        } else if (dnevnik.size() > 15 && dnevnik.size() < 25) {
            sb.append("Srednje odeljenje");
        } else if (dnevnik.size() < 15) {
            sb.append("Malo odeljenje");
        }

        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(oznaka);
        sb.append(" odeljenja ima djake:");
        sb.append("\n");
        if (dnevnik.size() == 0) {
            sb.append("Nema djaka.");
            sb.append("\n");
        } else {
            for (Ucenik u : dnevnik) {
                sb.append(u.getIme());
                sb.append(" ");
                sb.append(u.getPrezime());
                sb.append("\n");
            }
        }


        return sb.toString();
    }


}
