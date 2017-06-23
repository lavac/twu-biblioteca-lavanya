package com.twu.menu;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import com.twu.biblioteca.QuitProgramException;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import org.junit.Test;

public class QuitOptionTest {


    @Test(expected = QuitProgramException.class)
    public void shouldDisplayMessageBeforeQuit() {
        Quit quitOption = new Quit();
        Repository repository = new Repository(new UserAuthentication());

        String quitMessage = "Thank you for using biblioteca :)";
        ArrayList<String> expectedOutput = new ArrayList<>();

        expectedOutput.add(quitMessage);
        quitOption.executeMenuOption(repository, null, null).getResponse();

        assertEquals(expectedOutput, quitOption.executeMenuOption(repository, null, null).getResponse());
    }
}
