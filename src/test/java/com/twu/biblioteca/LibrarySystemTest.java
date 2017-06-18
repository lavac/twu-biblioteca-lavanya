package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class LibrarySystemTest {

    @Test
    public void librarySystemShouldPerformActionAsPerTheUserInput() {
        String userInput = "4";
        LibrarySystem librarySystem = new LibrarySystem(null, null);
        List<String>  expectedOutput = new ArrayList<>();
        expectedOutput.add("Thank you for using biblioteca :)");
        assertEquals(expectedOutput, librarySystem.performAction(userInput).getResponse());
    }
}
