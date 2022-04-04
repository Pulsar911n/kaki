package kaki;
import java.util.Scanner;
public class Ember extends Jatekos{
    public Ember(char a, char b){
        super(a, b);
    }
    @Override
    public void lep() {
        System.out.println("Emberi játékos: " + super.toString());
        Scanner s = new Scanner(System.in);
        System.out.println("Menniyvel emeljen?");
        int emberTet = s.nextInt();
        asztal.emel(emberTet);
        if (emberTet != 0){
            super.kiLepett("Ember");
        }
    }
}
