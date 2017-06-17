package com.twu.biblioteca;

import com.twu.menu.QuitOption;
import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class QuitOptionTest {

    @Test
    public void shouldDisplayMessageBeforeQuit() {
        QuitOption quitOption = new QuitOption();
        String quitMessage = "Thank you for using biblioteca :)";
        ArrayList<String> expectedOutput = new ArrayList<>();

        expectedOutput.add(quitMessage);

        assertEquals(expectedOutput, quitOption.executeMenuOption());
    }

    @Test
    public void shouldDisplayMenuOption() {
        QuitOption quitOption = new QuitOption();
        String expectedMenuOption = "Quit";

        assertEquals(expectedMenuOption, quitOption.getMenuOption());
    }
}
