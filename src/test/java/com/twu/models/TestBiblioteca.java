package com.twu.models;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.UserAuthentication;
import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;

public class TestBiblioteca extends Biblioteca {

    private boolean isBibliotecaStarted;
    private boolean isWelcomeMessageDisplayed;

    public TestBiblioteca(InputReader reader, OutputWriter writer) {
        super(reader, writer, new UserAuthentication());
    }

    public void start() {
        super.start();
        isBibliotecaStarted = true;
    }

    public void displayWelcomeMessage() {
        super.start();
        isWelcomeMessageDisplayed = true;
    }

    public boolean isBibliotecaStarted() {
        return isBibliotecaStarted;
    }

    public boolean isWelcomeMessageDisplayed() {
        return isWelcomeMessageDisplayed;
    }
}
