import java.util.Scanner;

public class Sintaksa1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Unesite sirinu prostorije: ");
        double sirina = scanner.nextDouble();

        System.out.print("Unesite duzinu prostorije: ");
        double duzina = scanner.nextDouble();

        System.out.print("Unesite visinu prostorije: ");
        double visina = scanner.nextDouble();

        double okrecenaPovrsina = (2 * sirina + 2 * duzina) * visina + sirina * duzina;
        System.out.print("Povrsina okrecene prostorije je: " + okrecenaPovrsina);

    }
}
