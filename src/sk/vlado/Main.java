package sk.vlado;

public class Main {

    public static void main(String[] args) {

    Ruka ruka = new Ruka(5);

        System.out.println(ruka.pocetPrstov);
        ruka.odstranPocetPrstov();
        ruka.odstranPocetPrstov();
        ruka.odstranPocetPrstov();
        ruka.odstranPocetPrstov();
        ruka.odstranPocetPrstov();
        System.out.println(ruka.pocetPrstov);
    }


}
