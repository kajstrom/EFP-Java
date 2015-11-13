package tests.E06;

import EFP.Console;
import EFP.E06.RetirementCalculator;
import EFP.E06.RetirementChecker;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Calendar;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class RetirementCalculatorTest {
    @Test
    public void RetirementCalculator_ProvidedWithValidRetirementAgeAndCurrentAge_OutputsRetirementInformation() {
        Console console = Mockito.mock(Console.class);
        RetirementChecker checker = new RetirementChecker();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Integer age = 31;
        Integer ageToRetire = 65;
        int expectedYearsToRetirement = ageToRetire - age;
        int expectedRetirementYear = currentYear + expectedYearsToRetirement;

        Mockito.when(console.readLine())
                .thenReturn(age.toString())
                .thenReturn(ageToRetire.toString());

        RetirementCalculator rc = new RetirementCalculator(console, checker);

        rc.start();

        Mockito.verify(console).println(Matchers.eq("You have " + expectedYearsToRetirement + " years left until you can retire."));
        Mockito.verify(console).println(Matchers.eq("It's " + currentYear + ", so you can retire in " + expectedRetirementYear + "."));
    }

    @Test
    public void RetirementCalculator_ProvidedWithPassedRetirementAge_OutputsRetireAlreadyMessage() {
        Console console = Mockito.mock(Console.class);
        RetirementChecker checker = new RetirementChecker();

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        Integer age = 70;
        Integer ageToRetire = 65;

        Mockito.when(console.readLine())
                .thenReturn(age.toString())
                .thenReturn(ageToRetire.toString());

        RetirementCalculator rc = new RetirementCalculator(console, checker);

        rc.start();

        Mockito.verify(console).println(Matchers.eq("You should have retired already!"));
    }
}
