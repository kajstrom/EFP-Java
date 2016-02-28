package tests.E09;

import EFP.E09.AreaPaintCalculator;
import org.junit.Assert;
import org.junit.Test;

public class AreaPaintCalculatorTest {
    @Test
    public void testArea_WhenLength10Width20_Returns200() {
        AreaPaintCalculator paintCalculator = new AreaPaintCalculator(10, 20);
        Assert.assertEquals(200, paintCalculator.area());
    }

    @Test
    public void testAmountOfPaint_WhenAreaIs360_Returns2() {
        AreaPaintCalculator paintCalculator = new AreaPaintCalculator(20, 18);
        Assert.assertEquals(2, paintCalculator.amountOfPaint());
    }

    @Test
    public void testAmountPaint_WhenAreaIs340_Returns1() {
        AreaPaintCalculator paintCalculator = new AreaPaintCalculator(20, 17);
        Assert.assertEquals(1, paintCalculator.amountOfPaint());
    }
}
