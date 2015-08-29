package tests.E05;


import EFP.Console;
import EFP.E03.QuoteAndAuthor;
import EFP.E04.MadLib;
import EFP.E05.Calculator;
import EFP.E05.SimpleMath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class SimpleMathTest {
    @Test
    public void SimpleMath_ProvidedWithValidNumbers_OutputsResults() {
        Console console = Mockito.mock(Console.class);
        Calculator calculator = new Calculator();

        Mockito.when(console.readLine())
                .thenReturn("10")
                .thenReturn("5");

        SimpleMath sm = new SimpleMath(console, calculator);

        sm.start();

        Mockito.verify(console).println(Matchers.eq("10 + 5 = 15\r\n10 - 5 = 5\r\n10 * 5 = 50\r\n10 / 5 = 2"));
    }
}