package com.twu.menu;


import com.twu.biblioteca.Repository;
import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;

public class ReturnItem implements MenuOptionProvider {

    String type;

    public ReturnItem(String type) {
        this.type = type;
    }

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader, OutputWriter writer) {
        writer.write(new Response("Enter the " + type + "name!"));
        String bookToBeReturned = reader.read();
        return repository.returnItem(bookToBeReturned, type);
    }
}
