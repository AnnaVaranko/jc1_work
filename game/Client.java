package game;

public class Client {
    public static void main(String[] args) {
        Fighter fighter = new WizardAdapter();
        fighter.attack();
        fighter.defend();
        fighter.escape();
    }
}
