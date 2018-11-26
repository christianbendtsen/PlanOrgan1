public class Arrangement {
    private String arrangementNavn;
    private double totalVarighed;
    private double totalPris;
    public String kundeEmail;
    public int kundeTlf;
    public Event listeAfEvents;
    public Facilitator listeAfFacilitator;


    public Event tilføjEvent(){

    }

    public Event visEvent(){

    }

    public Arrangement(String arrangementnavn, double totalpris){
        arrangementNavn = arrangementnavn;
        totalPris = totalpris;
    }
}
