package fi.kajstrom.EFP.E02;

import fi.kajstrom.EFP.Console;

public class NumberOfCharacters {
    private Console console;

    public NumberOfCharacters(Console console) {
        this.console = console;
    }

    public void start() {
        String input = askForString();

        while (!isValidInputString(input)) {
            validationErrorMessage();
            input = askForString();
        }

        reportLength(input);
    }

    protected String askForString() {
        console.print("What is the input string? ");
        String input = console.readLine();

        return input;
    }

    public boolean isValidInputString(String input) {
        return input.length() > 0;
    }

    public void validationErrorMessage() {
        console.println("Please enter a string...");
    }

    protected void reportLength(String input) {
        int len = input.length();
        console.println(input + " has " + len + " characters.");
    }
}
