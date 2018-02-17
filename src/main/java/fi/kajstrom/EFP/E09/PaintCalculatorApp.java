package fi.kajstrom.EFP.E09;

import fi.kajstrom.EFP.Console;

public class PaintCalculatorApp {
    private Console console;

    public PaintCalculatorApp(Console console) {
        this.console = console;
    }

    public void run() {
        console.print("Enter ceiling width: ");
        String strWidth = console.readLine();

        console.print("Enter ceiling length: ");
        String strLength = console.readLine();

        int width = Integer.parseInt(strWidth);
        int length = Integer.parseInt(strLength);

        AreaPaintCalculator paintCalculator = new AreaPaintCalculator(length, width);

        console.println(
                String.format("You will need to purchase %s gallons of paint to cover %s square feet.", paintCalculator.amountOfPaint(), paintCalculator.area())
        );
    }
}
