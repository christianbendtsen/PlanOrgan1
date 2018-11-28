import java.util.ArrayList;
import java.util.Scanner;
public class Personale {
    private int Id;
    private int Pin;

    public boolean CheckPin(int pin) {
        return this.Pin == pin;
    }

    public Personale(){

    }

    public Personale(int id, int pin){
        this.Id=id;
        this.Pin=pin;
    }
    public static ArrayList<Personale> PersonaleListe = new ArrayList<Personale>();

    public void addDummyDataPersonale()
    {
        PersonaleListe.add(new Personale(01, 111));
        PersonaleListe.add(new Personale(02, 222));
        PersonaleListe.add(new Personale(03, 333));
    }






}
