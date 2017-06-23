package com.twu.menu;

import com.twu.biblioteca.Item;
import com.twu.biblioteca.Repository;
import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;

import java.util.ArrayList;
import java.util.List;

import static com.twu.constants.Constants.STRING_FORMAT_BOOK;
import static com.twu.constants.Constants.STRING_FORMAT_MOVIE;

public class ListItems implements MenuOptionProvider {

    String type;

    ListItems(String type) {
        this.type = type;
    }

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader, OutputWriter writer) {
        List<Item> books = repository.getItems(type);
        List<String> booksInStringForm = toStringForm(books);
        return new Response(booksInStringForm);
    }

    private List<String> toStringForm(List<Item> items) {
        List<String> stringForm = new ArrayList<>();
        if (type == "book")
            stringForm.add(STRING_FORMAT_BOOK);
        else
            stringForm.add(STRING_FORMAT_MOVIE);
        for (Item item : items)
            stringForm.add(item.toString());
        return stringForm;
    }
}
