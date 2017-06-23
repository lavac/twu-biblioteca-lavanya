package com.twu.models;

import com.twu.biblioteca.LibrarySystem;
import com.twu.biblioteca.UserAuthentication;
import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;

public class TestLibrarySystem extends LibrarySystem {

    private boolean isMenuDisplayed;

    public TestLibrarySystem(InputReader reader, OutputWriter writer) {
        super(reader, writer, new UserAuthentication());
    }

    public void displayUserOptions() {
        super.displayUserOptions();
        isMenuDisplayed = true;
    }

    public boolean isMenuDisplayed() {
        return isMenuDisplayed;
    }

}
