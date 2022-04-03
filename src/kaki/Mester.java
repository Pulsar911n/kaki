package kaki;

public class Mester extends Jatekos{
    private int fokozat;
    public Mester(int fokozat){
        this.fokozat = fokozat;
    }
    public String toString(){
        return "Mester: " + fokozat +"-es";
    }
    public void lep(){
        double sajattet = asztal.getTet() / 100 * fokozat;
        asztal.emel(sajattet);
        System.out.println(this.toString() + ", emelt: " + sajattet);
        super.kiLepett("Mester");
    }
}
