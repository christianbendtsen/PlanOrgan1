public class Transport extends Event {

    String transportMiddel;
    double startTidspunkt;
    double slutTidspunkt;
    String pickUp;
    String dropOff;

    void setTransportMiddel(String transportMiddel){
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
}
