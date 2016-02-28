package EFP.E09;

import EFP.Console;

public class E09 {
    public static void main(String[] args) {
        Console console = new Console();
        PaintCalculatorApp paintCalculatorApp = new PaintCalculatorApp(console);

        paintCalculatorApp.run();
    }
}
