package EFP.E08;

import EFP.Console;

public class E08 {
    public static void main(String[] args) {
        Console console = new Console();
        PizzaParty party = new PizzaParty(console);

        party.run();
    }
}
