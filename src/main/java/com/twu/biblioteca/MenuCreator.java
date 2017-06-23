package com.twu.biblioteca;

import com.twu.menu.CustomerMenu;
import com.twu.menu.GeneralMenu;
import com.twu.menu.LibrarianMenu;
import com.twu.menu.MenuProvider;

public class MenuCreator {

    Repository repository;
     UserAuthentication userAuthentication;

    public MenuCreator(Repository repository, UserAuthentication userAuthentication) {
        this.repository = repository;
        this.userAuthentication = userAuthentication;
    }

    protected MenuProvider getMenu() {
    return createMenu();
    }

    MenuProvider createMenu() {
        if(userAuthentication.getUser() == null)
            return new GeneralMenu(repository, userAuthentication);
        else if(userAuthentication.getUser().isAdmin())
            return new LibrarianMenu(repository, userAuthentication);
        return new CustomerMenu(repository, userAuthentication);
    }
}
