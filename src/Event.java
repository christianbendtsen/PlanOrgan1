import java.util.Scanner;

public class Event {

	private String navn;
	//private int typeAfEvent;
	private double pris;
	//public Facilitator facilitator;
	private String beskrivelse;
	private int startDato;
	private int slutDato;
	private int tidStart;
	private int tidSlut;

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
	}

}