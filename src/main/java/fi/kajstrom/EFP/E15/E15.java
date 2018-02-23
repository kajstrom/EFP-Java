package fi.kajstrom.EFP.E15;

import fi.kajstrom.EFP.Console;

public class E15 {
    public static void main(String[] args) {
        PasswordValidationApp app = new PasswordValidationApp(new Console());

        app.run();
    }
}
