import java.util.ArrayList;
import java.util.Scanner;
public class Personale {
    private int Id;
    private int Pin;

    public boolean ValiderPersonale(int id, int pin) {
        if (id == Id && pin == Pin) {
            return true;
        } else {
            return false;
        }
    }
    public static void validerBruger(){

        System.out.println("\n\n");
        System.out.println("*********************************");
        System.out.println("* Welkommen til Planorgan burger log-in *");
        System.out.println("*********************************");

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Intast venligst Id : ");
            int inID = input.nextInt();
            System.out.println("Indtast venligst Pin: ");
            int inPIN = input.nextInt();
            if (inID == 01 && inPIN == 111) {
                Facilitator.VisArrangementListe();
            } else {
                if (WashMenu.Accounts.get(inID).CheckPIN(inPIN)) {
                    WashMenu.activeUser = inID;
                    WashMenu.displayMenu();
                    break;
                } else {
                    System.out.println("* Forkert log-in, prøv igen *");
                }
            }
        }
        WashMenu.endService();

    }
    public Personale(int id, int pin){
        this.Id=id;
        this.Pin=pin;
    }
    public static ArrayList<Personale> PersonaleListe = new ArrayList<Personale>();

    public void addDummyDataPersonale
    {
        PersonaleListe.add(new Personale(01, 111));
        PersonaleListe.add(new Personale(02, 222));
        PersonaleListe.add(new Personale(03, 333));
    }






}
