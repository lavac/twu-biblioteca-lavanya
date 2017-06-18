package com.twu.menu;

import com.twu.biblioteca.BookInventory;
import com.twu.inputReader.InputReader;
import java.util.ArrayList;
import java.util.List;
import static com.twu.constants.Constants.QUIT_MENU_OPTION;
import static com.twu.constants.Constants.QUIT_MESSAGE;

public class Quit implements MenuOptionProvider {

    @Override
    public Output executeMenuOption(BookInventory bookInventory, InputReader reader) {
        List<String> list = new ArrayList<>();
        list.add(QUIT_MESSAGE);
        return new Output(list);
    }

    @Override
    public String getMenuOption() {
        return QUIT_MENU_OPTION;
    }
}
