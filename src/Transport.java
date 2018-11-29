import java.util.Scanner;

public class Transport {


    public String transportMiddel;
    public double startTidspunkt;
    public double slutTidspunkt;
    public String pickUp;
    public String dropOff;

    public Transport transport = new Transport(transportMiddel,startTidspunkt,slutTidspunkt,pickUp,dropOff )


    public Transport (String transportMiddel, double startTidspunkt, double slutTidspunkt, String pickUp, String dropOff);
    {

        this.transportMiddel = transportMiddel;
        this.startTidspunkt = startTidspunkt;
        this.slutTidspunkt = slutTidspunkt;
        this.pickUp = pickUp
        this.dropOff = dropOff;
    }

    public Transport(){

    }

    public Transport eventType()
    {
        Scanner console = new Scanner(System.in);

        System.out.print("Eventtype valgt!");
        String transportmiddel = console.nextLine();




        public EventType et = new Transport(transportMiddel,startTidspunkt,slutTidspunkt,pickUp,dropOff;)

    }

    public String toString()
    {
        return "\n" + "Eventnavn: " + navn + ". \n" + "Eventbeskrivelse: " + beskrivelse + ". \n" + "Pris: " + pris + "\n" + "Startdato: " + startDato + "\n" + "Slutdato: " + slutDato + "\n" + "Start tid: " + tidStart +
                ". \n" + "Slut tid: " + tidSlut;
    }







    // Set metoder

    /*void setTransportMiddel(String transportMiddel){
        this.transportMiddel = transportMiddel;
    }

    void setStartTidspunkt(double startTidspunkt){
        this.startTidspunkt = startTidspunkt;
    }

    void setSlutTidspunkt(double slutTidspunkt){
        this.slutTidspunkt = slutTidspunkt;
    }

    void setPickUp(String pickUp){
        this.pickUp = pickUp;
    }

    void setDropOff(String dropOff){
        this.dropOff = dropOff;
    }

    @Override
    void info() {
        String infoString = "navn: " + navn + " pris: " + pris + " Start dato: " + startDato  + " Slut dato: " + slutDato + " Start tidspunkt" + tidStart + " Slut tidspunkt" + tidSlut + "Transportmiddel: " + transportMiddel + "Starttidspunkt for transport: " + startTidspunkt + "Sluttidspunkt for transport: " + slutTidspunkt + "Pick up sted: " + pickUp + "Drop off sted: " + dropOff;
        System.out.println( infoString );
    }*/

}

