package fi.kajstrom.EFP.E01;

import fi.kajstrom.EFP.Console;

public class E01 {
    public static void main(String [ ] args)
    {
        Console console = new Console();
        Greeter greeter = new Greeter(console);

        greeter.sayHello();
    }
}
