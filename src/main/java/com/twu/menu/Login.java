package com.twu.menu;


import com.twu.biblioteca.*;
import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;

public class Login implements MenuOptionProvider {
    UserAuthentication userAuthentication;

    public Login(UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;

    }

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader, OutputWriter writer) {
        writer.write(new Response("Enter your library number!"));
        String libraryNumber = reader.read();
        writer.write(new Response("Enter the password!"));
        String password = reader.read();
        User user = userAuthentication.authenticate(libraryNumber, new Password(password));
        if (user != null)
            return new Response("Successfully logged in!\n");
        return new Response("Failed to login! Enter valid credentials!");
    }
}
