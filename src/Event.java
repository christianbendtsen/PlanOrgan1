import java.util.Scanner;

public class Event {
    Sekretær sekretær = new Sekretær(); //bruger vi på linje 86

    private String navn;
    //private int typeAfEvent;
    private int pris = 100;
    private String beskrivelse;
    private String startDato;
    private String slutDato;
    private double tidStart;
    private double tidSlut;
    String facilitator;

    public Event(String navn, String beskrivelse, int pris, String startDato, String slutDato, double tidStart, double tidSlut, String facilitator) {
        this.navn = navn;
        this.pris = pris;
        this.beskrivelse = beskrivelse;
        this.startDato = startDato;
        this.slutDato = slutDato;
        this.tidStart = tidStart;
        this.tidSlut = tidSlut;
        this.facilitator=facilitator;
    }

    public Event() {

    }

    public Event tilføjEvent() {
        Scanner console = new Scanner(System.in);

        System.out.print("Eventnavn: ");
        System.out.println();
        String navn = console.nextLine();
        System.out.print("Uddybende beskrivelse: ");
        System.out.println();
        String beskrivelse = console.nextLine();

        //System.out.print("Pris for opstart af event: ");
        //int pris = console.nextInt();

        System.out.print("Startdato for Event (dd.MM.yyyy): ");
        String startDato = console.nextLine();
        System.out.print("Slutdato for Event (dd.MM.yyyy): ");
        String slutDato = console.nextLine();
        System.out.print("Starttid: ");
        double tidStart = console.nextDouble();
        System.out.print("Sluttid: ");
        double tidSlut = console.nextDouble();
		System.out.print("Ansvarlig facilitator: ");
		String facilitator = console.next();

        Event event = new Event(navn, beskrivelse, pris, startDato, slutDato, tidStart, tidSlut, facilitator);
        return event;

    }

    public String toString() {
        return "\n" + "Eventnavn: " + navn + " \n" + "Eventbeskrivelse: " + beskrivelse + " \n" +
				"Pris: " + pris + "\n" + "Startdato: " + startDato + "\n" + "Slutdato: " + slutDato + "\n" +
				"Start tid: " + tidStart + ". \n" + "Slut tid: " + tidSlut + "\n" +
				"Ansvarlig facilitator: " + facilitator + "\n";
    }


    /*public void flereEvent() {
        Scanner console = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("Ønsker du at tilføje flere events eller afslutte eventliste?");
        System.out.println("1. Tilføj nyt event");
        System.out.println("2. Afslut eventliste");
        int in = console.nextInt();
        switch (in) {
            case 1:
                System.out.println("**Tilføjer nyt event**");
                this.tilføjEvent();
                break;
            case 2:
                System.out.println("**Afslutter eventliste**");
                this.sekretær.SekretærMenu();
                break;
        }
    }*/
}
