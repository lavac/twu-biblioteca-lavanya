package com.twu.menu;

import com.twu.biblioteca.BookInventory;
import com.twu.inputReader.InputReader;

import static com.twu.constants.Constants.CHECK_OUT_MENU_OPTION;

public class CheckOut implements MenuOptionProvider {

    @Override
    public Response executeMenuOption(BookInventory bookInventory, InputReader reader) {
        String bookToBeCheckedOut = reader.read();
        return bookInventory.checkOut(bookToBeCheckedOut);
    }

    @Override
    public String getMenuOption() {
        return CHECK_OUT_MENU_OPTION;
    }
}
