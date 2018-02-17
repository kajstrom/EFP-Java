package fi.kajstrom.EFP.E07;

import fi.kajstrom.EFP.Console;

/**
 * Created by Kaitsu on 16.1.2016.
 */
public class RoomAreaCalculator {
    private Console console;

    public RoomAreaCalculator(Console console) {
        this.console = console;
    }

    public void run() {
        console.print("What is the length of the room in feet? ");
        String lengthStr = console.readLine();
        console.print("What is the width of the room in feet? ");
        String widthStr = console.readLine();

        console.println(String.format("You entered dimensions of %s feet by %s feet", lengthStr, widthStr));

        RoomArea roomArea = new RoomArea(Double.parseDouble(lengthStr), Double.parseDouble(widthStr));

        console.println("The area is");
        console.println(String.format("%s square feet", roomArea.squareFeet()));
        console.println(String.format("%S square meters", roomArea.squareMeters()));
    }
}
