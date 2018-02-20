package fi.kajstrom.EFP.E14;

import fi.kajstrom.EFP.Console;

public class E14 {
    public static void main(String[] args) {
        Console console = new Console();

        TaxCalculatorApp app = new TaxCalculatorApp(console);
        app.run();
    }
}
