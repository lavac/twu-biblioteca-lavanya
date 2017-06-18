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
        menuOptions.put("3", new Quit());
    }

    public MenuOptionProvider getMenuOption(String userInput){
        return menuOptions.getOrDefault(userInput, new InvalidOption());
    }

     public void displayMenu(OutputWriter writer) {
        for (Map.Entry<String, MenuOptionProvider> option : menuOptions.entrySet()) {
            MenuOptionProvider menuOption = option.getValue();
            writer.write(new Output(option.getKey() + " : " + menuOption.getMenuOption()));
        }
    }

}
