package E05;


import fi.kajstrom.EFP.Console;
import fi.kajstrom.EFP.E05.Calculator;
import fi.kajstrom.EFP.E05.SimpleMath;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

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