package sk.vlado;

public class Ruka {

    int pocetPrstov = 10;
    char znak = 'a';
    char poleZnakov[] = {'a','b','c'};
    char poleZnakov2[] = new char[3];

    public Ruka(int pocetPrstov2){
        this.pocetPrstov=pocetPrstov2;
    }

    public void odstranPocetPrstov(){

        if (this.pocetPrstov >0 ){
        System.out.println("au odstranil som si prst");
        this.pocetPrstov=this.pocetPrstov-2;


    } else {
            System.out.println("uz nemam ziadne");}
    };



}