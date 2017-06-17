package com.twu.menu;

import java.util.ArrayList;
import java.util.List;

public class InvalidMenuOption implements MenuOptionProvider {
    private List<String> InvalidOption = new ArrayList<>();
    String invalidOption = "Invalid Option, please choose correct option";

    @Override
    public List<String> executeMenuOption() {
        InvalidOption.add(invalidOption);
        return InvalidOption;
    }

    @Override
    public String getMenuOption() {
        return null;
    }

}
