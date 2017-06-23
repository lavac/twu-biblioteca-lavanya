package com.twu.inputOuput;

import com.twu.menu.Response;
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

        String input = "test output writer";
        String expectedMessage = "test output writer\n" ;

        outputWriter.write(new Response(input));

        assertEquals(expectedMessage, stringWriter.toString());
    }

}
