package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.inputReader.InputReader;

public interface MenuOptionProvider {
    Response executeMenuOption(Repository repository, InputReader reader);
    String getMenuOption();
}
