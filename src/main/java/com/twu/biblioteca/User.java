package com.twu.biblioteca;


public class User {
    private boolean isAdmin;
    String libraryNumber;
    public String name;
    String email;
    String address;
    String phoneNumber;

    public User(String libraryNumber, String name, String email, String address, String phoneNumber, boolean isAdmin) {
        this.libraryNumber = libraryNumber;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.isAdmin = isAdmin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (isAdmin != user.isAdmin) return false;
        if (libraryNumber != null ? !libraryNumber.equals(user.libraryNumber) : user.libraryNumber != null)
            return false;
        if (name != null ? !name.equals(user.name) : user.name != null)
            return false;
        if (email != null ? !email.equals(user.email) : user.email != null)
            return false;
        if (address != null ? !address.equals(user.address) : user.address != null)
            return false;
        return phoneNumber != null ? phoneNumber.equals(user.phoneNumber) : user.phoneNumber == null;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    @Override
    public String toString() {
        return "Name :" + name + "\n" + "Email Id : " + email + "\n" + "Address : " + address
                + "\n" + "Phone No : " + phoneNumber + "\n";
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}

