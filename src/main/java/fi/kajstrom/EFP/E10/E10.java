package fi.kajstrom.EFP.E10;

import fi.kajstrom.EFP.Console;

/**
 * Created by Kaitsu on 9.5.2016.
 */
public class E10 {
    public static void main(String[] args) {
        SelfCheckoutApp selfCheckoutApp = new SelfCheckoutApp(new Console());
        selfCheckoutApp.run();
    }
}
