package com.twu.biblioteca;

import com.twu.inputReader.InputReader;
import com.twu.menu.Response;
import com.twu.outputwriter.OutputWriter;

import static com.twu.constants.Constants.QUIT_OPTION;

class Biblioteca {
    private OutputWriter writer;
    private InputReader reader;
    private LibrarySystem library;

    Biblioteca(InputReader reader, OutputWriter writer) {
        this.reader = reader;
        this.writer = writer;
        library = new LibrarySystem(reader, writer);
    }

    void start() {
        writer.write(library.getWelcomeMessage());
        String userInput;
        do {
            library.displayUserOptions();
            userInput = reader.read();
            Response response = library.performAction(userInput);
            writer.write(response);
        } while (!userInput.equals(QUIT_OPTION));
    }

}
