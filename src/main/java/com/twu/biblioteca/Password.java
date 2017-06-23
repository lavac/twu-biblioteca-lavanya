package com.twu.biblioteca;

public class Password {

    String password;

    public Password(String password) {
        this.password = password;
    }

    String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Password password1 = (Password) o;

        return password != null ? password.equals(password1.password) : password1.password == null;
    }
}
