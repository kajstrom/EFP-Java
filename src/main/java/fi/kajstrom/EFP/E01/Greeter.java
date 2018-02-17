package fi.kajstrom.EFP.E01;


import fi.kajstrom.EFP.Console;

import java.io.IOException;

public class Greeter {
    protected Console console;

    public Greeter(Console console) {
        this.console = console;
    }

    public void sayHello() {
        try {
            String name = askName();
            String greeting = makeGreeting(name);
            console.println(greeting);
        } catch (Exception e) {}
    }

    protected String askName() throws IOException {
        console.print("What is your name? ");
        return console.readLine();
    }

    protected String makeGreeting(String name) {
        return "Hello, " + name + ", nice to meet you!";
    }
}
