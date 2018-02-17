package E10;

import fi.kajstrom.EFP.E10.Checkout;
import fi.kajstrom.EFP.E10.Item;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Kaitsu on 9.5.2016.
 */
public class CheckoutTest {
    @Test
    public void testTaxFreeSum_WhenItemsSumIs35Dollars_ReturnsMatchingSum() {
        Item item1 = new Item(2, 10);
        Item item2 = new Item(3, 5);

        Checkout checkout = new Checkout();
        checkout.add(item1);
        checkout.add(item2);

        Assert.assertEquals(35, checkout.taxFreeSum(), 2);
    }

    @Test
    public void testTax_WhenItemTaxSumIsDollar92Cents_ReturnsMatchingSum() {
        Item item1 = new Item(2, 10);
        Item item2 = new Item(3, 5);

        Checkout checkout = new Checkout();
        checkout.add(item1);
        checkout.add(item2);

        Assert.assertEquals(1.92, checkout.tax(), 2);
    }

    @Test
    public void testTaxIncludedSum_WhenTaxIncludedSumIs36Dollars92Cents_ReturnsMatchingSum() {
        Item item1 = new Item(2, 10);
        Item item2 = new Item(3, 5);

        Checkout checkout = new Checkout();
        checkout.add(item1);
        checkout.add(item2);

        Assert.assertEquals(36.92, checkout.taxIncludedSum(), 2);
    }
}
