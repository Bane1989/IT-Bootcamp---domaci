package DomaciTreciDecembar;

import java.util.Scanner;

public class TreciZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite pozitivan ceo broj: ");
        int n = sc.nextInt();
        int faktorijel = n;

        for(int i = 1; i < n; i++){
            faktorijel *= n - i;
        }
        System.out.println(faktorijel);
    }
}
