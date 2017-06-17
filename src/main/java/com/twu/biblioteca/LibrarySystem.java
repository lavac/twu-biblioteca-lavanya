package com.twu.biblioteca;

import com.twu.menu.Menu;
import com.twu.menu.MenuOptionProvider;
import java.util.List;

 class LibrarySystem {
    private String welcomeMessage = "Hi, Welcome to Biblioteca ...";
    Menu menu;

    LibrarySystem() {
        menu = new Menu();
    }

    String getWelcomeMessage() {
        return welcomeMessage;
    }

    public List<String> executeMenuOptionForUserInput(String userInput) {
        List<String> output = null;
        if (menu.getMenu().containsKey(userInput)) {
            MenuOptionProvider menuOption = menu.getMenu().get(userInput);
             output = menuOption.executeMenuOption();
        }
        return output;
    }

}


