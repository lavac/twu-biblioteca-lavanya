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
    public Response executeMenuOption(BookInventory bookInventory, InputReader reader) {
        List<Book> books = bookInventory.getAvailableBooks();
        List<String> booksInStringForm = toStringForm(books);
        return new Response(booksInStringForm);
    }

    private List<String> toStringForm(List<Book> books) {
        List<String> stringForm = new ArrayList<>();
        stringForm.add(STRING_FORMAT);
        for (Book book : books)
            stringForm.add(book.toString());
        return stringForm;
    }

    public String getMenuOption() {
        return LIST_BOOK_MENU_OPTION;
    }
}
