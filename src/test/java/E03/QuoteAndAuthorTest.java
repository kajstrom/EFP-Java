package E03;

import fi.kajstrom.EFP.Console;
import fi.kajstrom.EFP.E03.QuoteAndAuthor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class QuoteAndAuthorTest {
    @Test
    public void QueteAndAuthor_WhenCalled_OutputsQuoteWithAuthor() {
        Console console = Mockito.mock(Console.class);

        Mockito.when(console.readLine()).thenReturn("There can be only one!").thenReturn("The Highlander");

        QuoteAndAuthor qoa = new QuoteAndAuthor(console);

        qoa.start();

        Mockito.verify(console).println(Matchers.eq("The Highlander says, \"There can be only one!\""));
    }
}