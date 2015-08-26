package tests.E01;

import EFP.Console;
import EFP.E01.Greeter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GreeterTest {

    @Test
    public void sayHello_WhenCalled_OutputsGreetingToConsole() throws Exception {
        Console console = Mockito.mock(Console.class);
        Mockito.when(console.readLine()).thenReturn("Example");

        Greeter greeter = new Greeter(console);
        greeter.sayHello();

        Mockito.verify(console).println(Matchers.eq("Hello, Example, nice to meet you!"));
    }
}