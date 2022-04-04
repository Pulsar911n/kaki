package kaki;
import java.util.Random;
public class Robot extends Jatekos{
    private static int sz = 1;
    private int id;
    public Robot(char a, char b){
        super(a,b);
        this.id = sz;
        sz++;

    }
    public String toSrting(){
        return "Robot" + id;
    }
    public void lep(){
        System.out.println(this.toSrting() + ": " + super.toString() + ", passzolt");

    }
}
