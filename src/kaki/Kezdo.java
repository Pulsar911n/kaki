package kaki;

public class Kezdo extends Jatekos{
    private String nev;
    public Kezdo(String nev){
        this.nev = nev;
    }
    public String toString(){
        return "Neve: " + nev;
    }
    public void lep(){
        this.toString();
        super.lep();
        if (asztal.getKor() % 2 == 0){
            System.out.println("passzol");
        }
        else{
            asztal.emel(1.0);
        }
    }
}