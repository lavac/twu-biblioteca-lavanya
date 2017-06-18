package com.twu.menu;

import com.twu.biblioteca.BookInventory;
import com.twu.models.TestConsoleInputReader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class InvalidOptionTest {

        @Test
        public void shouldDisplayAnErrorMessageOnSelectionOfInvalidMenuOption() {
            BookInventory bookInventory = new BookInventory();
            String invalidMenuOption = "12";
            String expectedMessage = "Select a valid option!";
            List<String> expectedOutput = new ArrayList<>();
            expectedOutput.add(expectedMessage);
            InvalidOption invalidOption = new InvalidOption();
            TestConsoleInputReader inputReader = new TestConsoleInputReader(invalidMenuOption);

            assertEquals(expectedOutput,invalidOption.executeMenuOption(bookInventory, inputReader).getOutput());


        }


}
