package Grad_22_12;


import Domaci_21_12.Osoba;
import Automobil_21_12.Automobil;

import java.util.ArrayList;

public class Putovanje {
    private Grad destinacija;
    private Osoba vodjaPuta;
    private Automobil vozilo;
    private double udaljenostKm;
    private ArrayList<Osoba> pravljenjeOsobe;

    public Putovanje(Grad destinacija,Osoba vodjaPuta , Automobil vozilo, double udaljenostKm) {
        this.destinacija = destinacija;
        if (vodjaPuta == null) {
            System.out.println("Putovanje nema vodju puta.");
        } else {
            this.vodjaPuta = vodjaPuta;
        }
        this.vozilo = vozilo;
        if (udaljenostKm < 0) {
            System.out.println("Greska, udaljenost ne moze biti manja od 0.");
        } else {
            this.udaljenostKm = udaljenostKm;
        }
        this.pravljenjeOsobe = new ArrayList<Osoba>();
    }

    public Putovanje(Grad destinacija, Automobil vozilo, double udaljenostKm) {
        this.destinacija = destinacija;
        this.vozilo = vozilo;
        if (udaljenostKm < 0) {
            System.out.println("Greska, udaljenost ne moze biti manja od 0.");
        } else {
            this.udaljenostKm = udaljenostKm;
        }
        this.pravljenjeOsobe = new ArrayList<Osoba>();
    }

    public Grad getDestinacija() {
        return destinacija;
    }

    public void setDestinacija(Grad destinacija) {
        this.destinacija = destinacija;
    }

    public Osoba getVodjaPuta() {
        return vodjaPuta;
    }

    public void setVodjaPuta(Osoba vodjaPuta) {
        this.vodjaPuta = vodjaPuta;
    }

    public Automobil getVozilo() {
        return vozilo;
    }

    public void setVozilo(Automobil vozilo) {
        this.vozilo = vozilo;
    }

    public double getUdaljenostKm() {
        return udaljenostKm;
    }

    public void setUdaljenostKm(double udaljenostKm) {
        if (udaljenostKm < 0) {
            System.out.println("Greska, udaljenost ne moze biti manja od 0.");
        } else {
            this.udaljenostKm = udaljenostKm;
        }    }

    public ArrayList<Osoba> getPravljenjeOsobe() {
        return pravljenjeOsobe;
    }

    public void setPravljenjeOsobe(ArrayList<Osoba> pravljenjeOsobe) {
        this.pravljenjeOsobe = pravljenjeOsobe;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Destinacija: ");
        sb.append(destinacija.getIme());
        sb.append(", ");
        sb.append(destinacija.getDrzava());
        sb.append("\n");
        sb.append("Vodja puta je: ");
        sb.append(vodjaPuta.getIme());
        sb.append(" ");
        sb.append(vodjaPuta.getPrezime());
        sb.append("\n");
        sb.append("Putuje se automobilom: ");
        sb.append(vozilo.getMarka());
        sb.append(", ");
        sb.append(vozilo.getGodiste());
        sb.append(", ");
        sb.append(vozilo.getKilometraza());
        sb.append("\n");
        sb.append("Udaljenost destinacije je: ");
        sb.append(udaljenostKm);
        sb.append(" km");
        sb.append("\n");
        sb.append("Prijavljene osobe su: \n");
        if (pravljenjeOsobe.size() == 0) {
            sb.append("Nema prjavljenih osoba.");
        } else {
            for(Osoba osoba : pravljenjeOsobe){
                sb.append(osoba.getIme());
                sb.append(" ");
                sb.append(osoba.getPrezime());
                sb.append("\n");
            }
        }


        return sb.toString();

    }

    public void prijava (Osoba dodataOsoba) {
        pravljenjeOsobe.add(dodataOsoba);
    }

    public double prosecnaBrzina(double prosecnaBrzina) {
        double satiPotrebnoDaSeStigne = udaljenostKm / prosecnaBrzina;
        return satiPotrebnoDaSeStigne;
    }

    public void odjava(Osoba odjavaljenaOsoba) {
        pravljenjeOsobe.remove(odjavaljenaOsoba);
    }
}

