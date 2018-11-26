import java.util.ArrayList;

public  class StartMenu {
    public ArrayList<Arrangement> listeAfArrangementer = new ArrayList<Arrangement>();


    private  void addDummyData() {
        listeAfArrangementer.add(new Arrangement("julefrokost", 189.9));
        listeAfArrangementer.add(new Arrangement("Påskefrokost", 2000));
        listeAfArrangementer.add(new Arrangement("Nytårskur", 4000));

    }
}