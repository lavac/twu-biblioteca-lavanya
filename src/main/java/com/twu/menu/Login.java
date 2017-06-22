package com.twu.menu;


import com.twu.biblioteca.*;
import com.twu.inputReader.InputReader;

public class CustomerLogin implements MenuOptionProvider {

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader) {
        UserAuthentication userAuthentication = new UserAuthentication();
        String libraryNumber = reader.read();
        String password = reader.read();
        User user = userAuthentication.authenticate(libraryNumber, new Password(password));
        if(user != null) {
            UserSession.setCurrentUser(user);
            UserSession.setType("Customer");
            return new Response("Successfully logged in");
        }
        return new Response("Failed to log in");
    }
}
