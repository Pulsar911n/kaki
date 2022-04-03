package kaki;
import java.util.Scanner;
public class Ember extends Jatekos{
    @Override
    public void lep() {
        System.out.println("Emberi játékos: ");
        Scanner s = new Scanner(System.in);
        System.out.println("Menniyvel emeljen?");
        int emberTet = s.nextInt();
        asztal.emel(emberTet);
        super.kiLepett("Ember");
    }
}
