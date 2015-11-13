package tests.E06;

import EFP.E06.RetirementChecker;
import org.junit.Assert;
import org.junit.Test;

public class RetirementCheckerTest {
    @Test
    public void yearsToRetirement_WhenCalled_ReturnsYearsToRetirement() {
        RetirementChecker rc = new RetirementChecker();

        Integer yearsToRetirement = rc.yearsToRetirement(31, 65);

        Integer expectedYearsToRetirement = 34;
        Assert.assertEquals(expectedYearsToRetirement, yearsToRetirement);
    }

    @Test
    public void yearsToRetirement_CalledWithPassedRetirementAge_ReturnsNegativeYearsToRetirement() {
        RetirementChecker rc = new RetirementChecker();

        Integer yearsToRetirement = rc.yearsToRetirement(70, 65);

        Integer expectedYearsToRetirement = -5;
        Assert.assertEquals(expectedYearsToRetirement, yearsToRetirement);
    }

    @Test
    public void yearToRetire_WhenCalled_ReturnsCorrectYear() {
        RetirementChecker rc = new RetirementChecker();

        Integer yearToRetire = rc.yearToRetire(30, 2015);

        Integer expectedRetirementYear = 2045;

        Assert.assertEquals(expectedRetirementYear, yearToRetire);
    }
}
