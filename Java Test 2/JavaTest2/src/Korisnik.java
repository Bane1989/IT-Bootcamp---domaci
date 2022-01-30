import java.util.ArrayList;

public class Korisnik {

	protected int NextID = 1;
	private int id;
	private String ime;
	private String prezime;
	private Broj broj;
	private ArrayList<Usluga> istorijaUsluga;

	public Korisnik(String ime, String prezime, Broj broj) {
		this.id = NextID;
		NextID++;
		this.ime = ime;
		this.prezime = prezime;
		this.broj = broj;
		this.istorijaUsluga = new ArrayList<>();
	}

	public int getNextID() {
		return NextID;
	}

	public void setNextID(int nextID) {
		NextID = nextID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public Broj getBroj() {
		return broj;
	}

	public void setBroj(Broj broj) {
		this.broj = broj;
	}

	public ArrayList<Usluga> getIstorijaUsluga() {
		return istorijaUsluga;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime).append(" ").append(prezime).append(" ").append(broj).append("\n");
		for (Usluga u : istorijaUsluga) {
			sb.append(u).append("\n");
		}

		return sb.toString();
	}

	public void posaljiPoruku(Broj poslatiNa, String poruka) {
		Poruka nova = new Poruka(broj, poslatiNa, poruka);
		istorijaUsluga.add(nova);


	}

	public void pozovi(Broj pozvati, int trajanjePoziva) {
		Poziv novi = new Poziv(broj, pozvati, trajanjePoziva);
		istorijaUsluga.add(novi);
	}

	public double cenaSvihUsluga() {
		double cena = 0;

		for (Usluga u : istorijaUsluga) {
			cena += u.cenaUsluge();
		}
		return cena;
	}

//    Zoran Milicevic +381 63 1234567
//    Istorija usluga:
//            +381 63 1234567 -> +381 63 4567123 Cao Strahinja!
//            +381 63 1234567 -> +381 63 4567123 2:34
//            - napisati metodu posaljiPoruku, koja prima broj na koji treba posalti poruku i tekst poruke.
//	Metoda kreira poruku i stavlja je u niz istorija usluga.
//            - napisati metodu pozovi, koja prima broj koji treba pozvati i trajanje poziva u sekundama.
//	Metoda kreira poziv i stavlja ga u niz istorija usluga.
//            - napisati metodu cenaSvihUsluga koja vraca ukupnu cenu svih usluga (double) koje je korisnik
//	obavio, tako sto prodje kroz niz istorija usluga i sumira cene svih usluga koje se nalaze u tom nizu
}
