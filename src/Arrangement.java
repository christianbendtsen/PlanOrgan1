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

    private void addDummyDataArrangement() {
        Sekretær.listeAfArrangementer.add(new Arrangement("julefrokost", 1890.9));
        Sekretær.listeAfArrangementer.add(new Arrangement("Påskefrokost", 2000));
        Sekretær.listeAfArrangementer.add(new Arrangement("Nytårskur", 4000));
    }
}
