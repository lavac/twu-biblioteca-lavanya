package com.twu.biblioteca;

import com.twu.inputReader.InputReader;
import com.twu.menu.*;
import com.twu.outputwriter.OutputWriter;
import java.util.HashMap;
import java.util.Map;
import static com.twu.constants.Constants.WELCOME_MESSAGE;

public class LibrarySystem {
    private Repository repository;
    private OutputWriter writer;
    private InputReader reader;
    MenuCreator menuCreator;
    UserAuthentication userAuthentication;
    Map<String, MenuProvider> selectMenu;

    protected LibrarySystem(InputReader reader, OutputWriter writer, UserAuthentication userAuthentication) {
        repository = new Repository(userAuthentication);
        selectMenu = new HashMap<>();
        this.userAuthentication = userAuthentication;
        menuCreator = new MenuCreator(repository, userAuthentication);
        this.reader = reader;
        this.writer = writer;
    }

    public Response getWelcomeMessage() {
        return new Response(WELCOME_MESSAGE);
    }

    Response performAction(String userInput) {
        MenuOptionProvider menuOption = menuCreator.getMenu().getMenuOption(userInput);
        return menuOption.executeMenuOption(repository, reader, writer);
    }

    protected void displayUserOptions() {
        writer.write(new Response("Please select an option!"));
        menuCreator.getMenu().displayMenu(writer);
    }
}


