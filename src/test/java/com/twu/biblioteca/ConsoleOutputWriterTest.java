package com.twu.biblioteca;

import com.twu.outputwriter.ConsoleOutputWriter;
import org.junit.Test;
import java.io.BufferedWriter;
import java.io.StringWriter;
import static org.junit.Assert.assertEquals;

public class ConsoleOutputWriterTest {

    @Test
    public void shouldWriteTheProvidedInput(){
        StringWriter stringWriter = new StringWriter();
        BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);
        ConsoleOutputWriter outputWriter = new ConsoleOutputWriter(bufferedWriter);
        String expectedMessage = "Hi, Welcome to Biblioteca ...\n" ;
        String input = "Hi, Welcome to Biblioteca ...";

        outputWriter.write(input);

        assertEquals(expectedMessage, stringWriter.toString());
    }

}
