package EFP.E05;


import EFP.Console;

public class E05 {
    public static void main(String [ ] args) {
        Console console = new Console();
        Calculator calculator = new Calculator();
        SimpleMath sm = new SimpleMath(console, calculator);

        sm.start();
    }
}
