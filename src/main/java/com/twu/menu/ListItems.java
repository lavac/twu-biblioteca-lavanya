package com.twu.menu;

import com.twu.biblioteca.Item;
import com.twu.biblioteca.Repository;
import com.twu.inputReader.InputReader;
import java.util.ArrayList;
import java.util.List;
import static com.twu.constants.Constants.LIST_BOOK_MENU_OPTION;
import static com.twu.constants.Constants.STRING_FORMAT;

public class ListBooks implements MenuOptionProvider {

    String type;
    ListBooks(String type) {
        this.type = type;
    }

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader) {
        List<Item> books = repository.getItems("Book");
        List<String> booksInStringForm = toStringForm(books);
        System.out.println(booksInStringForm);
        return new Response(booksInStringForm);
    }

    private List<String> toStringForm(List<Item> books) {
        List<String> stringForm = new ArrayList<>();
        stringForm.add(STRING_FORMAT);
        for (Item book : books)
            stringForm.add(book.toString());
        return stringForm;
    }

}
