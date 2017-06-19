package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.inputReader.InputReader;

import static com.twu.constants.Constants.QUIT_MENU_OPTION;
import static com.twu.constants.Constants.QUIT_MESSAGE;

public class Quit implements MenuOptionProvider {

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader) {
        return new Response(QUIT_MESSAGE);
    }

    @Override
    public String getMenuOption() {
        return QUIT_MENU_OPTION;
    }
}
