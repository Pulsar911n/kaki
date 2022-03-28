package kaki;

public class Jatekos {
    protected Asztal asztal;

    public void setAsztal(Asztal a){
        this.asztal = a;
    }
    public void lep(){
        System.out.println("Kör: " + asztal.getKor() + ", Tét:" + asztal.getTet());
    }

}
