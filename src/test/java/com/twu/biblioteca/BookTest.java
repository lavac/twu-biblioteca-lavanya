package com.twu.biblioteca;

import org.junit.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void shouldGetListOfBooks() {
        List<Book> expectedListOfBooks = new ArrayList<>();
        expectedListOfBooks.add(new Book("2 States"));
        expectedListOfBooks.add(new Book("The Alchemist"));
        expectedListOfBooks.add(new Book("Five point someone"));

        Biblioteca biblioteca = new Biblioteca();

        assertEquals(expectedListOfBooks, biblioteca.getListOfBooks());
    }
}
