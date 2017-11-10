package EFP.E12;

import EFP.Console;

public class E12 {
    public static void main(String args[]) {
        SimpleInterestApp application = new SimpleInterestApp(
                new Console(),
                new SimpleInterest()
        );
        application.run();
    }
}
