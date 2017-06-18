package com.twu.menu;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookInventory;
import com.twu.inputReader.InputReader;

import java.util.ArrayList;
import java.util.List;

import static com.twu.constants.Constants.LIST_BOOK_MENU_OPTION;
import static com.twu.constants.Constants.STRING_FORMAT;

public class ListBooks implements MenuOptionProvider {

    @Override
    public Output executeMenuOption(BookInventory bookInventory, InputReader reader) {
        List<Book> books = bookInventory.getAvailableBooks();
        List<String> stringOfList = toStringList(books);
        return new Output(stringOfList);
    }

    public List<String> toStringList(List<Book> books) {
        List<String> stringList = new ArrayList<>();
        stringList.add(STRING_FORMAT);
        for (Book book : books)
            stringList.add(book.toString());
        return stringList;
    }

    public String getMenuOption() {
        return LIST_BOOK_MENU_OPTION;
    }
}
