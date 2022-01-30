public class Poziv extends Usluga {

    public int trajanjeUSekundama;

    public Poziv(Broj brojOd, Broj brojKa, int trajanjeUSekundama) {
        super(brojOd, brojKa);
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    public int getTrajanjeUSekundama() {
        return trajanjeUSekundama;
    }

    public void setTrajanjeUSekundama(int trajanjeUSekundama) {
        this.trajanjeUSekundama = trajanjeUSekundama;
    }

    public String toString() {
        int trajanjeUMinutima = trajanjeUSekundama / 60;
        int trajanjeUSekundamaOdMinuta = trajanjeUSekundama % 60;
        StringBuilder sb = new StringBuilder();
        sb.append(brojOd.toString()).append(" -> ").append(brojKa.toString()).
                append(trajanjeUMinutima).append(" : ").append(trajanjeUSekundamaOdMinuta);

        return sb.toString();
    }

    @Override
    public double cenaUsluge() {
        double cenaPoziva = 0;
        int trajanjeUMinutima = trajanjeUSekundama / 60;
        int trajanjeUSekundamaOdMinuta = trajanjeUSekundama % 60;
        if (brojOd != null && brojKa != null && brojOd != brojKa) {
            if (trajanjeUMinutima > 0 && trajanjeUSekundamaOdMinuta > 0) {
                cenaPoziva = trajanjeUMinutima * 10;
            }
        }
        return cenaPoziva;
    }


}
