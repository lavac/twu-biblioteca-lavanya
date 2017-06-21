package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.inputReader.InputReader;

import static com.twu.constants.Constants.CHECK_OUT_MENU_OPTION;

public class CheckOutBook implements MenuOptionProvider {
    @Override
    public Response executeMenuOption(Repository repository, InputReader reader) {
        String bookToBeCheckedOut = reader.read();
        return repository.checkOutBook(bookToBeCheckedOut, null);
    }
}
