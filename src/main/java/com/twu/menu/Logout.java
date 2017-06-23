package com.twu.menu;

import com.twu.biblioteca.Repository;
import com.twu.biblioteca.UserAuthentication;
import com.twu.inputReader.InputReader;
import com.twu.outputwriter.OutputWriter;

public class Logout implements MenuOptionProvider {
    UserAuthentication userAuthentication;

    public Logout(UserAuthentication userAuthentication) {
        this.userAuthentication = userAuthentication;
    }

    @Override
    public Response executeMenuOption(Repository repository, InputReader reader, OutputWriter writer) {
        userAuthentication.logOut();
        return new Response("Successfully logged out!\n");
    }
}
