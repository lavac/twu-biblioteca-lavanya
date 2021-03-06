package com.twu.menu;

import com.twu.outputwriter.OutputWriter;

import java.util.HashMap;
import java.util.Map;

public class Menu {
   private Map<String, MenuOptionProvider> menuOptions = null;

    public Menu() {
        menuOptions = new HashMap<>();
        makeMenu();
    }

    private void makeMenu() {
        menuOptions.put("1", new ListBooks());
        menuOptions.put("2", new CheckOut());
        menuOptions.put("3", new Return());
        menuOptions.put("4", new Quit());
    }

    public void displayMenu(OutputWriter writer) {
        for (Map.Entry<String, MenuOptionProvider> option : menuOptions.entrySet()) {
            MenuOptionProvider menuOption = option.getValue();
            writer.write(new Response(option.getKey() + " : " + menuOption.getMenuOption()));
        }
    }

    public MenuOptionProvider getMenuOption(String userInput){
        return menuOptions.getOrDefault(userInput, new InvalidOption());
    }

}
