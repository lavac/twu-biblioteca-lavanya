package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;


public class BookInventoryTest {

    @Test
    public void shouldReturnTheListOfBooks() {
        BookInventory bookInventory = new BookInventory();
        List<Book> expectedBooks = new ArrayList<>();

        expectedBooks.add(new Book("2 States", "Chetan Bhagat", 2009));
        expectedBooks.add(new Book("The Alchemist", "Poulo coelho", 1999));
        expectedBooks.add(new Book("Five point someone", "unknown", 2012));
        System.out.println(bookInventory.getAllBooks());

        assertEquals(expectedBooks, bookInventory.getAllBooks());
    }
}
