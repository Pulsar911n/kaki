package kaki;

public class Main {
    public static void main(String[] args) {
        Asztal kerekasztal = new Asztal(2.0,1,60.0);
        Kezdo kezdo = new Kezdo("Bela");
        Robot r1 = new Robot();
        Robot r2 = new Robot();
        Mester csen = new Mester(10);
        Nyuszi ny1 = new Nyuszi("kek");

        kerekasztal.addJatekos(kezdo);
        kerekasztal.addJatekos(r1);
        kerekasztal.addJatekos(r2);
        kerekasztal.addJatekos(csen);
        kerekasztal.addJatekos(ny1);
        try {
            for (int i = 0; i < 10; i++) {
                kerekasztal.kor();
            }
        }catch (Exception e){
            System.out.println("Jatek vege");
        }



    }


}
