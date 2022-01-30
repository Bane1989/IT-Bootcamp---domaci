package DomaciTreciDecembar;

import java.util.Scanner;

public class DrugiZadatak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite celobrojan nenegativan broj: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            if(i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + ": FizzBuzz");
            }
            else if(i % 5 == 0) {
                System.out.println(i + ": Buzz");
            }
            else if(i % 3 == 0) {
                System.out.println(i + ": Fizz");
            }
            else {
                System.out.println(i + ":");
            }
        }
    }
}
