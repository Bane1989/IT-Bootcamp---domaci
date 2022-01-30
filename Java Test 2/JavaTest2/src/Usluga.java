public abstract class Usluga {

	protected Broj brojOd;
	protected Broj brojKa;


    public Usluga(Broj brojOd, Broj brojKa) {
        this.brojOd = brojOd;
        this.brojKa = brojKa;
    }

    public Broj getBrojOd() {
        return brojOd;
    }

    public Broj getBrojKa() {
        return brojKa;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(brojOd).append(" -> ").append(brojKa);
        return sb.toString();
    }

    public abstract double cenaUsluge();


}
