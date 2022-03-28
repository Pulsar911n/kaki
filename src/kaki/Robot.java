package kaki;

public class Robot extends Jatekos{
    public String toSrting(){
        return "Robot";
    }
    public void lep(){
        System.out.println(this.toSrting() + ": " + asztal.getKor() + " kör");
    }
}
