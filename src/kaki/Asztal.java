package kaki;

public class Asztal {
    private Jatekos[] jatekosok;
    private double tet;
    private int kor;
    private double goal;

    public Asztal(double tet, int kor, double goal){
        this.tet = tet;
        this.kor = kor;
        this.goal = goal;
    }
    public void ujJatek(){
        tet = 0;
        kor = 0;
        goal = Math.random() * 99 + 1;
    }
    public void addJatekos(Jatekos j){
        j.setAsztal(this);
    }
    public int getKor(){return kor;}
    public double getTet(){return tet;}

    public void emel(double d){
        tet += d;
    }
    public void kor(){
        for (Jatekos i: jatekosok){
            i.lep();
        }
        System.out.println("Aktuális tét:" + tet);
    }
}
