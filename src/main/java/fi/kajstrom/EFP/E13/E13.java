package fi.kajstrom.EFP.E13;

import fi.kajstrom.EFP.Console;

public class E13 {
    public static void main(String[] args) {
        Console console = new Console();

        CompoundInterestApp compoundInterestApp = new CompoundInterestApp(console);
        compoundInterestApp.run();
    }
}
