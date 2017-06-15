package com.twu.biblioteca;

import com.twu.testModules.TestConsoleOutputWriter;
import org.junit.Test;
import java.io.*;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {


    @Test
    public void shouldDisplayMenuItemsOnWelcomeScreen(){
        Biblioteca biblioteca = new Biblioteca();
        StringWriter stringWriter = new StringWriter();
        BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter
                (bufferedWriter);
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Hi, Welcome to Biblioteca ...");
        expectedOutput.add(new Book("2 States", "Chetan Bhagat",2009).toString());
        expectedOutput.add(new Book("The Alchemist", "Poelo coehlo",1999).toString());
        expectedOutput.add(new Book("Five point someone", "unknown",2012)
                                   .toString());

        biblioteca.start(outputWriter);

        assertEquals(expectedOutput, outputWriter.getOutput());
    }
}
