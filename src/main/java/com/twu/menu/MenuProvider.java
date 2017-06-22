package com.twu.menu;

import com.twu.outputwriter.OutputWriter;

/**
 * Created by lavanya on 6/21/17.
 */
public interface MenuProvider {
    void displayMenu(OutputWriter writer);

    MenuOptionProvider getMenuOption(String userInput);
}
