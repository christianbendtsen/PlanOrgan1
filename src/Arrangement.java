import java.util.ArrayList;

public class Arrangement {
    private String arrangementNavn;
    private double totalVarighed;
    private double totalPris;
    public String kundeEmail;
    public int kundeTlf;
    public Event listeAfEvents;
    public Facilitator listeAfFacilitator;


    public Event tilføjEvent() {
        return tilføjEvent();

    }

    public Event visEvent() {
        return  visEvent();

    }

    public Arrangement(String arrangementnavn, double totalpris) {
        arrangementNavn = arrangementnavn;
        totalPris = totalpris;
    }

    public ArrayList<Arrangement> listeAfArrangementer = new ArrayList<Arrangement>();

    private void addDummyDataArrangement() {
        listeAfArrangementer.add(new Arrangement("julefrokost", 189.9));
        listeAfArrangementer.add(new Arrangement("Påskefrokost", 2000));
        listeAfArrangementer.add(new Arrangement("Nytårskur", 4000));
    }
}
