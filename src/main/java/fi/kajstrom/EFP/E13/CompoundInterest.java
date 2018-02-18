package fi.kajstrom.EFP.E13;

public class CompoundInterest {
    public double calculateFor(int principal, double rate, int years, int compoundTimesPerYear) {
        double compoundRate = 1 + (rate / 100) / compoundTimesPerYear;

        return principal * Math.pow(compoundRate, compoundTimesPerYear * years);
    }
}
