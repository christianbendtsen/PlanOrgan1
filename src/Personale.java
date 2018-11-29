import java.util.ArrayList;

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
        PersonaleListe.add(new Personale(1, 111));
        PersonaleListe.add(new Personale(2, 222));
        PersonaleListe.add(new Personale(3, 333));
    }
}

