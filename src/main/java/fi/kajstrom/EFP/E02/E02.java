package fi.kajstrom.EFP.E02;

import fi.kajstrom.EFP.Console;

public class E02 {
    public static void main(String [ ] args) {
        Console console = new Console();
        NumberOfCharacters noc = new NumberOfCharacters(console);
        noc.start();
    }
}
