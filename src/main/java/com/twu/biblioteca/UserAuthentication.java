package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class UserAuthentication {
    List<UserCredentials> userCredentials;
    private User user;

    public UserAuthentication() {
        initializeUsers();
    }

    private void initializeUsers() {
        userCredentials = new ArrayList<>();

        userCredentials.add(new UserCredentials(new User("cus-1234", "lav", "lav@g.com", "mysore", "234567", false), new Password("lav")));
        userCredentials.add(new UserCredentials(new User("cus-2345", "shar", "shar@g.com", "udupi", "232367", false), new Password("shar")));
        userCredentials.add(new UserCredentials(new User("lib-1234", "meg", "meg@g.com", "bijapur", "232362", true), new Password("meg")));
    }

    public User getUser() {
        return user;
    }

    public User authenticate(String libraryNumber, Password password) {
        for (UserCredentials userCredentials : userCredentials) {
            if (userCredentials.areCredentialsSameAs(libraryNumber, password)) {
                this.user = userCredentials.getUser();
                return userCredentials.getUser();
            }
        }
        return null;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void logOut() {
        this.user = null;
    }

    private class UserCredentials {
        private User user;
        private Password password;

        public User getUser() {
            return user;
        }

        public UserCredentials(User user, Password password) {
            this.user = user;
            this.password = password;
        }

        private boolean areCredentialsSameAs(String libraryNumber, Password password) {
            if (user.getLibraryNumber().equals(libraryNumber)) {
                return this.password.getPassword().equals(password.getPassword());
            }
            return false;
        }
    }
}
