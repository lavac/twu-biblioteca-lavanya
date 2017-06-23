package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;

public interface MenuOptionProvider {
    Response executeMenuOption(Repository repository, InputReader reader, OutputWriter writer);
}
