package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;
    private int yearOfPublication;

    public Book(String name, String author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return String.format("%-20s | %-20s | %s", name, author,
                             yearOfPublication
        );
    }

    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (this.name == book.name)
            return true;
        return false;
    }

    public String getName() {
        return name;
    }
}
