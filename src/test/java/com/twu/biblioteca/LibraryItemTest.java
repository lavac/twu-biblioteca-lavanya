package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryItemTest {

    @Test
    public void shouldReturnTheItem() {
        Book book = new Book("The Alchemist", "Poulo cohelo", 1999);
        LibraryItem libraryItem = new LibraryItem(book, "book");
        assertEquals(book, libraryItem.getItem());
    }

    @Test
    public void shouldReturnTheType() {
        Book book = new Book("The Alchemist", "Poulo coehlo", 1999);
        LibraryItem libraryItem = new LibraryItem(book, "book");
        String expectedType = "book";
        assertEquals(expectedType, libraryItem.getType());
    }
}
