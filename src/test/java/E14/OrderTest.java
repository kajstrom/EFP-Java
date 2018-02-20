package E14;

import fi.kajstrom.EFP.E14.Order;
import static org.junit.Assert.*;
import org.junit.Test;

public class OrderTest {
    @Test
    public void testOrder_WhenStateIsNotWisconsin_NoTaxIsApplied()
    {
        Order order = new Order(10.0, "MN");

        assertFalse(order.isTaxApplicable());
        assertEquals(10.0, order.total(), 2);
        assertEquals(0.0, order.tax(), 2);
    }

    @Test
    public void testOrder_WhenStateIsWisconsin_TaxIsApplied()
    {
        Order order = new Order(10.0, "WI");

        assertTrue(order.isTaxApplicable());
        assertEquals(10.55, order.total(), 2);
        assertEquals(0.55, order.tax(), 2);
    }
}
