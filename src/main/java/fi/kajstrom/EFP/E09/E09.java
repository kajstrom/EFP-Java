package fi.kajstrom.EFP.E09;

import fi.kajstrom.EFP.Console;

public class E09 {
    public static void main(String[] args) {
        Console console = new Console();
        PaintCalculatorApp paintCalculatorApp = new PaintCalculatorApp(console);

        paintCalculatorApp.run();
    }
}
