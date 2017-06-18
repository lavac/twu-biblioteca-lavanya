package com.twu.biblioteca;

import com.twu.constants.Status;
import com.twu.menu.Response;
import java.util.*;
import static com.twu.constants.Constants.*;
import static com.twu.constants.Status.AVAILABLE;
import static com.twu.constants.Status.CHECKEDOUT;

public class BookInventory {
    private Map<Book, Status> bookRepository;
    private List<Book> availableBooks;
    private List<Book> books;

    public BookInventory() {
        bookRepository = new LinkedHashMap<>();
        books = new ArrayList<>();
        makeRepository();
        makeAListOfBooks();
    }

    private void makeRepository() {
        bookRepository.put(new Book("2 States", "Chetan Bhagat", 2009), AVAILABLE);
        bookRepository.put(new Book("The Alchemist", "Poulo coehlo", 1999), AVAILABLE);
        bookRepository.put(new Book("Five point someone", "Chetan Bhagat", 2012), AVAILABLE);
    }

    private void makeAListOfBooks() {
        for (Map.Entry<Book, Status> entry : bookRepository.entrySet()) {
            books.add(entry.getKey());
        }
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

    List<Book> getAllBooks() {
        return books;
    }

    public Response checkOut(String bookName) {
        for (Book book : getAvailableBooks()) {
            if (book.getName().equals(bookName)) {
                setAvailabilityStatus(bookName, CHECKEDOUT);
                return new Response(CHECK_OUT_SUCCESS_MESSAGE);
            }
        }
        return new Response(CHECK_OUT_FAILURE_MESSAGE);
    }

    public Response returnBook(String bookName) {
        for (Map.Entry<Book, Status> entry : bookRepository.entrySet()) {
            if (bookName.equals(entry.getKey().getName()) && entry.getValue() == CHECKEDOUT) {
                setAvailabilityStatus(bookName, AVAILABLE);
                return new Response(RETURN_SUCCESS_MESSAGE);
            }
        }
        return new Response(RETURN_FAILURE_MESSAGE);
    }

    private void setAvailabilityStatus(String bookName, Status status) {
        for (Map.Entry<Book, Status> entry : bookRepository.entrySet()) {
            if (bookName.equals(entry.getKey().getName())) {
                entry.setValue(status);
            }
        }
    }
}
