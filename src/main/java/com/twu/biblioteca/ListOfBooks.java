package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class ListOfBooks {

    private ArrayList<Book> books = new ArrayList<>();

    ListOfBooks() {
        MakeAListOfBooks();
    }

    private void MakeAListOfBooks() {
            books.add(new Book("2 States"));
            books.add(new Book("The Alchemist"));
            books.add(new Book("Five point someone"));
    }

    public List<Book> getListOfBooks() {
        return books;
    }
}

