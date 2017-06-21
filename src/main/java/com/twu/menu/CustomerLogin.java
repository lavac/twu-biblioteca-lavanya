package com.twu.menu;


import com.twu.biblioteca.Password;
import com.twu.biblioteca.Repository;
import com.twu.biblioteca.User;
import com.twu.biblioteca.UserAuthentication;
import com.twu.inputReader.InputReader;

public class Login implements MenuOptionProvider {
    @Override
    public Response executeMenuOption(Repository repository, InputReader reader) {
        UserAuthentication userAuthentication = new UserAuthentication();
        String libraryNumber = reader.read();
        String password = reader.read();
        User user = userAuthentication.authenticate(libraryNumber, new Password(password));
        return null;
    }
}
