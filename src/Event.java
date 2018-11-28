import java.util.Scanner;

public class Event {

	private String navn;
	//private int typeAfEvent;
	private double pris;
	//public Facilitator facilitator;
	private String beskrivelse;
	//private int startDato;
	//private int slutDato;
	private double tidStart;
	private double tidSlut;

	public Event(String navn, String beskrivelse, double tidStart, double tidSlut)
	{
		this.navn=navn;
		this.beskrivelse=beskrivelse;
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
		System.out.print("Starttid: ");
		double tidStart = console.nextDouble();
		System.out.print("Sluttid: ");
		double tidSlut = console.nextDouble();

		Event event = new Event(navn, beskrivelse, tidStart, tidSlut);
		//System.out.println("**Følgende event er blevet tilføjet dit arrangement**");
		//System.out.println(event);
		return event;

	}

	public String toString()
	{
		return "\n" + "Eventnavn: " + navn + ". \n" + "Eventbeskrivelse: " + beskrivelse + ". \n"+ "Start tid: " + tidStart +
				". \n" + "Slut tid: " + tidSlut;
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