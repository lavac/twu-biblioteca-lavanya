package com.twu.biblioteca;

import com.twu.inputReader.InputReader;
import com.twu.menu.Output;
import com.twu.outputwriter.OutputWriter;
import static com.twu.constants.Constants.QUIT_OPTION;

public class Biblioteca {
    private OutputWriter writer;
    private InputReader reader;
    private LibrarySystem library;

    public Biblioteca(InputReader reader, OutputWriter writer) {
        this.reader = reader;
        this.writer = writer;
        library = new LibrarySystem(reader, writer);
    }

    void start() {
        writer.write(new Output(library.getWelcomeMessage()));
        String userInput;
        do {
            library.displayUserOptions();
            userInput = reader.read();
            Output output = library.performAction(userInput);
            writer.write(output);
        } while (!userInput.equals(QUIT_OPTION));
    }

}
