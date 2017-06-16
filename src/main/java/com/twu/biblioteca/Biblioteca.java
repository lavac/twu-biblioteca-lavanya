package com.twu.biblioteca;

import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    final static String stringFormat = String.format("%-20s  %-20s %s" , "Name",
            "Author",
            "YOP");
    OutputWriter writer;
    InputReader reader;

    List<Book> books = new ArrayList<>();

    Biblioteca(InputReader reader, OutputWriter writer) {
        books = new BookInventory().getListOfBooks();
        this.reader = reader;
        this.writer = writer;
    }

    public void start() {
        writer.write(getWelcomeMessage());
        Menu menu = new Menu();
        menu.displayMenu(writer);
        selectOption();
        }

    void selectOption() {

        while(true) {
            String str = reader.read();
            switch (str) {
                case "List books":
                    displayAvailableBooks();
                    break;
                default:
                    writer.write("Invalid Option");
            }
        }
    }

    String getWelcomeMessage() {
        String welcomeMessage = "Hi, Welcome to Biblioteca ...";
        return welcomeMessage;
    }

    void displayAvailableBooks() {
        writer.write(stringFormat);
        for (Book book : books) {
            writer.write(book.toString());
        }
    }
}
