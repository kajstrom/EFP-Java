package EFP.E12;

public class SimpleInterest {
    public Double forInvestment(Integer investment, Double rate, Integer years) {
        Double totalRate = 1 + (rate * years) / 100;
        return investment * totalRate;
    }
}
