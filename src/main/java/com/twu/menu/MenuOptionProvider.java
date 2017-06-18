package com.twu.menu;

import com.twu.biblioteca.BookInventory;
import com.twu.inputReader.InputReader;

public interface MenuOptionProvider {
    Response executeMenuOption(BookInventory bookInventory, InputReader reader);
    String getMenuOption();
}
