import java.util.ArrayList;
import java.util.Scanner;
public class Personale {
    private int Id;
    private int Pin;

    private boolean CheckPin(int pin) {
        return this.Pin == pin;
    }
    /*public static void validerBruger(){

        System.out.println("\n\n");
        System.out.println("*********************************");
        System.out.println("* Velkommen til PlanOrgan bruger log-in *");
        System.out.println("*********************************");

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Intast venligst Id : ");
            int inId = input.nextInt();
            System.out.println("Indtast venligst Pin: ");
            int inPin = input.nextInt();
            if (inId == 01 && inPin == 111) {
                Facilitator.VisArrangementListe();
            } else {
                if (PersonaleListe.get(inId).CheckPin(inPin)) {
                    Sekretær.SekretærMenu();
                    break;
                } else {
                    System.out.println("* Forkert log-in, prøv igen *");
                }
            }
        }
        validerBruger();
    }*/
    public Personale(int id, int pin){
        this.Id=id;
        this.Pin=pin;
    }
    public static ArrayList<Personale> PersonaleListe = new ArrayList<Personale>();

    public void addDummyDataPersonale()
    {
        PersonaleListe.add(new Personale(01, 111));
        PersonaleListe.add(new Personale(02, 222));
        PersonaleListe.add(new Personale(03, 333));
    }






}
