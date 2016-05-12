package tests.E10;

import EFP.E10.Item;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kaitsu on 9.5.2016.
 */
public class ItemTest {
    @Test
    public void testTaxFreeSum_WhenQuantity3Price15_Returns45() {
        Item item = new Item(3, 15);
        Assert.assertEquals(45, item.taxFreeSum(), 2);
    }

    @Test
    public void testTax_WhenQuantity2Price10_Returns1DollarAnd10Cents() {
        Item item = new Item(2, 10);
        Assert.assertEquals(1.1, item.tax(), 2);
    }

    @Test
    public void testTaxIncludedSum_WhenQuantity5Price5_Returns26DollarsAnd28Cents() {
        Item item = new Item(5, 5);
        Assert.assertEquals(26.38, item.taxIncludedSum(), 2);
    }
}
