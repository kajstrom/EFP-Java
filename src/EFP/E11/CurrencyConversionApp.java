package EFP.E11;

import EFP.Console;

/**
 * Created by Kaitsu on 23.5.2016.
 */
public class CurrencyConversionApp {
    private Console console;

    public CurrencyConversionApp(Console console) {
        this.console = console;
    }

    public void run() {
        Money eur = promptForEuros();
        double rate = prompForRate();

        Money usd = eur.convertTo("EUR", rate);
        outputConversion(usd, eur, rate);
    }

    private double prompForRate() {
        console.print("What is the exchange rate? ");
        String rate = console.readLine();

        return Double.parseDouble(rate);
    }

    private Money promptForEuros() {
        console.print("How many euros are you exchanging? ");
        String euros = console.readLine();

        return new Money(Double.parseDouble(euros), "EUR");
    }

    private void outputConversion(Money usd, Money eur, double rate) {
        console.println(String.format("%.2f euros at an exchange rate of %.2f is", eur.getAmount(), rate));
        console.println(String.format("%.2f %s", usd.getAmount(), usd.getCurrency()));
    }
}
