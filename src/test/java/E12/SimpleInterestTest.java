package E12;

import fi.kajstrom.EFP.E12.SimpleInterest;
import org.junit.Assert;
import org.junit.Test;

public class SimpleInterestTest {
    @Test
    public void testForInvestment_WhenCalled_ReturnsCorrectValue(){
        SimpleInterest si = new SimpleInterest();

        Double total = si.forInvestment(1500, 4.3, 4);

        Assert.assertEquals(1758.0, total, 2);
    }
}