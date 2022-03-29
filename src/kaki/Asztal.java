package kaki;
import java.util.ArrayList;
public class Asztal {
    private ArrayList<Jatekos> jatekosok;
    private double tet;
    private int kor;
    private double goal;


    public Asztal(double tet, int kor, double goal){
        this.tet = tet;
        this.kor = kor;
        this.goal = goal;
        this.jatekosok = new ArrayList<Jatekos>();
    }
    public void ujJatek(){
        tet = 0;
        kor = 0;
        goal = Math.random() * 99 + 1;
    }
    public void addJatekos(Jatekos j)
    {
        j.setAsztal(this);
        if(!jatekosok.contains(j)){
            jatekosok.add(j);
        }

    }
    public int getKor(){return kor;}
    public double getTet(){return tet;}

    public void emel(double d){
        tet += d;
    }
    public void kor() throws Exception{
        System.out.println("Hatar:" + goal);
        for (Jatekos i: jatekosok){
            i.lep();

        }
        System.out.println("Kor vege, aktualis tet: " + tet);
        if (tet > goal){
            this.ujJatek();
            throw new Exception();
        }
        kor += 1;

    }
}
