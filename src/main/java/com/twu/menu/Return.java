package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.inputReader.InputReader;
import static com.twu.constants.Constants.RETURN_MENU_OPTION;

public class Return implements MenuOptionProvider {



    @Override
    public Response executeMenuOption(Repository repository, InputReader reader) {
        String bookToBeReturned = reader.read();
        return repository.returnItem(bookToBeReturned);
    }

    @Override
    public String getMenuOption() {
        return RETURN_MENU_OPTION;
    }
}
