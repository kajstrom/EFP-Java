package fi.kajstrom.EFP.E05;


import fi.kajstrom.EFP.Console;

public class E05 {
    public static void main(String [ ] args) {
        Console console = new Console();
        Calculator calculator = new Calculator();
        SimpleMath sm = new SimpleMath(console, calculator);

        sm.start();
    }
}
