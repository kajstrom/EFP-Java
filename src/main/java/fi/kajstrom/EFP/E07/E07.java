package fi.kajstrom.EFP.E07;

import fi.kajstrom.EFP.Console;

/**
 * Created by Kaitsu on 16.1.2016.
 */
public class E07 {
    public static void main(String args[]) {
        Console console = new Console();
        RoomAreaCalculator roomAreaCalculator = new RoomAreaCalculator(console);

        roomAreaCalculator.run();
    }
}
