package com.twu.biblioteca;

import java.util.LinkedHashMap;
import java.util.Map;

public class LibraryItem {
    Item item;
    String type;

    LibraryItem(Item item, String type) {
        this.item = item;
        this.type = type;
    }

    public Item getItem() {
        return item;
    }

    public String getType() {
        return type;
    }
}
