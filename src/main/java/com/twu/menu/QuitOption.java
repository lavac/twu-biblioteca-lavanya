package com.twu.menu;

import java.util.ArrayList;
import java.util.List;

public class QuitOption implements MenuOptionProvider {
    String menuOption = "Quit";
    private String QuitMessage = "Thank you for using biblioteca :)";


    @Override
    public List<String> executeMenuOption() {
        List<String> list = new ArrayList<>();
        list.add(QuitMessage);
        return list;
    }

    @Override
    public String getMenuOption() {
        return menuOption;
    }
}
