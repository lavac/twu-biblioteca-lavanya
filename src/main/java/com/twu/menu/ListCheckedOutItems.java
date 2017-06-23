package com.twu.menu;

import com.twu.biblioteca.Item;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.User;
import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ListCheckedOutItems implements MenuOptionProvider {

    String type;

    ListCheckedOutItems(String type) {
        this.type = type;
    }

    private final String FORMAT = String.format("%-20s  -20s", type + "User");

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader, OutputWriter writer) {
        Map<Item, User> items = repository.getCheckedOutItems(type);
        List<String> itemsInStringForm = toStringForm(items);
        return new Response(itemsInStringForm);
    }

    private List<String> toStringForm(Map<Item, User> items) {
        List<String> stringForm = new ArrayList<>();
        if(items.size() == 0)
            stringForm.add("No checked out Items!");
        else {
            stringForm.add(type + "\t\t\t\t User");
            for (Map.Entry<Item, User> entry : items.entrySet()) {
                stringForm.add(entry.getKey().getName() + "  " + entry.getValue().getLibraryNumber());
            }
        }
        return stringForm;
    }
}

















