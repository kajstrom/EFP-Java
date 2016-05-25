package EFP.E11;

import java.text.DecimalFormat;

/**
 * Created by Kaitsu on 23.5.2016.
 */
public class Money {
    private final double amount;
    private final String currency;

    public Money(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money convertTo(String currency, double rate) {
        return new Money(amount * (rate / 100), currency);
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }
}
