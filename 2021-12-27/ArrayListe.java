package Domaci_27_12_2021;

import java.util.ArrayList;

public class ArrayListe {
    public static void main(String[] args) {
        ArrayList<String> automobili = new ArrayList<String>();
        automobili.add("Fiat");
        automobili.add("Ford");
        automobili.add("Toyota");
        automobili.add("Nissan");
        automobili.add("Hyundai");
        automobili.add("Mazda");
        automobili.add("Mercedes");


        System.out.println(automobili.get(2));
        System.out.println("****************************************");
        automobili.set(0, "Skoda");
        System.out.println(automobili);
        System.out.println("****************************************");
        automobili.remove(4);
        System.out.println(automobili);
        System.out.println("****************************************");
        System.out.println(automobili.size());
        System.out.println("****************************************");
        for (int i = 0; i < automobili.size(); i++) {
            System.out.println((i + 1) + ". " + automobili.get(i));
        }
        System.out.println("****************************************");
        for (String auto : automobili) {
            System.out.println(auto);
        }

    }

}
