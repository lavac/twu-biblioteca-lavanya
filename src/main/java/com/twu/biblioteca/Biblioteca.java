package com.twu.biblioteca;

import com.twu.outputwriter.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    List<Book> books = new ArrayList<>();

    Biblioteca() {
        books = new ListOfBooks().getListOfBooks();
    }

    public void startBiblioteca(OutputWriter writer) {
        writer.write(getWelcomeMessage());
        for (Book book : books) {
            writer.write(book.toString());
        }
    }

    public String getWelcomeMessage() {
        String welcomeMessage = "Hi, Welcome to Biblioteca ...";
        return welcomeMessage;
    }

    public List<Book> getListOfBooks() {
        return books;
    }
}
