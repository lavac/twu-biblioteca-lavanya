package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.models.TestConsoleInputReader;
import com.twu.models.TestConsoleOutputWriter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LogOutTest {

    @Test
    public void loggedInUserShouldBeAbleToLogout() {
        UserAuthentication userAuthentication = new UserAuthentication();
        Login login = new Login(userAuthentication);
        String inputOptions = "cus-1234\nlav";
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(inputOptions);
        Repository repository = new Repository(userAuthentication);
        Logout logout = new Logout(userAuthentication);
        List<String> expectedMessage = new ArrayList<>();

        expectedMessage.add("Successfully logged out!\n");

        assertEquals(expectedMessage, logout.executeMenuOption(repository, inputReader, outputWriter).getResponse());
    }
}
