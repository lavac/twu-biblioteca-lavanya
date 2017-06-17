package com.twu.menu;

import java.util.HashMap;
import java.util.Map;

public class Menu {
   private Map<String, MenuOptionProvider> menuOptions = null;

    public Menu() {
        menuOptions = new HashMap<>();
        makeMenu();
    }

    private void makeMenu() {
        menuOptions.put("1", new ListBookOption());
        menuOptions.put("2", new QuitOption());
    }

    public Map<String, MenuOptionProvider> getMenu() {
        return menuOptions;
    }

}
