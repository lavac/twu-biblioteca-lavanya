package com.twu.models;

import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.menu.CustomerMenu;
import com.twu.menu.MenuOptionProvider;
import com.twu.outputwriter.OutputWriter;

public class TestCustomerMenu extends CustomerMenu {

    private boolean isDisplayMenuCalled;
    private boolean isGetMenuOptionCalled;

    public TestCustomerMenu(Repository repository) {
        super(repository, new UserAuthentication());
    }

    public void displayMenu(OutputWriter writer) {
        super.displayMenu(writer);
        isDisplayMenuCalled = true;
    }

    public boolean isDisplayMenuCalled() {
        return isDisplayMenuCalled;
    }

    public MenuOptionProvider getMenuOption(String userInput) {
        MenuOptionProvider menuOptionProvider = super.getMenuOption(userInput);
        isGetMenuOptionCalled = true;
        return menuOptionProvider;
    }

    public boolean isGetMenuOptionCalled() {
        return isGetMenuOptionCalled;
    }
}
