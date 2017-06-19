package com.twu.menu;

import com.twu.biblioteca.Item;
import com.twu.biblioteca.Repository;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListBookOptionTest {

    @Test
    public void shouldDisplayAvailableBooks() {
        Repository bookInventory = new Repository();
        ListBooks listBookOption = new ListBooks();
        List<String> expectedResult = new ArrayList<>();
        final String stringFormat = String.format("%-20s  %-20s %s", "Name",
                                                  "Author",
                                                  "YOP"
        );

        expectedResult.add(stringFormat);
        for (Item book : bookInventory.getAvailableItems())
            expectedResult.add(book.toString());

        assertEquals(expectedResult, listBookOption.executeMenuOption(bookInventory, null).getResponse());
    }

    @Test
    public void shouldDisplayMenuOption() {
        Repository bookInventory = new Repository();
        ListBooks listBooks = new ListBooks();
        String expectedMenuOption = "List books";

        assertEquals(expectedMenuOption, listBooks.getMenuOption());
    }
}
