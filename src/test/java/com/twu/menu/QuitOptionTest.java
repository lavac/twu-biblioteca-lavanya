package com.twu.menu;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;

import com.twu.biblioteca.Repository;
import org.junit.Test;

public class QuitOptionTest {

    @Test
    public void shouldDisplayMessageBeforeQuit() {
        Quit quitOption = new Quit();
        Repository repository = new Repository();

        String quitMessage = "Thank you for using biblioteca :)";
        ArrayList<String> expectedOutput = new ArrayList<>();

        expectedOutput.add(quitMessage);

        assertEquals(expectedOutput, quitOption.executeMenuOption(repository, null).getResponse());
    }

    @Test
    public void shouldDisplayMenuOption() {
        Quit quitOption = new Quit();
        String expectedMenuOption = "Quit";

        assertEquals(expectedMenuOption, quitOption.getMenuOption());
    }
}
