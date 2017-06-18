package com.twu.biblioteca;

import com.twu.models.TestConsoleInputReader;
import com.twu.models.TestConsoleOutputWriter;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void shouldDisplayMenuItemsOnWelcomeScreen(){
        ArrayList<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Hi, Welcome to Biblioteca ...");
        expectedOutput.add("1 : List books");
        expectedOutput.add("2 : Check out");
        expectedOutput.add("3 : Return");
        expectedOutput.add("4 : Quit");
        expectedOutput.add("Thank you for using biblioteca :)");
        String quitOption = "4\n";

        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(quitOption);

        Biblioteca biblioteca = new Biblioteca(inputReader,outputWriter);
        biblioteca.start();

        assertEquals(expectedOutput, outputWriter.getOutput());
    }


    @Test
    public void shouldKeepOnDisplayingMenuUntilUserQuit() {
        String optionOne = "1\n";
        String optionTwo = "1\n";
        String optionThree = "4\n";
        String inputOptions = optionOne + optionTwo + optionThree;
        int expectedNumberOfIterations = 3;

        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(inputOptions);

        Biblioteca biblioteca = new Biblioteca(inputReader,outputWriter);
        biblioteca.start();

        assertEquals(expectedNumberOfIterations, inputReader.getNumberOfIterations());
    }
}
