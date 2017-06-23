package com.twu.menu;

import com.twu.biblioteca.*;
import com.twu.models.TestConsoleInputReader;
import com.twu.models.TestConsoleOutputWriter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ListCheckedOutItemsTest {

    @Test
    public void shouldDisplayCheckedOutBooks() {
        UserAuthentication userAuthentication = new UserAuthentication();

        Repository repository = new Repository(userAuthentication);
        String bookNameToBeCheckedOut = "The Alchemist\n";
        userAuthentication.setUser(new User("cus-1234", "lav", "lav@g.com", "mysore", "234567", false));

        CheckOutItem checkOut = new CheckOutItem("book");

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookNameToBeCheckedOut);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();

        checkOut.executeMenuOption(repository, inputReader, outputWriter);
        ListCheckedOutItems listCheckedOutBooks = new ListCheckedOutItems("book");
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("book				 User");
        expectedOutput.add("The Alchemist  cus-1234");

        assertEquals(expectedOutput, listCheckedOutBooks.executeMenuOption(repository, inputReader, outputWriter).getResponse());
    }

    @Test
    public void shouldDisplayCheckedOutMovies() {
        UserAuthentication userAuthentication = new UserAuthentication();

        Repository repository = new Repository(userAuthentication);
        String movieToBeCheckedOut = "Money ball\n";
        userAuthentication.setUser(new User("cus-1234", "lav", "lav@g.com", "mysore", "234567", false));

        CheckOutItem checkOut = new CheckOutItem("movie");

        TestConsoleInputReader inputReader = new TestConsoleInputReader(movieToBeCheckedOut);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();

        checkOut.executeMenuOption(repository, inputReader, outputWriter);
        ListCheckedOutItems listCheckedOutMovies = new ListCheckedOutItems("movie");
        List<String> expectedOutput = new ArrayList<>();
        expectedOutput.add("movie				 User");
        expectedOutput.add("Money ball  cus-1234");

        assertEquals(expectedOutput, listCheckedOutMovies.executeMenuOption(repository, inputReader, outputWriter).getResponse());

    }
}
