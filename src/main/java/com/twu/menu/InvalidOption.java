package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;

import static com.twu.constants.Constants.INVALID_OPTION_MESSAGE;

public class InvalidOption implements MenuOptionProvider {

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader, OutputWriter writer) {
        return new Response(INVALID_OPTION_MESSAGE);
    }
}
