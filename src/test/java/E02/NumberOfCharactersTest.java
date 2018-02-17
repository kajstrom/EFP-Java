package E02;

import fi.kajstrom.EFP.Console;
import fi.kajstrom.EFP.E02.NumberOfCharacters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class NumberOfCharactersTest {

    @Test
    public void NumberOfCharactersTest_CalledWithString_OutputsLengthMessage() {
        Console console = Mockito.mock(Console.class);
        Mockito.when(console.readLine()).thenReturn("Test");

        NumberOfCharacters noc = new NumberOfCharacters(console);
        noc.start();

        Mockito.verify(console).println(Matchers.eq("Test has 4 characters."));
    }

    @Test
    public void inputLengthMessage_CalledWithEmptyString_ReturnsErrorMessage() {
        Console console = Mockito.mock(Console.class);
        Mockito.when(console.readLine()).thenReturn("").thenReturn("Test");

        NumberOfCharacters noc = new NumberOfCharacters(console);
        noc.start();

        Mockito.verify(console).println(Matchers.eq("Please enter a string..."));
    }
}