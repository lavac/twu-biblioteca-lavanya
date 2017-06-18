package com.twu.menu;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookInventory;
import com.twu.models.TestConsoleInputReader;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class CheckOutOptionTest {

    @Test
    public void checkedOutBookShouldNotBeDisplayedInAvailableBookList() {
        BookInventory bookInventory = new BookInventory();
        String bookNameToBeCheckedOut = "The Alchemist\n";
        Book bookToBeCheckedOut = new Book("The Alchemist", "Poulo coehlo", 1999);
        CheckOut checkOut = new CheckOut();

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookNameToBeCheckedOut);

        checkOut.executeMenuOption(bookInventory, inputReader);

        assertFalse(bookInventory.getAvailableBooks().contains(bookToBeCheckedOut));
    }

    @Test
    public void bookShouldBeCheckedOUtIfItIsAvailable() {
        BookInventory bookInventory = new BookInventory();
        List<Book> availableBooks = bookInventory.getAvailableBooks();
        String bookToBeCheckedOut = availableBooks.get(0).getName();
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Thank you! Enjoy the book.");

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookToBeCheckedOut);
        CheckOut checkOut = new CheckOut();

        assertEquals(expectedResult, checkOut.executeMenuOption(bookInventory, inputReader).getResponse());
    }

    @Test
    public void bookShouldNotBeCheckedOutIfItIsUnAvailable() {
        BookInventory bookInventory = new BookInventory();
        String bookToBeCheckedOut = "UnAnAvailableBook\n";
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("That book is not available.");

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookToBeCheckedOut);
        CheckOut checkOut = new CheckOut();

        assertEquals(expectedResult, checkOut.executeMenuOption(bookInventory, inputReader).getResponse());
    }

    @Test
    public void shouldDisplayMenuOption() {
        CheckOut checkOut = new CheckOut();
        String expectedMenuOption = "Check out";

        assertEquals(expectedMenuOption, checkOut.getMenuOption());
    }
}
