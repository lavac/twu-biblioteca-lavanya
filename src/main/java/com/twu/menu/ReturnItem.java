package com.twu.menu;


import com.twu.biblioteca.Repository;
import com.twu.inputReader.InputReader;

public class ReturnBook implements MenuOptionProvider {

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader) {
        String bookToBeReturned = reader.read();
        return repository.returnItem(bookToBeReturned, "Book",null);
    }
}
