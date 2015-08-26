package EFP.E01;

import EFP.Console;

public class E01 {
    public static void main(String [ ] args)
    {
        Console console = new Console();
        Greeter greeter = new Greeter(console);

        greeter.sayHello();
    }
}
