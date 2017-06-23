package com.twu.models;

import com.twu.biblioteca.MenuCreator;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.menu.MenuProvider;

public class TestMenuCreator extends MenuCreator {
    private boolean isGetMenuCalled;

    public TestMenuCreator(Repository repository, UserAuthentication userAuthentication) {
        super(repository, userAuthentication);
    }

    public MenuProvider getMenu() {
        MenuProvider menuProvider = super.getMenu();
        isGetMenuCalled = true;
        return menuProvider;
    }

    public boolean isGetMenuCalled() {
        return isGetMenuCalled;
    }
}
