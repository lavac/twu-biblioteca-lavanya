package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaTest {

    @Test
    public void shouldGetWelcomeMessage() {
        String expectedMessage = "Hi, Welcome to Biblioteca ...";
        Biblioteca biblioteca = new Biblioteca();
        assertEquals(expectedMessage, biblioteca.getWelcomeMessage());
    }
}
