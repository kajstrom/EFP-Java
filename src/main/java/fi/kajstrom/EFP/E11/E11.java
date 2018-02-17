package fi.kajstrom.EFP.E11;

import fi.kajstrom.EFP.Console;

/**
 * Created by Kaitsu on 23.5.2016.
 */
public class E11 {
    public static void main(String[] args) {
        Console console = new Console();
        CurrencyConversionApp currencyConversionApp = new CurrencyConversionApp(console);

        currencyConversionApp.run();
    }
}
