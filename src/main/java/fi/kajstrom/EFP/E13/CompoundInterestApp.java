package fi.kajstrom.EFP.E13;

import fi.kajstrom.EFP.Console;

public class CompoundInterestApp {
    private final Console console;

    public CompoundInterestApp(Console console) {
        this.console = console;
    }

    public void run() {
        int principal = promptPrincipalAmount();
        double rate = promptRate();
        int years = promptYears();
        int compoundTimesPerYear = promptCompoundTimesPerYear();

        CompoundInterest compoundInterest = new CompoundInterest();

        double amount = compoundInterest.calculateFor(principal, rate, years, compoundTimesPerYear);

        String result = String.format("$%s invested at %1.2f%% for %s years compounded %s times per year is $%1.2f",
                principal,
                rate,
                years,
                compoundTimesPerYear,
                amount
        );

        console.println(result);
    }

    private int promptPrincipalAmount() {
        String principal = console.readLine("What is the principal amount?");

        return Integer.parseInt(principal);
    }

    private double promptRate() {
        String rate = console.readLine("What is the rate?");

        return Double.parseDouble(rate);
    }

    private int promptYears() {
        return Integer.parseInt(console.readLine("What is the number of years?"));
    }

    private int promptCompoundTimesPerYear() {
        return Integer.parseInt(console.readLine("What is the number of times the interest is compounded per year?"));
    }
}
