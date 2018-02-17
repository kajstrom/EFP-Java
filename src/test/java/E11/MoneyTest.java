package E11;


import fi.kajstrom.EFP.E11.Money;
import org.junit.Assert;
import org.junit.Test;

public class MoneyTest {
    @Test
    public void testConvertTo_WithCurrency_ReturnsMoneyOfProperCurrency() {
        Money money = new Money(100, "EUR");
        Assert.assertEquals("USD", money.convertTo("USD", 110.51).getCurrency());
    }

    @Test
    public void testConverTo_WithRateOf110Point51AndAmountOf100_Returns110Point51() {
        Money money = new Money(100, "EUR");
        Assert.assertEquals(110.51, money.convertTo("USD", 110.51).getAmount(), 2);
    }
}
