package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BookInventory {

    private List<Book> books;

    BookInventory() {
        books = new ArrayList<>();
        makeAListOfBooks();
    }

    private void makeAListOfBooks() {
            books.add(new Book("2 States", "Chetan Bhagat", 2009));
            books.add(new Book("The Alchemist", "Poelo coehlo", 1999));
            books.add(new Book("Five point someone", "unknown", 2012));
    }

    public List<Book> getListOfBooks() {
        return books;
    }
}

