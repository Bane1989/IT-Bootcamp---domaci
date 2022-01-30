import java.util.Scanner;

public class Grananja1 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Unesite neki broj: ");
        int paranBroj = scanner.nextInt();

        if(paranBroj % 2 == 0) {
            System.out.print("Broj je paran!");
        }
        else {
            System.out.print("Broj je neparan!");
        }

    }
}
