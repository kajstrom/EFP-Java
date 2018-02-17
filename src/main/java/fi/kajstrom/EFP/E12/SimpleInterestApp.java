package fi.kajstrom.EFP.E12;


import fi.kajstrom.EFP.Console;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class SimpleInterestApp {
    final private Console console;
    final private SimpleInterest simpleInterest;

    public SimpleInterestApp(Console console, SimpleInterest simpleInterest) {
        this.console = console;
        this.simpleInterest = simpleInterest;
    }

    public void run() {
        Integer principal = promptPrincipal();
        Double rate = promptRate();
        Integer years = promptYears();

        Double totalValue = simpleInterest.forInvestment(principal, rate, years);

        outputResult(totalValue, rate, years);
    }

    public Integer promptPrincipal() {
        console.print("Enter the principal: ");
        String principal = console.readLine();

        return Integer.parseInt(principal);
    }

    public Double promptRate() {
        console.print("Enter the rate of interest: ");
        String rate = console.readLine();

        return Double.parseDouble(rate);
    }

    public Integer promptYears() {
        console.print("Enter years: ");
        String years = console.readLine();

        return Integer.parseInt(years);
    }

    public void outputResult(Double totalValue, Double rate, Integer years) {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.HALF_UP);

        String output = String.format(
                "After %d years at %s%%, the investment will be worth $%s",
                years,
                df.format(rate),
                df.format(totalValue)
        );
        console.println(output);
    }
}
