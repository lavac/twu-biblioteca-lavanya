package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class ListOfBooks {

    private ArrayList<Book> books = new ArrayList<>();

    ListOfBooks() {
        MakeAListOfBooks();
    }

    private void MakeAListOfBooks() {
            books.add(new Book("2 States", "Chetan Bhagat", 2009));
            books.add(new Book("The Alchemist", "Poelo coehlo", 1999));
            books.add(new Book("Five point someone", "unknown", 2012));
    }

    public List<Book> getListOfBooks() {
        return books;
    }
}

