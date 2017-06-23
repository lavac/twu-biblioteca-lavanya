package com.twu.biblioteca;


import com.twu.inputReader.ConsoleInputReader;
import com.twu.models.TestConsoleInputReader;
import com.twu.models.TestConsoleOutputWriter;
import com.twu.models.TestLibrarySystem;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibrarySystemTest {

    @Test
    public void shouldDisplayWelcomeMessage() {
        LibrarySystem librarySystem = new LibrarySystem(null, null, null);
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Hi, Welcome to Biblioteca ...\n");

        assertEquals(expectedOutput, librarySystem.getWelcomeMessage().getResponse());
    }

    @Test(expected = QuitProgramException.class)
    public void librarySystemShouldPerformActionAsPerTheUserInput() {
        String userInput = "q";
        LibrarySystem librarySystem = new LibrarySystem(null, null, new UserAuthentication());
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("Thank you for using biblioteca :)");

        assertEquals(expectedOutput, librarySystem.performAction(userInput).getResponse());
    }

    @Test
    public void libraryShouldDisplayMenu() {
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();
        TestLibrarySystem testLibrarySystem = new TestLibrarySystem(null, outputWriter);
        testLibrarySystem.displayUserOptions();

        assertTrue(testLibrarySystem.isMenuDisplayed());
    }
}
