package com.twu.biblioteca;

import com.twu.inputReader.InputReader;
import com.twu.menu.Response;
import com.twu.outputwriter.OutputWriter;
import static com.twu.constants.Constants.QUIT_MESSAGE;

public class Biblioteca {
    private OutputWriter writer;
    private InputReader reader;
    private LibrarySystem library;
    UserAuthentication userAuthentication;

    public Biblioteca(InputReader reader, OutputWriter writer, UserAuthentication userAuthentication) {
        this.reader = reader;
        this.writer = writer;
        this.userAuthentication = userAuthentication;
        library = new LibrarySystem(reader, writer, userAuthentication);
    }

    protected void start() {
        writer.write(library.getWelcomeMessage());
        String userInput;
        try {
            do {
                library.displayUserOptions();
                userInput = reader.read();
                Response response = library.performAction(userInput);
                writer.write(response);
            } while (true);
        } catch (QuitProgramException exception){}
        finally {
            writer.write(new Response(QUIT_MESSAGE));
        }
    }
}
