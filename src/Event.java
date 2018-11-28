import java.util.Scanner;

public class Event {

	private String navn;
	//private int typeAfEvent;
	private int pris = 100;
	//String  facilitator;
	private String beskrivelse;
	private String startDato;
	private String slutDato;
	private double tidStart;
	private double tidSlut;

	public Event(String navn, String beskrivelse, int pris, String startDato, String slutDato, double tidStart, double tidSlut)
	{
		this.navn=navn;
		this.pris=pris;
		this.beskrivelse=beskrivelse;
		this.startDato=startDato;
		this.slutDato=slutDato;
		this.tidStart=tidStart;
		this.tidSlut=tidSlut;
	}

	public Event ()
	{

	}

	public Event tilføjEvent()
	{
		Scanner console = new Scanner(System.in);

		//System.out.println("**Udfyld venligst data for nyt event**");
		System.out.print("Eventnavn: ");
		System.out.println();
		String navn = console.nextLine();

		System.out.print("Uddybende beskrivelse: ");
		System.out.println();
		String beskrivelse = console.nextLine();

        //System.out.print("Pris for opstart af event: ");
        //int pris = console.nextInt();

		System.out.print("Startdato for Event: ");
		String starDato = console.nextLine();
        System.out.print("Slutdato for Event: ");
        String slutDato = console.nextLine();
		System.out.print("Starttid: ");
		double tidStart = console.nextDouble();
		System.out.print("Sluttid: ");
		double tidSlut = console.nextDouble();

		Event event = new Event(navn, beskrivelse, pris, starDato, slutDato, tidStart, tidSlut);
		//System.out.println("**Følgende event er blevet tilføjet dit arrangement**");
		//System.out.println(event);
		return event;

	}

	public String toString()
	{
		return "\n" + "Eventnavn: " + navn + ". \n" + "Eventbeskrivelse: " + beskrivelse + ". \n" + "Pris: " + pris + "\n" + "Startdato: " + startDato + "\n" + "Slutdato: " + slutDato + "\n" + "Start tid: " + tidStart +
				". \n" + "Slut tid: " + tidSlut;
	}


	public void flereEvent(){
		Scanner console = new Scanner(System.in);
		System.out.println("Ønsker du at afslutte eller tilføje flere events?");
		int in = console.nextInt();
		switch(in) {
			case 1:
				System.out.println("Tilføj nyt event ");
				tilføjEvent();

				break;
			case 2:
				System.out.println("Afslut eventliste");
				Sekretær.SekretærMenu();
				break;
		}
	}

	/*public Møde tilfojMøde() {
		// TODO - implement Event.tilføjMøde
		throw new UnsupportedOperationException();
	}

	public Transport tilføjTransport() {
		// TODO - implement Event.tilføjTransport
		throw new UnsupportedOperationException();
	}

	public Udflugt tilføjUdflugt() {
		// TODO - implement Event.tilføjUdflugt
		throw new UnsupportedOperationException();
	}*/

}
