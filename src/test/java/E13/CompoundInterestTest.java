package E13;

import fi.kajstrom.EFP.E13.CompoundInterest;
import org.junit.Assert;
import org.junit.Test;

public class CompoundInterestTest {
    @Test
    public void calculateFor_WithADecimalRate_ReturnsCorrectAmount() {
        CompoundInterest compoundInterest = new CompoundInterest();

        double actual = compoundInterest.calculateFor(1500, 4.3, 6, 4);

        Assert.assertEquals(1938.84, actual, 2);
    }

    @Test
    public void calculateFor_WithANonDecimalRate_ReturnsCorrectAmount() {
        CompoundInterest compoundInterest = new CompoundInterest();

        double actual = compoundInterest.calculateFor(1500, 4.0, 6, 4);

        Assert.assertEquals(1904.6, actual, 2);
    }
}
