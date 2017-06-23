package com.twu.menu;

import com.twu.outputwriter.OutputWriter;

import java.util.List;
import java.util.Map;

public abstract class MenuProvider {

    public void displayMenu(OutputWriter writer, List<String> menu) {
        for (String option : menu) {
            writer.write(new Response(option));
        }
    }

    public abstract MenuOptionProvider getMenuOption(String userInput);

    public MenuOptionProvider getMenuOption(String userInput, Map<String, MenuOptionProvider> menuOptions) {
        return menuOptions.getOrDefault(userInput, new InvalidOption());
    }

    public abstract void displayMenu(OutputWriter writer);
}
