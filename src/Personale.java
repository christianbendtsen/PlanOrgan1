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




}
