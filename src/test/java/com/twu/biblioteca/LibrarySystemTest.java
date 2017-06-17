package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LibrarySystemTest {

    @Test
    public void librarySystemShouldPerformActionAsPerTheUserInput() {
        final String stringFormat = String.format("%-20s  %-20s %s", "Name",
                                                         "Author",
                                                         "YOP"
        );
        String userInput = "1";
        LibrarySystem librarySystem = new LibrarySystem();
        List<String>  expectedOutput = new ArrayList<>();
        expectedOutput.add(stringFormat);
        expectedOutput.add(new Book("2 States", "Chetan Bhagat", 2009).toString());
        expectedOutput.add(new Book("The Alchemist", "Poulo coehlo", 1999).toString());
        expectedOutput.add(new Book("Five point someone", "unknown", 2012).toString());

        assertEquals(expectedOutput, librarySystem.executeMenuOptionForUserInput(userInput));
    }

}
