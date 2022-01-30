package Grad_22_12;

public class Grad {
	private String ime;
    private int brojStanovnika;
    private String drzava;

	public Grad(String ime, int brojStanovnika, String drzava) {
		this.ime = ime;
		this.brojStanovnika = brojStanovnika;
		this.drzava = drzava;
	}

	public Grad(String ime, String drzava) {
		this.ime = ime;
		this.drzava = drzava;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getBrojStanovnika() {
		return brojStanovnika;
	}

	public void setBrojStanovnika(int brojStanovnika) {
		this.brojStanovnika = brojStanovnika;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ime grada: ");
		sb.append(ime);
		sb.append("\n");
		sb.append("Broj stanovnika: ");
		sb.append(brojStanovnika);
		sb.append("\n");
		sb.append("Drzava: ");
		sb.append(drzava);
		return sb.toString();
	}


}
