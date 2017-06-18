package com.twu.biblioteca;

import com.twu.inputReader.InputReader;
import com.twu.menu.Menu;
import com.twu.menu.MenuOptionProvider;
import com.twu.menu.Response;
import com.twu.outputwriter.OutputWriter;

import static com.twu.constants.Constants.WELCOME_MESSAGE;

class LibrarySystem {
    private BookInventory bookInventory;
    private OutputWriter writer;
    private InputReader reader;
    private Menu menu;

    LibrarySystem(InputReader reader, OutputWriter writer) {
        this.reader = reader;
        this.writer = writer;
        menu = new Menu();
        bookInventory = new BookInventory();
    }

    Response getWelcomeMessage() {
        return new Response(WELCOME_MESSAGE);
    }

    Response performAction(String userInput) {
        MenuOptionProvider menuOption = new Menu().getMenuOption(userInput);
        return menuOption.executeMenuOption(bookInventory, reader);
    }

    void displayUserOptions() {
        menu.displayMenu(writer);
    }
}


