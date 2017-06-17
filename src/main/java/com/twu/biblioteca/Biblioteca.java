package com.twu.biblioteca;

import com.twu.inputReader.InputReader;
import com.twu.menu.Menu;
import com.twu.menu.MenuOptionProvider;
import com.twu.outputwriter.OutputWriter;
import java.util.List;
import java.util.Map;


public class Biblioteca {

    OutputWriter writer;
    InputReader reader;
    LibrarySystem library;
    final static String QuitOption = "2";

    Biblioteca(InputReader reader, OutputWriter writer) {
        this.reader = reader;
        this.writer = writer;
        library = new LibrarySystem();
    }

    void start() {
        writer.write(library.getWelcomeMessage());
        Menu menu = new Menu();
        String userInput;
        do {
            displayMenu(menu.getMenu());
            userInput = readUserInput();
            List<String> output = library.executeMenuOptionForUserInput(userInput);
            DisplayResult(output);
        }while (!userInput.equals(QuitOption));
    }

    private void displayMenu(Map<String, MenuOptionProvider> menuOptions) {
        for (Map.Entry<String, MenuOptionProvider> option : menuOptions.entrySet()) {
            MenuOptionProvider menuOption = option.getValue();
            writer.write(option.getKey() + " : " + menuOption.getMenuOption());
        }
    }

    private void DisplayResult(List<String> output) {
        for (String result : output) {
            writer.write(result);
        }
    }

    private String readUserInput() {
        return reader.read();
    }

}
