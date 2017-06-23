package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.outputwriter.OutputWriter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneralMenu extends MenuProvider {
    UserAuthentication userAuthentication;
    private List<String> menu;
    private Map<String, MenuOptionProvider> GeneralMenuOptions;
    Repository repository;

    public GeneralMenu(Repository repository, UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
        this.repository = repository;
        menu = new ArrayList<>();
        GeneralMenuOptions = new HashMap<>();
        GeneralMenuOptions();
        makeMenu();
    }

    private void GeneralMenuOptions() {
        menu.add("1 : Login");
        menu.add("2 : List Books");
        menu.add("3 : List Movies");
        menu.add("q : Quit");
    }

    private void makeMenu() {
        GeneralMenuOptions.put("1", new Login(userAuthentication));
        GeneralMenuOptions.put("2", new ListItems("book"));
        GeneralMenuOptions.put("3", new ListItems("movie"));
        GeneralMenuOptions.put("q", new Quit());
    }

    public void displayMenu(OutputWriter writer) {
        super.displayMenu(writer, menu);
    }

    public MenuOptionProvider getMenuOption(String userInput) {
        return super.getMenuOption(userInput, GeneralMenuOptions);
    }
}
