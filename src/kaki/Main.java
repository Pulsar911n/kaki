package kaki;

public class Main {
    public static void main(String[] args) {
        Asztal kerekasztal = new Asztal(2.0,1,60.0);
        Kezdo kezdo = new Kezdo("Bela", 'A', 'Q');
        Robot r1 = new Robot('3', '5');
        Robot r2 = new Robot('A', 'J');
        Mester csen = new Mester(10, 'K', 'J');
        Nyuszi ny1 = new Nyuszi("kek", '2', 'A');
        Ember en = new Ember('6', 'K');

        kerekasztal.addJatekos(kezdo);
        kerekasztal.addJatekos(r1);
        kerekasztal.addJatekos(r2);
        kerekasztal.addJatekos(csen);
        kerekasztal.addJatekos(ny1);
        kerekasztal.addJatekos(en);
        try {
            for (int i = 0; i < 10; i++) {
                kerekasztal.kor();
            }
        }catch (Exception e){
            System.out.println("Jatek vege, győztes: " + kerekasztal.getKiLepettEppen());
        }



    }


}
