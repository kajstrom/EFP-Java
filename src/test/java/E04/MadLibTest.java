package E04;

import fi.kajstrom.EFP.Console;
import fi.kajstrom.EFP.E04.MadLib;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MadLibTest {
    @Test
    public void MadLib_ProvidedWithValidStrings_OutputsStory() {
        Console console = Mockito.mock(Console.class);

        Mockito.when(console.readLine())
                .thenReturn("dog")
                .thenReturn("walk")
                .thenReturn("blue")
                .thenReturn("quickly");

        MadLib ml = new MadLib(console);

        ml.start();

        Mockito.verify(console).println(Matchers.eq("Do you walk your blue dog quickly? That's hilarious!"));
    }
}