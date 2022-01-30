package DomaciTreciDecembar;

import java.util.Scanner;

public class PrviZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input: ");
        int prvi = sc.nextInt();
        int drugi = sc.nextInt();

        int sabiranje = prvi + drugi;
        int oduzimanje = prvi - drugi;
        int mnozenje = prvi * drugi;
        int deljenje = prvi / drugi;
        int modul = prvi % drugi;

        System.out.println("Output: ");
        System.out.println(sabiranje);
        System.out.println(oduzimanje);
        System.out.println(mnozenje);
        System.out.println(deljenje);
        System.out.println(modul);
    }
}
