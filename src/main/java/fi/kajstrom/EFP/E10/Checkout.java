package fi.kajstrom.EFP.E10;

import java.util.List;
import java.util.Vector;

/**
 * Created by Kaitsu on 9.5.2016.
 */
public class Checkout {
    private List<Item> items = new Vector<Item>();

    public void add(Item item) {
        items.add(item);
    }

    public double taxFreeSum() {
        double sum = 0.0;

        for (Item item : items) {
            sum += (double) item.taxFreeSum();
        }

        return sum;
    }

    public double tax() {
        double sum  = 0.0;

        for (Item item : items) {
            sum += (double) item.tax();
        }

        return sum;
    }

    public double taxIncludedSum() {
        double sum = 0.0;

        for (Item item : items) {
            sum += (double) item.taxIncludedSum();
        }

        return sum;
    }
}
