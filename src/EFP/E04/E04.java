package EFP.E04;


import EFP.Console;

public class E04 {
    public static void main (String [ ] args) {
        Console console = new Console();
        MadLib ml = new MadLib(console);

        ml.start();
    }
}