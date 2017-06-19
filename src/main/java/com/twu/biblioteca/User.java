package com.twu.biblioteca;


public class User {
    String libraryNumber;
    String name;
    String email;
    String address;
    String phoneNumber;

    public User(String libraryNumber, String name, String email, String address, String phoneNumber) {
        this.libraryNumber = libraryNumber;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    boolean hasSameLibraryNumber(String libraryNumber) {
        return libraryNumber.equals(libraryNumber);
    }

    String getLibraryNumber() {
        return libraryNumber;
    }

    @Override
    public String toString() {
        return name+"";
    }
}
