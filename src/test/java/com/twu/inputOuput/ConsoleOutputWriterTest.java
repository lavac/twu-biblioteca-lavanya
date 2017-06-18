package com.twu.inputOuput;

import com.twu.menu.Output;
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
        String expectedMessage = "test output writer\n" ;
        String input = "test output writer";

        outputWriter.write(new Output(input));

        assertEquals(expectedMessage, stringWriter.toString());
    }

}
