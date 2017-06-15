package com.twu.biblioteca;

import org.junit.Test;
import java.io.*;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void shouldGetWelcomeMessage() {
        String expectedMessage = "Hi, Welcome to Biblioteca ...";
        Biblioteca biblioteca = new Biblioteca();
        assertEquals(expectedMessage, biblioteca.getWelcomeMessage());
    }

    @Test
    public void shouldReturnWelcomeMessageAndListOfboksOnceStarted(){
        Biblioteca biblioteca = new Biblioteca();
        StringWriter stringWriter = new StringWriter();
        BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter
                (bufferedWriter);
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Hi, Welcome to Biblioteca ...");
        expectedOutput.add("2 States");
        expectedOutput.add("The Alchemist");
        expectedOutput.add("Five point someone");

        biblioteca.startBiblioteca(outputWriter);

        assertEquals(expectedOutput, outputWriter.getOutput());
    }
}
