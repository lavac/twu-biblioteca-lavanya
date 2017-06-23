package com.twu.menu;


import com.twu.biblioteca.Repository;
import com.twu.biblioteca.User;
import com.twu.biblioteca.UserAuthentication;
import com.twu.models.TestBiblioteca;
import com.twu.models.TestConsoleInputReader;
import com.twu.models.TestConsoleOutputWriter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LogInTest {

    @Test
    public void loginShouldBeSuccessfulForRegisteredUser() {
        UserAuthentication userAuthentication = new UserAuthentication();
        Login login = new Login(userAuthentication);
        String inputOptions = "cus-1234\nlav";

        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(inputOptions);
        Repository repository = new Repository(userAuthentication);
        List<String> expectedMessage = new ArrayList<>();
        expectedMessage.add("Successfully logged in!\n");

        assertEquals(expectedMessage, login.executeMenuOption(repository, inputReader, outputWriter).getResponse());

    }

    @Test
    public void unRegisteredUserShouldNotBeAbleToLogIn() {
        UserAuthentication userAuthentication = new UserAuthentication();
        Login login = new Login(userAuthentication);
        String inputOptions = "wrongId\nwrong";
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();
        TestConsoleInputReader inputReader = new TestConsoleInputReader(inputOptions);
        Repository repository = new Repository(userAuthentication);
        List<String> expectedMessage = new ArrayList<>();

        expectedMessage.add("Failed to login! Enter valid credentials!");

        assertEquals(expectedMessage, login.executeMenuOption(repository, inputReader, outputWriter).getResponse());

    }
}
