import java.util.Scanner;

public class Grananja2 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Unesite sirinu prostorije: ");
        double sirina = scanner.nextDouble();

        System.out.print("Unesite duzinu prostorije: ");
        double duzina = scanner.nextDouble();

        System.out.print("Unesite visinu prostorije: ");
        double visina = scanner.nextDouble();

        double okrecenaPovrsina = (2 * sirina + 2 * duzina) * visina + sirina * duzina;

        if(sirina <= 0) {
            System.out.print("Pogresan unos sirine!");
        }
        else if(duzina <= 0){
            System.out.print("Pogresan unos duzine!");
        }
        else if(visina <= 0) {
            System.out.print("Pogresan unos visine!");
        }
        else{
            System.out.print("Povrsina okrecene prostorije je: " + okrecenaPovrsina);
        }

    }
}
