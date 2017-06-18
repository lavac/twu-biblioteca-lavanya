package com.twu.menu;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

import com.twu.biblioteca.BookInventory;
import org.junit.Test;

public class QuitOptionTest {

    @Test
    public void shouldDisplayMessageBeforeQuit() {
        Quit quitOption = new Quit();
        String quitMessage = "Thank you for using biblioteca :)";
        ArrayList<String> expectedOutput = new ArrayList<>();

        expectedOutput.add(quitMessage);

        BookInventory bookInventory = null;
        assertEquals(expectedOutput, quitOption.executeMenuOption(bookInventory, null).getOutput());
    }

    @Test
    public void shouldDisplayMenuOption() {
        Quit quitOption = new Quit();
        String expectedMenuOption = "Quit";

        assertEquals(expectedMenuOption, quitOption.getMenuOption());
    }
}
