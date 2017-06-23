package com.twu.menu;

import com.twu.biblioteca.QuitProgramException;
import com.twu.biblioteca.Repository;
import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;

public class Quit implements MenuOptionProvider {

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader, OutputWriter writer) {
        throw new QuitProgramException();
    }
}
