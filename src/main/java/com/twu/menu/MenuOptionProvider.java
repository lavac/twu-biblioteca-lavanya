package com.twu.menu;

import java.util.List;

public interface MenuOptionProvider {
    List<String> executeMenuOption();
    String getMenuOption();
}
