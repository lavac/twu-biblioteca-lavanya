package com.twu.menu;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.Item;
import com.twu.biblioteca.Repository;
import com.twu.models.TestConsoleInputReader;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CheckOutOptionTest {

    @Test
    public void checkedOutBookShouldNotBeDisplayedInAvailableBookList() {
        Repository repository = new Repository();
        String bookNameToBeCheckedOut = "The Alchemist\n";
        Book bookToBeCheckedOut = new Book("The Alchemist", "Poulo coehlo", 1999);
        CheckOutBook checkOut = new CheckOutBook();

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookNameToBeCheckedOut);

        checkOut.executeMenuOption(repository, inputReader);

        assertFalse(repository.getAvailableItems().contains(bookToBeCheckedOut));
    }

    @Test
    public void bookShouldBeCheckedOUtIfItIsAvailable() {
        Repository repository = new Repository();
        List<Item> availableBooks = repository.getAvailableItems();
        String bookToBeCheckedOut = availableBooks.get(0).getName();
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Thank you! Enjoy the book.");

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookToBeCheckedOut);
        CheckOutBook checkOut = new CheckOutBook();

        assertEquals(expectedResult, checkOut.executeMenuOption(repository, inputReader).getResponse());
    }

    @Test
    public void bookShouldNotBeCheckedOutIfItIsUnAvailable() {
        Repository repository = new Repository();
        String bookToBeCheckedOut = "UnAnAvailableBook\n";
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("That book is not available.");

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookToBeCheckedOut);
        CheckOutBook checkOut = new CheckOutBook();

        assertEquals(expectedResult, checkOut.executeMenuOption(repository, inputReader).getResponse());
    }

    @Test
    public void shouldDisplayMenuOption() {
        CheckOutBook checkOut = new CheckOutBook();
        String expectedMenuOption = "Check out";

        assertEquals(expectedMenuOption, checkOut.getMenuOption());
    }
}
