package Domaci_24_12_saPastebina;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
	private String prezime;
	ArrayList<Integer> ocene;

	public Ucenik(String ime, String prezime, ArrayList<Integer> ocene) {
		this.ime = ime;
		this.prezime = prezime;
		this.ocene = ocene;
	}

	public Ucenik(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
		this.ocene = new ArrayList<Integer>();
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

	public ArrayList<Integer> getOcene() {
		return ocene;
	}

	public void setOcene(ArrayList<Integer> ocene) {
		this.ocene = ocene;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime);
		sb.append(" i ");
		sb.append(prezime);
		sb.append(" ima ocene:");
		sb.append("\n");
		for (int ocena : ocene) {
			sb.append(ocena);
			sb.append("\n");
		}

		return sb.toString();
	}

	public Double prosek(ArrayList<Integer> ocene) {
		double zbirOcena = 0;
		for (Integer ocena : ocene) {
			zbirOcena += ocena;
		}
		return zbirOcena / ocene.size();
	}
}
