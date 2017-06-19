package com.twu.biblioteca;

import com.twu.inputReader.InputReader;
import com.twu.menu.Menu;
import com.twu.menu.MenuOptionProvider;
import com.twu.menu.Response;
import com.twu.outputwriter.OutputWriter;

import static com.twu.constants.Constants.WELCOME_MESSAGE;
//to do -: include test fro gerWelcome message and displayUserOptions

class LibrarySystem {
    private Repository repository;
    private OutputWriter writer;
    private InputReader reader;
    private Menu menu;

    LibrarySystem(InputReader reader, OutputWriter writer) {
        repository = new Repository();
        this.reader = reader;
        this.writer = writer;
        menu = new Menu(repository);
    }

    Response getWelcomeMessage() {
        return new Response(WELCOME_MESSAGE);
    }

    Response performAction(String userInput) {
        MenuOptionProvider menuOption = menu.getMenuOption(userInput);
        return menuOption.executeMenuOption(repository,reader);
    }

    void displayUserOptions() {
        menu.displayMenu(writer);
    }
}


