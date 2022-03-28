package kaki;

public class Main {
    public static void main(String[] args) {
        Asztal kerekasztal = new Asztal(2.0,1,60.0);
        Jatekos Sanyi = new Jatekos();
        Jatekos Andi = new Jatekos();
        Jatekos Geci = new Jatekos();

        kerekasztal.addJatekos(Sanyi);
        kerekasztal.addJatekos(Andi);
        kerekasztal.addJatekos(Geci);


    }


}
