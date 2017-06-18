package com.twu.biblioteca;

import com.twu.constants.Status;
import java.util.*;
import static com.twu.constants.Constants.CHECK_OUT_FAILURE_MESSAGE;
import static com.twu.constants.Constants.CHECK_OUT_SUCCESS_MESSAGE;
import static com.twu.constants.Status.AVAILABLE;
import static com.twu.constants.Status.CHECKEDOUT;

public class BookInventory {
    private List<Book> availableBooks;
    private Map<Book, Status> bookRepository;
    private List<Book> books;

    public BookInventory() {
        bookRepository = new HashMap<>();
        makeAListOfBooks();
        books = new ArrayList<>();
        getBooks();
    }

    private void makeAListOfBooks() {
        bookRepository.put(new Book("2 States", "Chetan Bhagat", 2009), AVAILABLE);
        bookRepository.put(new Book("The Alchemist", "Poulo coehlo", 1999), AVAILABLE);
        bookRepository.put(new Book("Five point someone", "unknown", 2012), AVAILABLE);
    }

    public void getBooks() {
        books.add(new Book("2 States", "Chetan Bhagat", 2009));
        books.add(new Book("The Alchemist", "Poulo coehlo", 1999));
        books.add(new Book("Five point someone", "unknown", 2012));
    }

    public List<Book> getAvailableBooks() {
        availableBooks = new ArrayList<>();
        for (Map.Entry<Book, Status> entry : bookRepository.entrySet()) {
            if (AVAILABLE == entry.getValue()) {
                availableBooks.add(entry.getKey());
            }
        }
        return availableBooks;
    }

    public String checkOut(String bookName) {
        for (Book book : getAvailableBooks()) {
            if (book.getName().equals(bookName)) {
                setAvailabilityStatus(bookName);
                return CHECK_OUT_SUCCESS_MESSAGE;
            }
        }
        return CHECK_OUT_FAILURE_MESSAGE;
    }

    private void setAvailabilityStatus(String bookName) {
        for (Map.Entry<Book, Status> entry : bookRepository.entrySet()) {
            if (bookName.equals(entry.getKey().getName())) {
                entry.setValue(CHECKEDOUT);
            }
        }
    }
    
    List<Book> getAllBooks() {
        return books;
    }
}
