package com.twu.menu;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookInventory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListBookOptionTest {

    @Test
    public void shouldDisplayAvailableBooks() {

        ListBooks listBookOption = new ListBooks();
        List<String> expectedBooks = new ArrayList<>();
        final String stringFormat = String.format("%-20s  %-20s %s", "Name",
                                                  "Author",
                                                  "YOP"
        );

        expectedBooks.add(stringFormat);
        BookInventory bookInventory = new BookInventory();
        for (Book book : bookInventory.getAvailableBooks())
            expectedBooks.add(book.toString());

        assertEquals(expectedBooks, listBookOption.executeMenuOption(bookInventory, null).getOutput());
    }

    @Test
    public void shouldDisplayMenuOption() {
        ListBooks listBooks = new ListBooks();
        String expectedMenuOption = "List books";

        assertEquals(expectedMenuOption, listBooks.getMenuOption());
    }


}
