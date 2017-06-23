package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserTest {

    @Test
    public void shouldReturnLibraryNumber() {
        User user = new User("cus-1234", "lav", "lav@g.com", "mysore", "234567", false);
        String expectedLibraryNumber = "cus-1234";

        assertTrue(expectedLibraryNumber.equals(user.getLibraryNumber()));
    }

    @Test
    public void twoUsersWithSameCredentialShouldBeEqual() {
        User user1 = new User("cus-1234", "lav", "lav@g.com", "mysore", "234567", false);
        User user2 = new User("cus-1234", "lav", "lav@g.com", "mysore", "234567", false);

        assertEquals(user1, user2);
    }

    @Test
    public void shouldReturnUserInfoInStringFormat() {
        User user = new User("cus-1234", "lav", "lav@g.com", "mysore", "234567", false);
        String expectedString = "Name :lav\nEmail Id : lav@g.com\nAddress : mysore\nPhone No : 234567\n";

        assertEquals(expectedString, user.toString());
    }

    @Test
    public void librarianShouldBeAdmin() {
        User user = new User("lib-1234", "meg", "meg@g.com", "bijapur", "232362", true);

        assertTrue(user.isAdmin());
    }
}


