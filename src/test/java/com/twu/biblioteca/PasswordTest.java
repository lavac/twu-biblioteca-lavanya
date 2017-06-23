package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PasswordTest {
    @Test
    public void shouldGetPassword() {
        Password password = new Password("lav");
        String expectedPassword = "lav";

        assertEquals(expectedPassword, (password.getPassword()));
    }

    @Test
    public void twoInstanceOfPasswordsWithSamePasswordValuesShouldBeSame() {
        Password password1 = new Password("meg");
        Password password2 = new Password("meg");

        assertEquals(password1, password2);
    }
}
