public class Poruka extends Usluga {

	private String tekstPoruke;

	public Poruka(Broj brojOd, Broj brojKa, String tekstPoruke) {
		super(brojOd, brojKa);
		this.tekstPoruke = tekstPoruke;
	}

	public String getTekstPoruke() {
		return tekstPoruke;
	}

	public void setTekstPoruke(String tekstPoruke) {
		this.tekstPoruke = tekstPoruke;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(brojOd.toString()).append(" -> ").append(brojKa.toString()).append(" ").append(tekstPoruke);

		return sb.toString();
	}

	@Override
	public double cenaUsluge() {
		double cenaSlanja = 0;
		if (brojOd != null && brojKa != null && brojOd != brojKa && brojOd.isFiksniBroj() == false
				&& brojKa.isFiksniBroj() == false) {
			cenaSlanja = 3;
		}
		return cenaSlanja;
	}
}
