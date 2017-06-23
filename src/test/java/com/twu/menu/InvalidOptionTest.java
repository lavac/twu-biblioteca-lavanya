package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.models.TestConsoleInputReader;
import com.twu.models.TestConsoleOutputWriter;
import com.twu.outputwriter.OutputWriter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InvalidOptionTest {

    @Test
    public void shouldDisplayAnErrorMessageOnSelectionOfInvalidMenuOption() {
        Repository bookInventory = new Repository(new UserAuthentication());
        String invalidMenuOption = "12";
        String expectedMessage = "Select a valid option!";
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add(expectedMessage);

        InvalidOption invalidOption = new InvalidOption();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(invalidMenuOption);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();

        assertEquals(expectedOutput, invalidOption.executeMenuOption(bookInventory, inputReader, outputWriter).getResponse());
    }
}
