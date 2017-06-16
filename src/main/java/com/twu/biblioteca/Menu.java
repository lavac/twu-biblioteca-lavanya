package com.twu.biblioteca;

import com.twu.outputwriter.OutputWriter;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    List<String> menuOptions;

    Menu() {
        menuOptions = new ArrayList<>();
        makeMenu();
    }

    private void makeMenu() {
        menuOptions.add("List books");
    }


    public void displayMenu(OutputWriter writer) {
        for(String option : menuOptions)
        writer.write(option);
    }

}
