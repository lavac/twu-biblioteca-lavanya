package com.twu.menu;

import com.twu.biblioteca.BookInventory;
import com.twu.inputReader.InputReader;

import static com.twu.constants.Constants.INVALID_OPTION_MESSAGE;

public class InvalidOption implements MenuOptionProvider {

    @Override
    public Response executeMenuOption(BookInventory bookInventory, InputReader reader) {
        return new Response(INVALID_OPTION_MESSAGE);
    }

    @Override
    public String getMenuOption() {
        return null;
    }
}
