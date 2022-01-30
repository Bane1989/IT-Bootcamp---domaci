package JavaTest1;

public class Zadatak1 {
    public static void main(String[] args) {

        //Napisite niz od 10 elemenata i koristeci FOR petlju pronadjite najveci broj u nizu
        //niz je tipa int
        //Primer niza {3, 5, 4, 11, -1, 23, 5, 43, 0, 5}
        //Primer ispisa resenja u konzoli:
        //Najveci broj u nizu je 43

        int[] niz = {5, 1, 7, 58, 47, -555, 123, 7630, 0, 88};
        int najveciBroj =niz[0];

        for (int i = 1; i < niz.length; i++) {
            if(niz[i] > najveciBroj) {
                najveciBroj = niz[i];
            }
        }

        System.out.println("Najveci broj u nizu je " + najveciBroj);

    }
}
