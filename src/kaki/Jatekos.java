package kaki;

public abstract class Jatekos {
    protected Asztal asztal;

    public void setAsztal(Asztal a){
        this.asztal = a;
    }

    public void lep(){
        System.out.println("Kor: " + asztal.getKor() + ", Tet:" + asztal.getTet());
    }
    public void kiLepett(String a){
        asztal.setKiLepettEppen(a);
    }


}
