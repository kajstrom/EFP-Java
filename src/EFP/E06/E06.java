package EFP.E06;

import EFP.Console;

/**
 * Created by Kaitsu on 13.11.2015.
 */
public class E06 {
    public static void main(String [ ] args) {
        Console console = new Console();
        RetirementChecker checker = new RetirementChecker();
        RetirementCalculator calculator = new RetirementCalculator(console, checker);

        calculator.start();
    }
}
