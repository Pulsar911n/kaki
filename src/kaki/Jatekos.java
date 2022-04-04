package kaki;

public abstract class Jatekos {
    protected Asztal asztal;
    private char lap1;
    private char lap2;
    public Jatekos(char a, char b){
        lap1 = a;
        lap2 = b;
    }
    public void setAsztal(Asztal a){
        this.asztal = a;
    }
    public char getLap1(){return lap1;}
    public char getLap2(){return lap2;}
    public String toString(){
        return "Lapok: " + this.getLap1() + ";" + this.getLap2();
    }
    public void lep(){

    }
    public void kiLepett(String a){
        asztal.setKiLepettEppen(a);
    }


}
