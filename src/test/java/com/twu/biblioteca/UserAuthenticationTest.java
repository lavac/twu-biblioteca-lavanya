package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;

public class UserAuthenticationTest {

    @Test
    public void registeredCustomerShouldBeAbleToLogIn() {
        UserAuthentication userAuthentication = new UserAuthentication();
        User user = new User("cus-1234", "lav", "lav@g.com", "mysore", "234567", false);
        Password password = new Password("lav");

        assertEquals(user, userAuthentication.authenticate("cus-1234", password));
    }

    @Test
    public void unRegisteredCustomerShouldNotBeAbleToLogIn() {
        UserAuthentication userAuthentication = new UserAuthentication();
        User user = new User("cus-1234", "lav", "lav@g.com", "mysore", "234567", false);
        Password password = new Password("wrong");

        assertFalse(user.equals(userAuthentication.authenticate("cus-1234", password)));
    }

    @Test
    public void librarianShouldBeAbleToLogIn() {
        UserAuthentication userAuthentication = new UserAuthentication();
        Password password = new Password("meg");

        assertNotEquals(null, userAuthentication.authenticate("lib-1234", password));
    }

    @Test
    public void shouldNotBeAbleToLoginWithWrongCredentials() {
        UserAuthentication UserAuthentication = new UserAuthentication();
        Password password = new Password("megh");

        assertEquals(null, UserAuthentication.authenticate("lib-1234", password));
    }
}
