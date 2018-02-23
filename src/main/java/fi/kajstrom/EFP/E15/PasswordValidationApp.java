package fi.kajstrom.EFP.E15;

import fi.kajstrom.EFP.Console;

public class PasswordValidationApp {

    private Console console;

    public PasswordValidationApp(Console console) {
        this.console = console;
    }

    public void run() {
        Authentication auth = new Authentication();

        String username = promptUsername();
        String password = promptPassword();

        outputResult(auth.isValid(username, password));
    }

    private String promptUsername() {
        return console.readLine("What is your username?");
    }

    private String promptPassword() {
        return console.readLine("What is the password?");
    }

    private void outputResult(boolean valid) {
        if (valid) {
            console.println("Welcome!");
        } else {
            console.println("I don't know you...");
        }
    }
}
