package com.twu.biblioteca;

import com.twu.models.TestBiblioteca;
import com.twu.models.TestConsoleInputReader;
import com.twu.models.TestConsoleOutputWriter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BibliotecaTest {

    @Test
    public void shouldCallStartMethod() {
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();
        TestConsoleInputReader inputReader = new TestConsoleInputReader("q\n");
        TestBiblioteca testBiblioteca = new TestBiblioteca(inputReader, outputWriter);

        testBiblioteca.start();

        assertTrue(testBiblioteca.isBibliotecaStarted());
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();
        TestConsoleInputReader inputReader = new TestConsoleInputReader("q\n");
        TestBiblioteca testBiblioteca = new TestBiblioteca(inputReader, outputWriter);

        testBiblioteca.displayWelcomeMessage();

        assertTrue(testBiblioteca.isWelcomeMessageDisplayed());
    }

    @Test
    public void shouldKeepOnDisplayingMenuUntilUserQuit() {
        String optionOne = "3\n";
        String optionTwo = "4\n";
        String optionThree = "q\n";
        String inputOptions = optionOne + optionTwo + optionThree;
        int expectedNumberOfIterations = 3;

        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(inputOptions);

        TestBiblioteca testBiblioteca = new TestBiblioteca(inputReader, outputWriter);
        testBiblioteca.start();
        assertEquals(expectedNumberOfIterations, inputReader.getNumberOfIterations());
    }
}
