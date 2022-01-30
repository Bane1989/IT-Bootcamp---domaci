package Glumci_22_12;

import java.util.Scanner;

public class TestGlumci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Glumci prvi = new Glumci("Harvey", "Keitel", 'm', 82 , 10, false);
        Glumci drugi = new Glumci("Snezana", "Savic", 'f', 68 , 10, true);

        System.out.println(prvi);
        System.out.println(drugi);
    }
}
