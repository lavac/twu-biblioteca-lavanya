package com.twu.biblioteca;

public class Book {
    String name;

    Book(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (this.name == book.name)
            return true;
        return false;
    }
}
