package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;

public class CheckOutItem implements MenuOptionProvider {
    String type;

    public CheckOutItem(String type) {
        this.type = type;
    }

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader, OutputWriter writer) {
        writer.write(new Response("Enter the " + type + "name!"));
        String bookToBeCheckedOut = reader.read();
        return repository.checkOutItem(bookToBeCheckedOut, type);
    }

}
