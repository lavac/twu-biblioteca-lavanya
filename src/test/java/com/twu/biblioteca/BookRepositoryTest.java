package com.twu.biblioteca;

import com.twu.menu.CheckOutBook;
import com.twu.models.TestConsoleInputReader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookRepositoryTest {

    @Test
    public void shouldReturnTheListOfBooks() {
        Repository bookInventory = new Repository();
        List<Book> expectedBooks = new ArrayList<>();

        expectedBooks.add(new Book("2 States", "Chetan Bhagat", 2009));
        expectedBooks.add(new Book("The Alchemist", "Poulo coelho", 1999));
        expectedBooks.add(new Book("Five point someone", "unknown", 2012));

        assertEquals(expectedBooks, bookInventory.getAllItems());
    }

    @Test
    public void shouldReturnTheListOfAvailableBooks() {
        Repository bookInventory = new Repository();
        List<Book> expectedBooks = new ArrayList<>();

        expectedBooks.add(new Book("The Alchemist", "Poulo coelho", 1999));
        expectedBooks.add(new Book("Five point someone", "unknown", 2012));
        String bookToBeCheckedOut = "2 States";

        TestConsoleInputReader inputReader = new TestConsoleInputReader(bookToBeCheckedOut);
        CheckOutBook checkOutBook = new CheckOutBook();

        checkOutBook.executeMenuOption(bookInventory, inputReader).getResponse();

        assertEquals(expectedBooks, bookInventory.getAvailableItems());
    }
}

