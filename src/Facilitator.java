
import java.util.Scanner;

public class Facilitator {
    private double pris;
    private int id;
    private int pin;
    Arrangement arrangement = new Arrangement();
    Sekretær sekretær = new Sekretær();
    StartMenu startMenu = new StartMenu();

    /*public static void VisArrangementListe(){
    System.out.println("Velkommen facilitator");
    System.out.println("Følgende arrangementer: " + Statistik.getAlleArrangementer());

    }*/
    public void facilitatormenu(){
        Scanner console = new Scanner(System.in);
    System.out.println("Velkommen facilitator");
    System.out.println("Du har følgende muligheder: ");
    System.out.println("1. Se Arrangementliste");
    System.out.println("2. Log ud");
    int in = console.nextInt();
    switch (in){
        case 1: this.sekretær.printArrangementListe();
        break;

        case  2: this.startMenu.validerBruger();
        break;
    }

    }

    public Facilitator()
    {

    }
    /*public static void main( ) {}
    hej med dig*/
}
