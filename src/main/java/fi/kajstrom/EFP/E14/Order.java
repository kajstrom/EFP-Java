package fi.kajstrom.EFP.E14;

public class Order {
    private final double amount;
    private final String state;
    private final double taxPercentage = 0.055;

    public Order(double amount, String state) {
        this.amount = amount;
        this.state = state;
    }

    public boolean isTaxApplicable() {
        return state.equals("WI");
    }

    public double amount() {
        return amount;
    }

    public double tax() {
        if (isTaxApplicable()) {
            return amount * taxPercentage;
        }

        return 0.0;
    }

    public double total() {
        return amount + tax();
    }
}
