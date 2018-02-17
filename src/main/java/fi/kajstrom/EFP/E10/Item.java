package fi.kajstrom.EFP.E10;

/**
 * Created by Kaitsu on 9.5.2016.
 */
public class Item {
    private int quantity;
    private int price;
    private final double TAX = 5.5;

    public Item(int quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    public double taxFreeSum() {
        return quantity * price;
    }

    public double tax() {
        return taxFreeSum() * (TAX / 100);
    }

    public double taxIncludedSum() {
        return taxFreeSum() + tax();
    }
}
