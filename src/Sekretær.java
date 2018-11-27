import java.util.ArrayList;

public class Sekretær {
    private int Id;
    private int Pin;
    private ArrayList<Arrangement> listeAfArrangementer = new ArrayList<Arrangement>();

    public ArrayList<Arrangement> getListeAfArrangementer() {
        return listeAfArrangementer;
    }

    public void setListeAfArrangementer(ArrayList<Arrangement> listeAfArrangementer) {
        this.listeAfArrangementer = listeAfArrangementer;
    }



    public Sekretær(){

    }
    public void ArrangementListe() {
    }

    public void opretArrangement() {
        //Arrangement.
    }

    public void sletArrangement() {
    }

    public void redigerArrangement() {
    }

    public static void SekretærMenu() {
    }
}

