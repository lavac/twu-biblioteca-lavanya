package com.twu.biblioteca;

import com.twu.inputReader.ConsoleInputReader;
import com.twu.models.TestConsoleInputReader;
import com.twu.models.TestConsoleOutputWriter;
import org.junit.Test;
import java.io.*;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void shouldDisplayMenuItemsOnWelcomeScreen(){
        ArrayList<String> expectedOutput = new ArrayList<>();
        String quitOption = "2";
        expectedOutput.add("Hi, Welcome to Biblioteca ...");
        expectedOutput.add("1 : ListBooks");
        expectedOutput.add("2 : Quit");
        expectedOutput.add("Thank you for using biblioteca :)");
        StringWriter stringWriter = new StringWriter();
        BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter(bufferedWriter);
        StringReader stringReader = new StringReader(quitOption);
        BufferedReader bufferedReader = new BufferedReader(stringReader);
        ConsoleInputReader inputReader = new ConsoleInputReader(bufferedReader);
        Biblioteca biblioteca = new Biblioteca(inputReader,outputWriter);

        biblioteca.start();

        assertEquals(expectedOutput, outputWriter.getOutput());
    }


    @Test
    public void shouldKeepOnDisplayingMenuUntilUserQuit() {
        String optionOne = "1\n";
        String optionTwo = "1\n";
        String optionThree = "2\n";
        String inputOptions = optionOne + optionTwo + optionThree;
        int numberOfIterations = 3;
        StringWriter stringWriter = new StringWriter();
        BufferedWriter bufferedWriter = new BufferedWriter(stringWriter);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter(bufferedWriter);
        TestConsoleInputReader inputReader = new TestConsoleInputReader(inputOptions);
        Biblioteca biblioteca = new Biblioteca(inputReader,outputWriter);

        biblioteca.start();

        assertEquals(numberOfIterations, inputReader.getNumberOfIterations());
    }
}
