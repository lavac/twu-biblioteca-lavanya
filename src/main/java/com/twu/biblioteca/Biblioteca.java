package com.twu.biblioteca;

public class Biblioteca {

    public void startBiblioteca() {
        String welcomeMessage = getWelcomeMessage();
        System.out.println(welcomeMessage);
    }

    public String getWelcomeMessage() {
        String welcomeMessage = "Hi, Welcome to Biblioteca ...";
        return welcomeMessage;
    }
}
