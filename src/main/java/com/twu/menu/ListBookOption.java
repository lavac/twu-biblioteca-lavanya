package com.twu.menu;

import com.twu.biblioteca.Book;
import com.twu.biblioteca.BookInventory;
import java.util.ArrayList;
import java.util.List;

public class ListBookOption implements MenuOptionProvider {
    String menuOption = "ListBooks";
    final static String stringFormat = String.format("%-20s  %-20s %s", "Name",
                                                     "Author",
                                                     "YOP"
    );

    @Override
    public List<String> executeMenuOption() {
        BookInventory bookInventory = new BookInventory();
        List<Book> books = bookInventory.getBooks();
        return toStringList(books);
    }

    public List<String> toStringList(List<Book> books) {
        List<String> stringList = new ArrayList<>();
        stringList.add(stringFormat);
        for (Book book : books)
            stringList.add(book.toString());
        return stringList;
    }

    public String getMenuOption() {
        return menuOption;
    }
}
