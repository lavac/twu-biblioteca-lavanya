package com.twu.biblioteca;

import com.twu.outputwriter.OutputWriter;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    final static String stringFormat = String.format("%-20s  %-20s %s" , "Name",
            "Author",
            "YOP");
    List<Book> books = new ArrayList<>();

    Biblioteca() {
        books = new ListOfBooks().getListOfBooks();
    }

    public void start(OutputWriter writer) {
        writer.write(getWelcomeMessage());
        System.out.println(stringFormat);
        System.out.println("-------------------------------------------------");
        for (Book book : books) {
            writer.write(book.toString());
        }
    }

    String getWelcomeMessage() {
        String welcomeMessage = "Hi, Welcome to Biblioteca ...";
        return welcomeMessage;
    }

}
