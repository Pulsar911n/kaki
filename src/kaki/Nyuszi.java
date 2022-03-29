package kaki;

public class Nyuszi extends Jatekos{
    private String szin;
    public Nyuszi(String szin){
        this.szin = szin;
    }
    public String toString(){
        return  "Szine: " + szin;
    }
    public void lep(){

        if (asztal.getTet() <= 50){
            asztal.emel(5);
            System.out.println(this.toString() + ", emelt: 5-tel");
        }
        else{
            System.out.println(this.toString() + ", Huha!");
        }
    }
}
