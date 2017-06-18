package com.twu.biblioteca;

import com.twu.inputReader.InputReader;
import com.twu.menu.Menu;
import com.twu.menu.MenuOptionProvider;
import com.twu.menu.Output;
import com.twu.outputwriter.OutputWriter;
import static com.twu.constants.Constants.WELCOME_MESSAGE;

class LibrarySystem {
    Menu menu;
    BookInventory bookInventory;
    OutputWriter writer;
    InputReader reader;

    LibrarySystem(InputReader reader, OutputWriter writer) {
        this.reader = reader;
        this.writer = writer;
        menu = new Menu();
        bookInventory = new BookInventory();
    }

    String getWelcomeMessage() {
        return WELCOME_MESSAGE;
    }

    public Output performAction(String userInput) {
        MenuOptionProvider menuOption = new Menu().getMenuOption(userInput);
        Output output = menuOption.executeMenuOption(bookInventory, reader);
        return output;
    }

    public void displayUserOptions() {
        menu.displayMenu(writer);
    }
}


