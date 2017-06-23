package com.twu.menu;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Item;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.models.TestConsoleInputReader;
import com.twu.models.TestConsoleOutputWriter;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CheckOutOptionTest {

    @Test
    public void checkedOutBookShouldNotBeDisplayedInAvailableBookList() {
        Repository repository = new Repository(new UserAuthentication());
        String bookNameToBeCheckedOut = "The Alchemist\n";
        Book bookToBeCheckedOut = new Book("The Alchemist", "Poulo coehlo", 1999);
        CheckOutItem checkOut = new CheckOutItem("book");

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookNameToBeCheckedOut);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();

        checkOut.executeMenuOption(repository, inputReader, outputWriter);

        assertFalse(repository.getItems("book").contains(bookToBeCheckedOut));
    }

    @Test
    public void bookShouldBeCheckedOUtIfItIsAvailable() {
        Repository repository = new Repository(new UserAuthentication());
        List<Item> availableBooks = repository.getItems("book");
        String bookToBeCheckedOut = availableBooks.get(0).getName();
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Thank you! Enjoy the book!\n");

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookToBeCheckedOut);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();


        CheckOutItem checkOut = new CheckOutItem("book");

        assertEquals(expectedResult, checkOut.executeMenuOption(repository, inputReader, outputWriter).getResponse());
    }

    @Test
    public void bookShouldNotBeCheckedOutIfItIsUnAvailable() {
        Repository repository = new Repository(new UserAuthentication());
        String bookToBeCheckedOut = "UnAnAvailableBook\n";
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("That book is not available!\n");

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookToBeCheckedOut);
        TestConsoleOutputWriter outputWriter = new TestConsoleOutputWriter();

        CheckOutItem checkOut = new CheckOutItem("book");

        assertEquals(expectedResult, checkOut.executeMenuOption(repository, inputReader, outputWriter).getResponse());
    }

}
