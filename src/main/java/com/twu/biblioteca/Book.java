package com.twu.biblioteca;

public class Book implements Item {
    private String name;
    private String author;
    private int yearOfPublication;

    public Book(String name, String author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String toString() {
        return String.format("%-20s | %-18s | %s", name, author,
                             yearOfPublication
        );
    }

    @Override
    public boolean equals(Object obj) {
        Book book = (Book) obj;
        if (book instanceof Book && this.name == book.name)
            return true;
        return false;
    }

    public String getName() {
        return name;
    }
}
