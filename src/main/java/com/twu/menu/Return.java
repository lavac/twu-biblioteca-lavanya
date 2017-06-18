package com.twu.menu;

import com.twu.biblioteca.BookInventory;
import com.twu.inputReader.InputReader;
import static com.twu.constants.Constants.RETURN_MENU_OPTION;

public class Return implements MenuOptionProvider {

    @Override
    public Response executeMenuOption(BookInventory bookInventory, InputReader reader) {
        String bookToBeReturned = reader.read();
        return bookInventory.returnBook(bookToBeReturned);
    }

    @Override
    public String getMenuOption() {
        return RETURN_MENU_OPTION;
    }
}
