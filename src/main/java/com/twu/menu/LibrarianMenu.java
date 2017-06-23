package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.outputwriter.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibrarianMenu extends MenuProvider {
    private List<String> menu;

    private Map<String, MenuOptionProvider> librarianMenuOptions = null;
    Repository repository;
    UserAuthentication userAuthentication;

    public LibrarianMenu(Repository repository, UserAuthentication userAuthentication) {
        this.repository = repository;
        this.userAuthentication = userAuthentication;
        librarianMenuOptions = new HashMap<>();
        menu = new ArrayList<>();
        librarianMenuOptions();
        makeLibrarianMenu();
    }

    private void librarianMenuOptions() {
        menu.add("1 : List checkedout books");
        menu.add("2 : List checkedout movies");
        menu.add("3 : logout");
        menu.add("q : Quit");

    }

    private void makeLibrarianMenu() {
        librarianMenuOptions.put("1", new ListCheckedOutItems("book"));
        librarianMenuOptions.put("2", new ListCheckedOutItems("movie"));
        librarianMenuOptions.put("3", new Logout(userAuthentication));
        librarianMenuOptions.put("q", new Quit());
    }

    public void displayMenu(OutputWriter writer) {
        super.displayMenu(writer, menu);
    }

    public MenuOptionProvider getMenuOption(String userInput) {
        return super.getMenuOption(userInput, librarianMenuOptions);
    }
}

