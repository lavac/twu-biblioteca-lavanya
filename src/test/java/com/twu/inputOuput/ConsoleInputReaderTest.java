package com.twu.inputOuput;

import com.twu.inputReader.ConsoleInputReader;
import org.junit.Test;
import java.io.BufferedReader;
import java.io.StringReader;
import static org.junit.Assert.assertEquals;

public class ConsoleInputReaderTest {

    @Test
    public void shouldReadTheProvidedInput(){
        String expectedMessage = "test input reader" ;
        StringReader stringReader = new StringReader("test input reader");

        BufferedReader bufferedReader = new BufferedReader(stringReader);
        ConsoleInputReader inputReader = new ConsoleInputReader
                (bufferedReader);

        assertEquals(expectedMessage, inputReader.read());
    }
}
