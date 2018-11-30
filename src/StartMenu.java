import java.util.Scanner;

public class StartMenu {

    Personale personale = new Personale();
    Sekretær sekretær = new Sekretær();
    Facilitator facilitator = new Facilitator();

    /*public void validerBruger(){
        System.out.println("\n\n");
        System.out.println("*********************************");
        System.out.println("* Velkommen til PlanOrgan bruger log-in *");
        System.out.println("*********************************");

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("In+dtast venligst Id : ");
            int inId = input.nextInt();
            System.out.println("Indtast venligst Pin: ");
            int inPin = input.nextInt();
            if (inId == 1 && inPin == 111) {
                this.facilitator.facilitatormenu();
            } else if (Personale.PersonaleListe.get(inId).CheckPin(inPin)) {
                this.sekretær.SekretærMenu();
                break;
            } else {
                System.out.println("* Forkert log-in, prøv igen *");
            }
        }
        validerBruger();
    }*/

}